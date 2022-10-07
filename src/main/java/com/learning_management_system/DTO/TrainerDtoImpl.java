package com.learning_management_system.DTO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning_management_system.entity.Trainer;

@Component
public class TrainerDtoImpl implements TrainerDto{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Trainer> getTrainers() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query<Trainer> query = session.createQuery("From Trainer", Trainer.class);
		System.out.println("Before qurey ----------......"+ query);
		List<Trainer> trainerList = query.list();
		session.getTransaction().commit();
		return trainerList;
	}

}
