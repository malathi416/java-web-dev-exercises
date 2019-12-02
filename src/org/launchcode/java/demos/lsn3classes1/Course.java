package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
//    private String course1 = "Java";
//    private String Instructor = "DougShook";
//    ArrayList<Student> student = new ArrayList<>();
    //    private String course3 = "AngularJS";
    private String title;
    private int credits;
    private String instructor;

    public Course (String title, int credits, String instructor) {
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(title, course.title) &&
                Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, instructor);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", credits=" + credits +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
