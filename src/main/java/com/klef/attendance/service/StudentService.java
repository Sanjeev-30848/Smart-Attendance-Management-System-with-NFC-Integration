package com.klef.attendance.service;

import java.util.List;

import com.klef.attendance.dto.StudentDTO;

public interface StudentService {

    StudentDTO addStudent(StudentDTO studentDTO);

    List<StudentDTO> getAllStudents();

    StudentDTO getStudentById(Long id);

    StudentDTO getStudentByUniversityId(String universityId);

    StudentDTO getStudentByNfcUid(String uid);

    StudentDTO updateStudent(Long id, StudentDTO studentDTO);

    void deleteStudent(Long id);
}