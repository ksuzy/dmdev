package task1;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int courseNumber;
    private List<Integer> marks;


    public Student(String firstName, String lastName, int courseNumber, List<Integer> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseNumber = courseNumber;
        this.marks = marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public double averageElement(){
        double sum = 0;
        for (Integer mark : this.getMarks()) {
            sum += mark;
        }
        return sum / this.getMarks().size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courseNumber=" + courseNumber +
                ", marks=" + marks +
                '}';
    }
}

