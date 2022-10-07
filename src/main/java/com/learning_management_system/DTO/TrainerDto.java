package com.learning_management_system.DTO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.learning_management_system.entity.Trainer;

@Repository
public interface TrainerDto {
	
	public List<Trainer> getTrainers();
}
