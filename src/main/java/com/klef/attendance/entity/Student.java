package com.klef.attendance.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String studentName;

    @Column(nullable = false, unique = true)
    private String universityId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String branch;

    @Column(nullable = false)
    private String year;

    @Column(unique = true)
    private String nfcCardUid;

    @Builder.Default
    private Integer silPoints = 0;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
    }
}