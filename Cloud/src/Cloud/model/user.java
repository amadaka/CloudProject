package Cloud.model;

import java.io.Serializable;
import java.util.ArrayList;

import Cloud.data.userDAO;
import Cloud.model.user;

public class user implements Serializable {
	private static final long serialVersionUID = 3L;
	private int id_user;
	private String username;
	private String first_name;
	private String last_name;
	private String password;
	private String cpassword;
	private String role;
	private String phone;
	private String email;
	private String organization;
	
	public void setUser(String username,String first_name, String last_name, String password, String role, String phone,String email,String organization) {
		setUsername(username);
		setFirst_name(first_name);
		setLast_name(last_name);
		setPassword(password);
		setRole(role);
		setPhone(phone);
		setEmail(email);
		setOrganization(organization);
	}
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	private String validateUsername(String username) {
		String result="";
		boolean usernameinDB=userDAO.checkusername(username);
		if(!usernameinDB) {
			result="Username already exsits";
		}
		return result;
	}
	private String validateCpassword(String cpassword,String password) {
		String result="";
			if(!cpassword.equals(password)) {
				result="Passwords not matching";
			}
		return result;
	}
	public String validateUser(String action,user user) {
		String error="";
		if(action.equals("registerUser")) {
			System.out.println("9");
			error=validateUsername(user.getUsername());
			if(error.equals("")) {
				error=validateCpassword(user.getCpassword(),user.getPassword());
			}
		}
		else {//login
			boolean usernameinDB=userDAO.checkusername(user.getUsername());
			System.out.println("5");
			if(usernameinDB) {
				error="Username Does not exist";
			}
			else {
				ArrayList<user> UserinDB=new ArrayList<user>();
				UserinDB=userDAO.Searchusername(user.getUsername());
				user seluser=new user();
				seluser.setUser(UserinDB.get(0).getUsername(), UserinDB.get(0).getFirst_name(), UserinDB.get(0).getLast_name(), UserinDB.get(0).getPassword(), UserinDB.get(0).getRole(), UserinDB.get(0).getPhone(), UserinDB.get(0).getEmail(), UserinDB.get(0).getOrganization());
				if(!(user.getPassword().equals(seluser.getPassword()))) {
					 error="Wrong Password";
				}
				else {
					user.setUser(UserinDB.get(0).getUsername(), UserinDB.get(0).getFirst_name(), UserinDB.get(0).getLast_name(), UserinDB.get(0).getPassword(), UserinDB.get(0).getRole(), UserinDB.get(0).getPhone(), UserinDB.get(0).getEmail(), UserinDB.get(0).getOrganization());
					user.setId_user(UserinDB.get(0).getId_user());
				}
			}
			
		}
		return error;
	}
}
