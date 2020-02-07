package com.xworkz.service.service1;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.service.dao.ValentineDAO;
import com.xworkz.service.entity.ValentineEntity;
@Component
public class ValentineServiceImpl implements ValentineService {
	@Autowired
	private ValentineDAO dao;
	
	public ValentineServiceImpl() {
		System.out.println ("created \t"+this.getClass().getName());
	}

	public boolean validateAndsave(ValentineEntity entity) {
		System.out.println("validateAndsave"+entity);
		System.out.println("yet to validate");
		Integer id=dao.save(entity);
		if(Objects.nonNull(id)) {
			System.out.println("entity saved");
			return true;
		}
		System.out.println("entity not saved");
		
		return false;
	}
}
