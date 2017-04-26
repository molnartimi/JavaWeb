package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Book implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	
	@NotNull
	private String title;
	
	@NotNull
	private String author;
	
	private String description;
	
}
