package com.altimetrik.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.demo.entity.BusDetails;
import com.altimetrik.demo.exception.RecordNotFoundException;
import com.altimetrik.demo.repository.BusDetailsRepository;
import com.altimetrik.demo.service.BusDetailsService;

@RestController
@RequestMapping("/api")
public class BusDetailsController {

	@Autowired
	private BusDetailsRepository busDetailsRespository;

    @Autowired
    private BusDetailsService busDetailsService;
    
    @GetMapping("/buses")
    public List<BusDetails> index() {
        return  busDetailsService.getAllBuses();
    }

    @GetMapping("/showBuses")
    public List<BusDetails> findBuses(@RequestParam String name) {
        List<BusDetails> buses = busDetailsService.findBusTravelsName(name);
        return buses;
    }
    
    @PostMapping("/buses/availablity")
    public List<BusDetails> findBusAvailablity(@RequestBody HashMap<String, Object> body) {  
    	//body.forEach((key,value)->System.out.println(key+" - "+value));
        List<BusDetails> buses = busDetailsService.findBusAvailablity(body);
        return buses;
    }
    
    //Search
    @PostMapping("/buses/search")
    public List<BusDetails> getSearchBuses(@RequestBody Map<String, String> body) {
    	String searchTerm = body.get("text");
    	//System.out.println("Search value : " + searchTerm);
        List<BusDetails> buses = busDetailsRespository.findByTravelsNameContaining(searchTerm);
        return buses;
    }
    
    //Save
    @PostMapping("/buses")
    public BusDetails create(@RequestBody BusDetails bus) {
    	//bus.setBusNo(bus.getBusNo());
    	//System.out.println("Search value : " + bus.getBusNo());
        return busDetailsRespository.save(bus);
    }

    //Single
	@GetMapping("/buses/{bus_id}")
	public BusDetails findByBusId(@PathVariable("bus_id") Long busId) throws RecordNotFoundException {
        Optional<BusDetails> bus = busDetailsRespository.findById(busId);
        
        if(bus.isPresent()) {
            return bus.get();
        } else {
            throw new RecordNotFoundException("No bus record exist for given id",busId);
        }		
	}
	
	//Update
	@PutMapping("/buses/{bus_id}")
	public BusDetails update(@PathVariable("bus_id") Long busId, @Valid @RequestBody BusDetails busObject) throws RecordNotFoundException {
		Optional<BusDetails> bus = busDetailsRespository.findById(busId);
		if(bus.isPresent()) {	 
			BusDetails newEntity = bus.get();
            newEntity.setBusNo(busObject.getBusNo());
            newEntity.setTravelsName(busObject.getTravelsName());
            newEntity.setPrice(busObject.getPrice());
            newEntity.setDuration(busObject.getDuration());
            return busDetailsRespository.save(newEntity);
        } else {
            throw new RecordNotFoundException("No bus record exist for given id",busId);
        }
	}
    
	//Delete
	@DeleteMapping("/buses/{bus_id}")
	public List<BusDetails> delete(@PathVariable("bus_id") Long busId) {
        Optional<BusDetails> bus = busDetailsRespository.findById(busId);
        if(bus.isPresent()) {
        	busDetailsRespository.deleteById(busId);
            return busDetailsRespository.findAll();
        } else {
            throw new RecordNotFoundException("No bus record exist for given id",busId);
        }
	}

}