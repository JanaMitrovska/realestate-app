package com.realestate.dao;

import com.realestate.entity.Slobodni_imoti;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface SlobodniRepository extends JpaRepository <Slobodni_imoti, Long> {
}
