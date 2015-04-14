package de.ostfalia.hausundhofag.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Immobilie")
public class Immobilie {
	
	@Id
	@GeneratedValue
	private int id;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
