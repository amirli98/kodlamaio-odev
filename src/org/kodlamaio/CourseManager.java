package org.kodlamaio;

import java.util.ArrayList;

public class CourseManager {

    private static ArrayList<Course> courses = new ArrayList<>();

    public static Course addCourse(Course course)
    {
        System.out.println(course + " added to the database.");
        courses.add(course);
        return course;
    }

    public static Course deleteCourse(Course course)
    {
        System.out.println(course + " successfully deleted from database");
        courses.remove(course);
        return course;
    }

    public static void deleteAllCourses()
    {
         courses.clear();
        System.out.println("Courses section is empty now");
    }

    public static ArrayList<Course> getCourses() {
        return courses;
    }
}
