package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	
	@NotNull
	private SubscriptionType type = SubscriptionType.NORMAL;
	
	@NotNull
    @Size(min=5, max=50)
    private String name;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<Loan> loans;
	
	
}
