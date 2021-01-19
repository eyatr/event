package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Event;
import com.example.demo.services.EventService;

@RestController
@RequestMapping("/api/event")
@CrossOrigin
public class EventController {
	private final EventService eventService;

	@Autowired
	public EventController(EventService eventService) {
		super();
		this.eventService = eventService;
	}
	


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.eventService.delete(id);
    }

    @PutMapping
    public Event update(@RequestBody Event event) {
        return this.eventService.update(event);
    }

    @PostMapping
    public Event add(@RequestBody Event event) {
        return this.eventService.add(event);
    }
	
	

}
