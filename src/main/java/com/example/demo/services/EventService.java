package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EventRepository;

import com.example.demo.entities.Event;

@Service
public class EventService {
	private final EventRepository eventRepository;

	@Autowired
	public EventService(EventRepository eventRepository) {
		super();
		this.eventRepository = eventRepository;
	}
	
    public Event getById(Long id) {
        return this.eventRepository.getOne(id);
    }

    public Event add(Event event) {
        return this.eventRepository.save(event);
    }

    public Event update(Event event) {
        return this.eventRepository.saveAndFlush(event);
    }

    public void delete(Long id) {
        this.eventRepository.deleteById(id);
    }

}
