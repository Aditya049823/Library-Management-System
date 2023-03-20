package com.Springproject.LibraryManagementSystem.Controller;

import com.Springproject.LibraryManagementSystem.DTO.StudentRequestDto;
import com.Springproject.LibraryManagementSystem.DTO.StudentResponseDto;
import com.Springproject.LibraryManagementSystem.DTO.StudentUpdateRequestDto;
import com.Springproject.LibraryManagementSystem.Entity.Student;
import com.Springproject.LibraryManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController{
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto)
    {
        studentService.addStudent(studentRequestDto);
        return "Student added Sucessfully";
    }

    @GetMapping("/find_by_email")
    public String findByEmail(@RequestParam("email") String email){
        return studentService.findByEmail(email);
    }

    @PutMapping("/update-email")
    public StudentResponseDto updateEmail(@RequestBody StudentUpdateRequestDto studentUpdateRequestDto)
    {
        return studentService.updateEmail(studentUpdateRequestDto);
    }
}
