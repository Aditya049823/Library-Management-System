package com.Springproject.LibraryManagementSystem.Service;

import com.Springproject.LibraryManagementSystem.DTO.StudentRequestDto;
import com.Springproject.LibraryManagementSystem.DTO.StudentResponseDto;
import com.Springproject.LibraryManagementSystem.DTO.StudentUpdateRequestDto;
import com.Springproject.LibraryManagementSystem.Entity.Card;
import com.Springproject.LibraryManagementSystem.Entity.Student;
import com.Springproject.LibraryManagementSystem.Enum.Cardstatus;
import com.Springproject.LibraryManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService{

    @Autowired
    StudentRepository studentRepository;
    public void addStudent(StudentRequestDto studentRequestDto) {

        Student student=new Student();
        student.setName(studentRequestDto.getName());
        student.setAge(studentRequestDto.getAge());
        student.setDepartment(studentRequestDto.getDepartment());
        student.setEmail(studentRequestDto.getEmail());

        Card card =new Card();
        card.setCardstatus(Cardstatus.ACTIVATED);
        card.setStudent(student);

        student.setCard(card);

        studentRepository.save(student);
    }

    public String findByEmail(String email){
        Student student = studentRepository.findByEmail(email);
        return student.getName();
    }

    public StudentResponseDto updateEmail(StudentUpdateRequestDto studentUpdateRequestDto) {

        Student student=studentRepository.findById(studentUpdateRequestDto.getId()).get();
        student.setEmail(studentUpdateRequestDto.getEmail());

        Student updatedStudent=studentRepository.save(student);

        StudentResponseDto studentResponseDto=new StudentResponseDto();
        studentResponseDto.setId(updatedStudent.getStudentId());
        studentResponseDto.setName(updatedStudent.getName());
        studentResponseDto.setEmail(updatedStudent.getEmail());

        return studentResponseDto;
    }
}
