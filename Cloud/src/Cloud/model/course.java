package Cloud.model;

import java.io.Serializable;

public class course implements Serializable {
	private static final long serialVersionUID = 3L;
	private int id_class;
	private String classname;
	private String pre;
	private String duration;
	private String specialization;
	private int idcreate;
	private String sdate;
	private String edate;
	private int teacherid;
	
	public void setCourse(int id_class,String classname,String pre,String duration,String specialization,int idcreate,String sdate,String edate,int teacherid) {
		setId_class(id_class);
		setClassname(classname);
		setEdate(edate);
		setTeacherid(teacherid);
		setSdate(sdate);
		setIdcreate(idcreate);
		setSpecialization(specialization);
		setDuration(duration);
		setPre(pre);
	}
	public void setCourse2(int id_class,String classname,String pre,String duration,String specialization) {
		setId_class(id_class);
		setClassname(classname);
		setSpecialization(specialization);
		setDuration(duration);
		setPre(pre);
	}
	
	
	public int getId_class() {
		return id_class;
	}
	public void setId_class(int id_class) {
		this.id_class = id_class;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public int getIdcreate() {
		return idcreate;
	}
	public void setIdcreate(int idcreate) {
		this.idcreate = idcreate;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getPre() {
		return pre;
	}
	public void setPre(String pre) {
		this.pre = pre;
	}

}
