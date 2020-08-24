package com.altimetrik.demo.repository;

import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.altimetrik.demo.entity.BusDetails;
import com.altimetrik.demo.exception.RecordNotFoundException;

@Repository
public class BusDetailsRepositoryImpl implements BusDetailsRepositoryCustom {

	@PersistenceContext
	public EntityManager em;

	@SuppressWarnings("deprecation")
	public List<BusDetails> findBusAvailablity(HashMap<String, Object> conditions) throws RecordNotFoundException, ParseException {
		CriteriaBuilder criteriaBuilderObj = em.getCriteriaBuilder();
		CriteriaQuery<BusDetails> queryObj = criteriaBuilderObj.createQuery(BusDetails.class);
		Root<BusDetails> from = queryObj.from(BusDetails.class);

		List<Predicate> predicates = new ArrayList<>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date arrivalDate = null;	
		String arrivalTime = "";
		for (String key : conditions.keySet()) {
//			System.out.println("Key : " + key.toString() + " Value : " + conditions.get(key));
			if(key == "arrivalTime"){ 
				arrivalDate 	= simpleDateFormat.parse((String) conditions.get(key));
				arrivalTime 	= simpleDateFormat.format(arrivalDate);
//				System.out.println("arrivalString value : " + arrivalTime);
				break;
			}		
		}

		if(arrivalTime.equals("")){
			throw new RecordNotFoundException("Provide Arrival Time!!");
		}
		
		for (String field : conditions.keySet()) {
			Object value = conditions.get(field);
			switch (field) {
				case "travelsName":
					predicates.add(criteriaBuilderObj.like(from.get(field), "%" + (String) value + "%"));
					break;
				case "busNo":
					predicates.add(criteriaBuilderObj.like(from.get(field), "%" + (String) value + "%"));
					break;
				case "arrivalTime":
					predicates.add(criteriaBuilderObj.equal(from.get(field), arrivalTime));
					break;
				case "departureTime":
					Date departureDate = simpleDateFormat.parse((String) value);
					String departureTime = simpleDateFormat.format(departureDate);
//					System.out.println("departureTime before : " + departureTime);
					if(arrivalTime.equals(departureTime)) {
						Calendar cal = Calendar.getInstance();
						cal.setTime(arrivalDate);
						cal.add(Calendar.DATE, 1);
						departureTime = simpleDateFormat.format(cal.getTime());
//						System.out.println("departureTime after : " + departureTime);
					}
					predicates.add(criteriaBuilderObj.equal(from.get(field), departureTime));
					break;
			}
		}
		
		queryObj.select(from).where(predicates.toArray(new Predicate[predicates.size()]));
		
		TypedQuery<BusDetails> typedQuery = em.createQuery(queryObj);
		System.out.println(typedQuery.unwrap(org.hibernate.Query.class).getQueryString());
		List<BusDetails> results = typedQuery.getResultList();
		if (results == null || results.size() == 0) {
			 for(Object obj : results) {
				BusDetails emp = (BusDetails)obj;
				System.out.println(emp.toString());
			 }
			 return results;
		} else {
            throw new RecordNotFoundException("No buses available !!");
        }
	}

}
