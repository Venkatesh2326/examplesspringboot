package com.microservices.Employee.MysqlService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.Employee.MysqlModel.Student;
import com.microservices.Employee.MysqlRepository.StudentRepository;



@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentrepo;
	
    public String createStudent(Student student) {
       
    	studentrepo.save(student);
    	return "Student has been added";
    }
    
    public List<Student> getAllStudents() {
        return studentrepo.findAll();
    }
    
    public Student getStudentById(Long id) {
        return studentrepo.findById(id).orElse(null);
    }
    
    public Student updateStudent(Long id, Student student) {
    	student.setId(id);
        return studentrepo.save(student);
    }
    
    public void deleteStudent(Long id) {
    	studentrepo.deleteById(id);
    }


}
