package com.spring.CRUD.operation.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.CRUD.operation.bindings.Passenger;
import com.spring.CRUD.operation.bindings.Ticket;
import com.spring.CRUD.operation.serviee.TicketService;

@RestController
public class TicketRestComntroller {

	@Autowired
	private TicketService service;
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookTicket( @RequestBody Passenger p){
	Ticket ticket = service.bookedTicket(p);
	return new ResponseEntity<>(ticket , HttpStatus.CREATED);
	}
	
	@GetMapping("/tickets")
	public ResponseEntity<Collection<Ticket>> getTickets(){
		Collection<Ticket> allTickets = service.getAllTickets();
		return new ResponseEntity<>( allTickets , HttpStatus.OK);
	}
}
