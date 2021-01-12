package com.realestate.dao;

import com.realestate.entity.Grad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "grad", path = "grad")

public interface GradRepository extends JpaRepository<Grad,Integer> {
}
