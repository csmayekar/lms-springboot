package com.learning_management_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainer")
public class Trainer {

//	trainer_id, trainer_name, trainer_experience, trainer_address
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainer_id")
	private int trainerId;
	
	@Column(name = "trainer_name")
	private String trainerName;
	
	@Column(name = "trainer_experience")
	private int trainerExperience;
	
	@Column(name = "trainer_address")
	private String trainerAddress;
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public Trainer(int trainerId, String trainerName, int trainerExperience, String trainerAddress) {
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerExperience = trainerExperience;
		this.trainerAddress = trainerAddress;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerExperience="
				+ trainerExperience + ", trainerAddress=" + trainerAddress + "]";
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public int getTrainerExperience() {
		return trainerExperience;
	}

	public void setTrainerExperience(int trainerExperience) {
		this.trainerExperience = trainerExperience;
	}

	public String getTrainerAddress() {
		return trainerAddress;
	}

	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
}
