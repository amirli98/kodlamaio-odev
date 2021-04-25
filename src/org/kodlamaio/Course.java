package org.kodlamaio;

public class Course {

    private int id;
    private String name;

    public Course()
    {

    }

    public Course(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(id)
                .append("-")
                .append(name);
        return sb.toString();
    }
}
