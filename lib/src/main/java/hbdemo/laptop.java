package hbdemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class laptop {
	@ManyToOne
	private student s1;
	
	public student getS1() {
		return s1;
	}
	public void setS1(student s1) {
		this.s1 = s1;
	}
	@Id
  private int lid;
  public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
private String lname;
}
