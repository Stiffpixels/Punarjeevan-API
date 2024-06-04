package com.punarjeevan.root.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.punarjeevan.root.model.Saves;

@RepositoryRestResource(collectionResourceRel="saves",path="saves")
public interface SavesRepo extends JpaRepository<Saves, Integer>{
	
}
