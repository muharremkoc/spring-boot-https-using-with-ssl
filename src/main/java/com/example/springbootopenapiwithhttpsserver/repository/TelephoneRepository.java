package com.example.springbootopenapiwithhttpsserver.repository;

import com.example.springbootopenapiwithhttpsserver.model.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelephoneRepository extends JpaRepository<Telephone,Integer> {
}
