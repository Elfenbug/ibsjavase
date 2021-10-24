package ru.ibs.homework.javase.partoneandtwo;

public class Trainee extends Employee {
    private boolean learnInUniversity;
    private boolean workInIt;

    public Trainee(String name, int grade, boolean learnInUniversity, boolean workInIt) {
        super(name, grade);
        this.learnInUniversity = learnInUniversity;
        this.workInIt = workInIt;
    }

    public boolean isLearnInUniversity() {
        return learnInUniversity;
    }

    public void setLearnInUniversity(boolean learnInUniversity) {
        this.learnInUniversity = learnInUniversity;
    }

    public boolean isWorkInIt() {
        return workInIt;
    }

    public void setWorkInIt(boolean workInIt) {
        this.workInIt = workInIt;
    }

    public void learnJava() {
        System.out.println("Trainee is learning Java");
    }

    public void tryWriteCode() {
        System.out.println("Trainee is trying write perfect code");
    }

    @Override
    public void whoImI(Employee employee) {
        System.out.println("I'm trainee");
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name=" + getName() +
                ", learnInUniversity=" + learnInUniversity +
                ", workInIt=" + workInIt +
                '}';
    }
}
