package com.urnotsally.demo_springboot.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Data
public class DemoBean {
	@Value("test!!!")
	private String data;

	private Map<String,String> map;

	private List<String> list;

	public DemoBean() {
		map = new HashMap<String, String>();
		map.put("MapA", "This is A");
		map.put("MapB", "This is B");
		map.put("MapC", "This is C");
		list = new ArrayList<String>();
		list.add("List0");
		list.add("List1");
		list.add("List2");
	}

	public String serviceMethod(){
		return "serviceMethod";
	}

	public String serviceMethodParam(String param){
		return param;
	}
}
