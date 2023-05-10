package se.yrgo.test;

import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;

import se.yrgo.domain.Student;
import se.yrgo.domain.Tutor;

public class HibernateTest {

  private static SessionFactory sessionFactory = null;

  public static void main(String[] args) {

 /*
      
      Tutor newTutor = new Tutor("ABC234", "Natalie Woodward", 387787);
      Student student1 = new Student("Patrik Howard");
      Student student2 = new Student("Marie Sani");
      Student student3 = new Student("Tom Nikson");
      
      newTutor.addStudentToTeachingGroup(student1);
      newTutor.addStudentToTeachingGroup(student2);
      newTutor.addStudentToTeachingGroup(student3);
      
      List<Student>students = newTutor.getTeachingGroup();
      
      
      
      
      for(Student student: students) {
      System.out.println(student);
      
      }
        
     
   

      
    Student student4 = new Student("Julia Ericcson");
    
 */      
    SessionFactory sf = getSessionFactory();
    Session session = sf.openSession();
    /* 
    session.save(newTutor);
    session.save(student1);
     session.save(student2);
      session.save(student3);
    session.save(student4);

    */
    
    Tutor myTutor = (Tutor) session.get(Tutor.class, 28);

    
    List<Student> students = myTutor.getTeachingGroup();
    for (Student s : students) {
      System.out.println(s);
    }
    //myTutor.addStudentToTeachingGroup(student4);
     
  
 
  

    Transaction tx = session.beginTransaction();

    tx.commit();
    session.close();

  }

  private static SessionFactory getSessionFactory() {
    if (sessionFactory == null) {
      Configuration configuration = new Configuration();
      configuration.configure();

      sessionFactory = configuration.buildSessionFactory();
    }
    return sessionFactory;
  }

}