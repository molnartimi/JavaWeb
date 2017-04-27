package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;

	private SubscriptionType type = SubscriptionType.NORMAL;

	@Size(min=5, max=50)
    private String name;

	private String passwd;
	private String email;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<Borrow> borrows;

	public Long getID() { return id; }

	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getPasswd(){
		return passwd;
	}
	
	public void setPasswd(String p){
		passwd = p;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String e){
		email = e;
	}
	
	public SubscriptionType getSubscriptionType(){
		return type;
	}
	
	public void setSubscriptionType(SubscriptionType t){
		type = t;
	}
}
