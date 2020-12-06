package Cloud.model;

import java.io.Serializable;

public class lecture implements Serializable{
	private static final long serialVersionUID = 3L;
	private int idlec;
	private int idcreate;
	private String date;
	private String link;
	private String name;
	
	
	public int getIdlec() {
		return idlec;
	}
	public void setIdlec(int idlec) {
		this.idlec = idlec;
	}
	public int getIdcreate() {
		return idcreate;
	}
	public void setIdcreate(int idcreate) {
		this.idcreate = idcreate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
