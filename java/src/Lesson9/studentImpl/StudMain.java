package src.Lesson9.studentImpl;

import src.Lesson9.student.Course;
import src.Lesson9.student.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudMain {

    public static void main(String[] args) {

        Course courseMath = new CourseImpl( "math");
        Course courseLit = new CourseImpl( "literature");
        Course courseEngl = new CourseImpl( "english");
        Course coursePH = new CourseImpl( "physics");
        Course courseAstro = new CourseImpl( "astronomy");
        Course courseNoName = new CourseImpl( "noName");


        Student student1 = new StudentsImpl( "Name1", Arrays.asList(courseMath, courseLit, coursePH, courseAstro));
        Student student2 = new StudentsImpl( "Name2", Arrays.asList(courseEngl, courseAstro, coursePH));
        Student student3 = new StudentsImpl( "Name3", Arrays.asList(courseMath, courseLit, coursePH));
        Student student4 = new StudentsImpl( "Name4", Arrays.asList(courseAstro, courseLit, coursePH, courseEngl));
        Student student5 = new StudentsImpl( "Name5", Arrays.asList(courseMath, courseLit, courseEngl));

        courseStudent(Stream.of(student1, student2, student3, student4, student5), courseAstro)
                .forEach(student -> System.out.println(student.getName() + " записан на курс " + courseAstro.courseName()));

    }

    public static List<Student> courseStudent(Stream<Student> studentStream, Course course){
        return studentStream
                .filter(student -> student.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }

    public static List<Student> smartestStudent(Stream<Student> studentStream){
        Comparator<Student> studentComparator = Comparator.comparingInt(students -> students.getAllCourses().size());

        return studentStream
                .sorted(studentComparator.reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Course> uniqueCourse(Stream<Student> studentStream) {
        return studentStream
                .map(Student::getAllCourses)
                .flatMap(courses -> courses.stream())
                .distinct()
                .collect(Collectors.toList());
    }

}
