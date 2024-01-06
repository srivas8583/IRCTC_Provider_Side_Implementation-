package com.spring.CRUD.operation.serviee;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.spring.CRUD.operation.bindings.Passenger;
import com.spring.CRUD.operation.bindings.Ticket;
@Service
public class TicketServiceImpl implements TicketService {

	 Map<Integer, Ticket> db= new HashMap<>();// Store a ticket as a database .
	@Override
	public Ticket bookedTicket(Passenger p) {
		Ticket t =new Ticket();
		Random r = new Random();
		int id=r.nextInt(5);
		t.setNumber(id);
		
		BeanUtils.copyProperties(p, t); // Data present in passenger is copied in Ticket 
		
		t.setStatus("CONFIRMED");
		// TODO Auto-generated method stub
		
		db.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		  return db.values();
		
	}

}
