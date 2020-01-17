package serialization;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable{
	
	public static final long serialVersionUID = 1L;
	 private String firstName; 
	 private String secondName;
	 private String lastName;
	 private int accountNumber;
	 private Date dateAccountOpened;
	 
	 public User(String firstName,String secondName,String lastName,int accountNumber,Date dateAccountOpen) {
		 super();
		 this.accountNumber = accountNumber;
		 this.dateAccountOpened = dateAccountOpen;
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.secondName = secondName;
	 }
	 public User() {
		 super();
	 }
	 
	

}
