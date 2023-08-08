package com.taskTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskTracker.entity.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, String>{
	
}
