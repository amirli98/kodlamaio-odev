package org.kodlamaio;


public class Main {
    public static void main(String[] args) {
        //Let's test our spaghetti code in Main :)

        Course course = new Course(1, "Java aranan programci olma");
        System.out.println(course);
        Course course2 = new Course();
        course2.setId(2);
        course2.setName("0 dan sektorun yukseklerine");
        System.out.println(course2);

        Instructor instructor1 = new Instructor("Engin Demirog", 25, course);
        System.out.println(instructor1);
        CourseManager.addCourse(course);
        CourseManager.addCourse(course2);
        CourseManager.deleteCourse(course);
        System.out.println(CourseManager.getCourses());
        Instructor instructor2 = new Instructor();
        instructor2.setAge(23);
        instructor2.setName("Fazil Amirli");
        instructor2.setCourse(new Course(3, "Calculus for Dummies"));
        System.out.println(instructor2);
    }
}
