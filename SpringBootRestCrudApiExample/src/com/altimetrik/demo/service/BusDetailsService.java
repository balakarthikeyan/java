package com.altimetrik.demo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.altimetrik.demo.entity.BusDetails;
import com.altimetrik.demo.exception.RecordNotFoundException;

@Service
public interface BusDetailsService  {

	public List<BusDetails> getAllBuses() throws RecordNotFoundException;
	
	public List<BusDetails> findBusTravelsName(String name) throws RecordNotFoundException;
	
	public List<BusDetails> findBusAvailablity(HashMap<String, Object> conditions) throws RecordNotFoundException;
	
}
