package com.example.demo.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private final Logger logger = Logger.getLogger(getClass());
  @Autowired
  DiscoveryClient discoveryClient;
  @RequestMapping(value="/index",method=RequestMethod.GET)
  public Object index(HttpServletRequest request){
	  ServiceInstance instance = discoveryClient.getLocalServiceInstance();
	  logger.info("/hello：host:"+instance.getHost()+" port:"+instance.getPort()
      +" service_id:"+instance.getServiceId());
		  return "qqq";
  }
}
