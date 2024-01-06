package com.spring.CRUD.operation.serviee;

import java.util.Collection;
import java.util.List;

import com.spring.CRUD.operation.bindings.Passenger;
import com.spring.CRUD.operation.bindings.Ticket;

public interface TicketService {
	
	public Ticket bookedTicket(Passenger p);
	public Collection<Ticket>getAllTickets();

}
