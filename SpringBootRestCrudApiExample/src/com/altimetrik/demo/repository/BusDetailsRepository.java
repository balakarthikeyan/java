package com.altimetrik.demo.repository;

import java.util.List;
import java.util.HashMap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altimetrik.demo.entity.BusDetails;
import com.altimetrik.demo.repository.BusDetailsRepositoryCustom;

@Repository
public interface BusDetailsRepository extends JpaRepository<BusDetails, Long>, BusDetailsRepositoryCustom {

	// custom query to search bus by travels Custom JPA Queries
	public List<BusDetails> findByTravelsNameContaining(String text);

	// custom query to search bus by travels JPQL with parameters
	@Query(value = "SELECT * FROM bus_details AS p WHERE LOWER(p.travels_name) LIKE %:name% ", nativeQuery = true)
	public List<BusDetails> findBusTravelsName(@Param("name") String name);

	// custom criteria
	public List<BusDetails> findBusAvailablity(HashMap<String, Object> conditions);

}
