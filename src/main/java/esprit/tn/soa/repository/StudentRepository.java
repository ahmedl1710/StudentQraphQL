package esprit.tn.soa.repository;
import java.util.ArrayList;
import java.util.List;

import esprit.tn.soa.entity.*;

public class StudentRepository {
    private  List<Student> students;
   
    public StudentRepository() {
        students=new ArrayList<Student>();
        students.add(new Student("12345678", "Mohamed B.Med", "med@esprit.tn"));
        students.add(new Student("22551100", "Foulen B.Foulen", "foulen@esprit.tn"));

    }
   
    public List<Student> getAll(){
        return students;
    }
   
    public Student getById(String id){
        for (Student info:students) {
               if(info.getCin().equals(id)) {
                  return info;
                                         
               }
            }
        return null;    
    }
   
    public List<Student>  save(Student stud) {
        students.add(stud);
        return students;
    }
    public List<Student> delete(String id){
    	Student stud=getById(id);
    	students.remove(stud);
    	return students; 
    }
    public List<Student> upadateStud(String cin,String nombre,String email){
    	Student stud2= new Student(cin,nombre,email);
    	Student stud=getById(cin);
    	students.remove(stud);
    	students.add(stud2);
    	return students; 
    }
}