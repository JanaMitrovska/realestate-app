package com.realestate.dao;

import com.realestate.entity.Kupuvac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "kupuvac", path = "kupuvac")

public interface KupuvacRepository extends JpaRepository<Kupuvac,String> {
}
