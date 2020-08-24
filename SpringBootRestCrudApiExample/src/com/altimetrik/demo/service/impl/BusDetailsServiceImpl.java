package com.altimetrik.demo.service.impl;

import java.util.List;
import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.altimetrik.demo.entity.BusDetails;
import com.altimetrik.demo.exception.RecordNotFoundException;
import com.altimetrik.demo.repository.BusDetailsRepository;
import com.altimetrik.demo.service.BusDetailsService;

@Service
public class BusDetailsServiceImpl implements BusDetailsService {

	@Autowired
	private BusDetailsRepository busDetailsRespository;
	
	public List<BusDetails> getAllBuses() throws RecordNotFoundException {
		List<BusDetails> buses = busDetailsRespository.findAll();
		// System.out.println(buses.size());
		if (buses.size() > 0) {
			return buses;
		} else {
			throw new RecordNotFoundException("No bus records");
		}
	}

	@Override
	public List<BusDetails> findBusTravelsName(String name) throws RecordNotFoundException {
		List<BusDetails> buses = busDetailsRespository.findBusTravelsName(name);
		// System.out.println(buses.size());
		if (buses.size() > 0) {
			return buses;
		} else {
			throw new RecordNotFoundException("No bus records");
		}
	}
	
	public List<BusDetails> findBusAvailablity(HashMap<String, Object> conditions) {
    	List<BusDetails> buses = busDetailsRespository.findBusAvailablity(conditions); 
    	return buses;   	
    }
}
