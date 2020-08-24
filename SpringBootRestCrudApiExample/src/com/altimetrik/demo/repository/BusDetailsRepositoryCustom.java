package com.altimetrik.demo.repository;

import java.util.List;
import java.text.ParseException;
import java.util.HashMap;
import com.altimetrik.demo.entity.BusDetails;
import com.altimetrik.demo.exception.RecordNotFoundException;

public interface BusDetailsRepositoryCustom {
	
	public List<BusDetails> findBusAvailablity(HashMap<String, Object> conditions) throws RecordNotFoundException, ParseException;
}
