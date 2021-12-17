package hbdemo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class student {
	@Id
  private int rollno;
  public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
private String name;
  private int marks;
  @OneToMany(mappedBy="s1")
  private java.util.List<laptop> l1 = new ArrayList<laptop>();
public java.util.List<laptop> getL1() {
	return l1;
}
public void setL1(java.util.List<laptop> l1) {
	this.l1 = l1;
}

}
