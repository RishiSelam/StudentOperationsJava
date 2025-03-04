// StudentOperations.java - Manages student records

import java.util.*;
class StudentOperations {
    private ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student searchByPrn(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) return student;
        }
        return null;
    }

    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) return student;
        }
        return null;
    }

    public Student searchByPosition(int pos) {
        if (pos >= 0 && pos < students.size()) return students.get(pos);
        return null;
    }

    public boolean updateStudent(String prn, String newName, String newDept, String newBatch, double newCgpa) {
        Student student = searchByPrn(prn);
        if (student != null) {
            student.setName(newName);
            student.setDept(newDept);
            student.setBatch(newBatch);
            student.setCgpa(newCgpa);
            return true;
        }
        return false;
    }

    public boolean deleteStudent(String prn) {
        return students.removeIf(student -> student.getPrn().equals(prn));
    }
}