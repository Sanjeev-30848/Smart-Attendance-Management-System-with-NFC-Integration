package com.klef.attendance.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {

    private Long id;

    private String studentName;

    private String universityId;

    private String email;

    private String branch;

    private String year;

    private String nfcCardUid;

    private Integer silPoints;
}