package org.kodlamaio;

public class Instructor {
    private String name;
    private int age;
    private Course course;

    public Instructor()
    {

    }

    public Instructor(String name, int age, Course course)
    {
        this.name = name;
        this.age = age;
        this.course = course;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    @Override
    public String toString()
    {
        //@TODO - add custom toString() method
        StringBuilder sb = new StringBuilder();
        sb.append("Name - ").append(name)
                .append(", ")
                .append("Age - ")
                .append(age)
                .append(" ,")
                .append("Course - ")
                .append(course);
        return sb.toString();
    }
}
