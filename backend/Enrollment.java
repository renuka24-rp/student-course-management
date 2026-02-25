package com.renuka.studentcourse;

import jakarta.persistence.*;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;

    @ManyToOne
    private Course course;

    public Enrollment() {}

    public Enrollment(String studentName, Course course) {
        this.studentName = studentName;
        this.course = course;
    }

    public Long getId() { return id; }
    public String getStudentName() { return studentName; }
    public Course getCourse() { return course; }

    public void setId(Long id) { this.id = id; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public void setCourse(Course course) { this.course = course; }
}
