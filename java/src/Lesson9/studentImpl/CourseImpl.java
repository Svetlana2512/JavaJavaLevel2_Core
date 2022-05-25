package src.Lesson9.studentImpl;

import src.Lesson9.student.Course;

public class CourseImpl extends Course {

    private String courseName;

    public CourseImpl(String courseName){
        this.courseName = courseName;
    }

    @Override
    public String courseName() {
        return courseName;
    }

}