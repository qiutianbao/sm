package com.jxtb.jpa.dao;

import com.jxtb.jpa.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CityRepository extends JpaRepository<City,Integer> {
}
