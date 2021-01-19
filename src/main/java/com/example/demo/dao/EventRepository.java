package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

	Event getById (Long Id);

}
