package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.data.annotation.Id;


import java.time.Instant;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)





public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String leu;
    private Instant date;
    
	public Event(Long id, String titre, String leu, Instant date) {
		super();
		this.id = id;
		this.titre = titre;
		this.leu = leu;
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getLeu() {
		return leu;
	}
	public void setLeu(String leu) {
		this.leu = leu;
	}
	public Instant getDate() {
		return date;
	}
	public void setDate(Instant date) {
		this.date = date;
	}
	
}
