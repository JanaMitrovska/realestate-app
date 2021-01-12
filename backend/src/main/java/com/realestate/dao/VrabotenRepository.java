package com.realestate.dao;

import com.realestate.entity.Vraboten;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "vraboten", path = "vraboten")

public interface VrabotenRepository extends JpaRepository<Vraboten,String> {
}
