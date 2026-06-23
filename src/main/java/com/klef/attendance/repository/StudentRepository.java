package com.klef.attendance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.attendance.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByUniversityId(String universityId);

    Optional<Student> findByNfcCardUid(String nfcCardUid);

    boolean existsByUniversityId(String universityId);

    boolean existsByEmail(String email);

    boolean existsByNfcCardUid(String nfcCardUid);
}