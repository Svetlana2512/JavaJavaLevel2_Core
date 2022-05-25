package src.Lesson9.studentImpl;

import src.Lesson9.student.Course;
import src.Lesson9.student.Student;

import java.util.List;

public class StudentsImpl implements Student {

    private String name;
    private List<Course> courses;

    public StudentsImpl(String name, List<Course> courses){
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String getName(){
        return name;
    }


    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

}