package com.xworkz.service.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.service.entity.ValentineEntity;
@Component
public class ValentineDAOImpl  implements ValentineDAO{
	
	public ValentineDAOImpl() {
		System.out.println("created\t"+this.getClass().getName());
	}

	public Integer save(ValentineEntity entity) {
		try {
			System.out.println("dao implement start");
			System.out.println(entity);
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(ValentineEntity.class);
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			session.beginTransaction();
			System.out.println("tx begin");
			System.out.println("data saving");
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("commited");
			System.out.println("all resources closed");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("invoke save in dao");
		//System.out.println("should impl hibernate");
		
		return null;
	}

}
