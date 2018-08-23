package com.example.demo.web;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.WisdomParkUser;
import com.example.mapper.WisdomParkUserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class HelloController {
	private final Logger logger = Logger.getLogger(getClass());
  @Autowired
  DiscoveryClient discoveryClient;
  @Autowired
  WisdomParkUserMapper wisdomParkUserMapper;
  @RequestMapping(value="/index",method=RequestMethod.GET)
  public Object index(HttpServletRequest request){
	  ServiceInstance instance = discoveryClient.getLocalServiceInstance();
	  logger.info("/hello：host:"+instance.getHost()+" port:"+instance.getPort()
      +" service_id:"+instance.getServiceId());
		  return "qqq";
  }
  
  @RequestMapping(value="/getUserById/{userId}",method=RequestMethod.GET)
  public Object getUserById(@PathVariable("userId")Long userId, HttpServletRequest request){
	  logger.info("===getUserById====");
	 // return wisdomParkUserMapper.selectByPrimaryKey(userId);
	  return wisdomParkUserMapper.getresourceByUserId(userId);
  }
  
  @RequestMapping(value="/getUserBypage/{pagesize}/{pageno}",method=RequestMethod.GET)
  public Object getUserBypage(@PathVariable("pagesize")Integer pagesize, @PathVariable("pageno")Integer pageno,HttpServletRequest request){
	  logger.info("===getUserById====");
	  //1、设置分页信息，包括当前页数和每页显示的总计数
      PageHelper.startPage(pageno, pagesize);
      //2、执行查询
	  List<WisdomParkUser> list = wisdomParkUserMapper.selectAll();
	//3、获取分页查询后的数据
	  PageInfo<WisdomParkUser> pi = new PageInfo<>(list);
	  
	  HashMap<String, Object> map = new HashMap<>();
	  map.put("data", pi.getList());
	  map.put("maxcount", pi.getTotal());
	  return map;
  }
}
