package lab_sheet_3;

class Student {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }
}

public class Experiment_4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aman");
        s.setMarks(85);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}
