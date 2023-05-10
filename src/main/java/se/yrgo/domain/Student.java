package se.yrgo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String enrollmentID;
    private String name;
    //@ManyToOne
    //@JoinColumn(name="TUTOR_FK")
    //private Tutor tutor; 

    public Student() {}
    
    public Student(String name) { //Tutor tutor
    	this.name = name;
    	//this.tutor = tutor;
    }

    //public Tutor getTutor() {
	//	return tutor;
//	}
  //  public Student(String name) {
    //	this.name = name;
    //	this.tutor = null;
    //}

    public int getId() {
    	return id;
    }
    
    //public void allocateTutor(Tutor tutor) {
    //	this.tutor=tutor;	
   // }
    	
   // public String getTutorName() {
    //	return this.tutor.getName();
    //}    

    public String toString() {
        return name;
    }
}