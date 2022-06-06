package org.example.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_COUNTRY")
public class Country {
	
	@Id
	@GeneratedValue
	@Column(name = "COUNTRY_ID")
	private long countryId;
	
}
