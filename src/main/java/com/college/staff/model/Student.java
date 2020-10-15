package com.college.staff.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Builder
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Student {

    private int id;
    private String name;
}
