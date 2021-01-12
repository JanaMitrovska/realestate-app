package com.realestate.dao;

import com.realestate.entity.Prodazna_kancelarija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "prodazna_kancelarija", path = "prodazna-kancelarija")

public interface ProdaznaKancelarijaRepository extends JpaRepository<Prodazna_kancelarija,Long> {
}
