package ru.ibs.homework.javase.partone;

public abstract class Employee {
    private String name;
    private int grade;

    public Employee(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double sale() {
        return 10000 * this.grade;
    }

    public abstract void whoImI(Employee employee);
}
