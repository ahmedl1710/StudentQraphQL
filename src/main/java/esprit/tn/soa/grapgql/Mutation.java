package esprit.tn.soa.grapgql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.tn.soa.entity.Student;
import esprit.tn.soa.repository.StudentRepository;

public class Mutation implements GraphQLRootResolver {
	private final StudentRepository studentRepository;
	
	
   public Mutation(StudentRepository studReporitory) {
		// TODO Auto-generated constructor stub
	   this.studentRepository = studReporitory;
	}
public List<Student> addStud(String cin, String nombre, String email) {
	   Student stud = new Student(cin,nombre,email);
	    studentRepository.save(stud);
	    return studentRepository.getAll(); 
   }
public List<Student> delete(String id){
	return studentRepository.delete(id);
}
public List<Student> update(String cin,String nombre,String email){
	studentRepository.upadateStud(cin, nombre, email);
	return studentRepository.getAll();
}


}
