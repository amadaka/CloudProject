package Cloud.model;

import java.io.Serializable;

public class reserve implements Serializable{
	private static final long serialVersionUID = 3L;
	private int id_user;
	private int idreserve;
	private int idcreate;
	
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getIdreserve() {
		return idreserve;
	}
	public void setIdreserve(int idreserve) {
		this.idreserve = idreserve;
	}
	public int getIdcreate() {
		return idcreate;
	}
	public void setIdcreate(int idcreate) {
		this.idcreate = idcreate;
	}

}
