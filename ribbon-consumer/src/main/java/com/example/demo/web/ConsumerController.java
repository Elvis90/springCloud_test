package com.example.demo.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.example.mapper.WisdomParkUserMapper;



/**
 * @author lxx
 * @version V1.0.0
 * @date 2017-8-9
 */

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    WisdomParkUserMapper wisdomParkUserMapper;
    @RequestMapping(value = "ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer(){
    	System.err.println("tttttttt");
    	HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("token", "eyJyYW5kb20iOiI4OTAzNDAiLCJ0b2tlbiI6IkkyUUZjVzRkVGVRVUdwZjJiY3U0WXlpUzF4RVJ3SmJUZmpJYWtYbUhiaEt3NUZfWHljR3VlaDN5SHpXSjV2akhpV3hGUV8tdVFqdUR6Um55cEJkQXlId19uTVRYdU1ndCJ9");
        requestHeaders.add("Content-Type", "application/json");
        JSONObject params = new JSONObject();
        JSONObject body = new JSONObject();
        try {
        	params.put("type", "1");
			params.put("userid", "13604");
			body.put("jsonrpc", "2.0");
			body.put("method", "webrpc");
			body.put("id", 1);
			body.put("params", params);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
        System.err.println("body==="+body.toJSONString());
        ServiceInstance service = discoveryClient.getInstances("V3").get(0);
        System.out.println(service.getUri()+"/upush/send");
	   HttpEntity<JSONObject> requestEntity = new HttpEntity<JSONObject>(body, requestHeaders);
        ResponseEntity<String> response = restTemplate.exchange(service.getUri()+"/upush/send", HttpMethod.POST, requestEntity, String.class);
        String sttr = response.getBody();
       return sttr;

//        return restTemplate.getForEntity("http://HELLO-SERVICE/index",
//                String.class).getBody();
    }
    
    @RequestMapping(value = "index/{id}", method = RequestMethod.GET)
    public Object index(@PathVariable("id")Long id){
    	System.err.println("qqq");
        return wisdomParkUserMapper.selectByPrimaryKey(id);
    }
}