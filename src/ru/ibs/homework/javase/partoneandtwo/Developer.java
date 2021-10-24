package ru.ibs.homework.javase.partoneandtwo;

import java.util.List;

public class Developer extends Employee {
    private String programmingLanguage;
    private List<String> listOfSkills;

    public Developer(String name, int grade, String programmingLanguage, List<String> listOfSkills) {
        super(name, grade);
        this.programmingLanguage = programmingLanguage;
        this.listOfSkills = listOfSkills;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public List<String> getListOfSkills() {
        return listOfSkills;
    }

    public void setListOfSkills(List<String> listOfSkills) {
        this.listOfSkills = listOfSkills;
    }

    public void printSkills(Developer developer) {
        System.out.println(developer.getName() + " have skills as: " + listOfSkills);
    }

    public void writeCode() {
        System.out.println("Developer is writing code");
    }

    @Override
    public void whoImI(Employee employee) {
        System.out.println("I'm developer");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name=" + getName() +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", listOfSkills=" + listOfSkills +
                '}';
    }
}
