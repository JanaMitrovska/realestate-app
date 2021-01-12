package com.realestate.dao;

import com.realestate.entity.prodadeni_imoti;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "solds", path = "solds")
public interface ProdadeniRepository extends JpaRepository <prodadeni_imoti, Long> {
}
