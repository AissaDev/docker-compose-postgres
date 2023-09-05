package net.youssfi.springpostgresdocker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Event {
    @Id @GeneratedValue
    private Long id;
    private String name;
    
    
	public Event() {
		
	}
	public Event(Long id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
