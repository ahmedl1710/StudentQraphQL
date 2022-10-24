package esprit.tn.soa.grapgql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.tn.soa.repository.StudentRepository;
import esprit.tn.soa.entity.*;

public class Query implements GraphQLRootResolver{
	private final StudentRepository studentRepository;
	
	
	public Query(StudentRepository studRepository) {
		
		this.studentRepository = studRepository;
	}
	public List<Student>allStudents(){
		return studentRepository.getAll();
	}
	public Student searchStudById(String id) {
		return studentRepository.getById(id);
	}

}
