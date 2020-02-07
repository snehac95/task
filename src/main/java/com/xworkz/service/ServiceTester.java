package com.xworkz.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.service.entity.ValentineEntity;
import com.xworkz.service.service1.ValentineService;

public class ServiceTester {
	public static void main(String[] args) {
		try {
			ApplicationContext container=new ClassPathXmlApplicationContext("context.xml");
			ValentineService ref=container.getBean(ValentineService.class);
			ValentineEntity entity=new ValentineEntity();
			entity.setId(1);
			entity.setName("sss");
			entity.setStatus("comit");
			entity.setGift("rtrer");
			
			
			ref.validateAndsave(entity);
			
			} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
