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

import org.hibernate.validator.constraints.Email;

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
	
	@NotNull
	private String passwd;
	
	@NotNull
	@Email
	private String email;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<Borrow> borrows;
	
	protected User() {}
	public User(String n, String p, String e){
		name = n;
		passwd = p;
		email = e;
	}
	
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
