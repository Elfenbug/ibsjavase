package ru.ibs.homework.javase.partoneandtwo;

import java.util.List;

public class TeamLeader extends Employee implements Manager {
    private List<String> projects;
    private int countPeoplesInTeam;

    public TeamLeader(String name, int grade, List<String> projects, int countPeoples) {
        super(name, grade);
        this.projects = projects;
        this.countPeoplesInTeam = countPeoples;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public int getCountPeoples() {
        return countPeoplesInTeam;
    }

    public void setCountPeoples(int countPeoples) {
        this.countPeoplesInTeam = countPeoples;
    }

    public static int countProjects(TeamLeader teamLeader) {
        int countProjects = 0;
        for (String project : teamLeader.projects) {
            countProjects++;
        }
        return countProjects;
    }

    @Override
    public void assignNewGrade(Employee employee, int newGrade) {
        employee.setGrade(newGrade);
    }

    @Override
    public void whoImI(Employee employee) {
        System.out.println("I'm team leader");
    }

    @Override
    public String toString() {
        return "TeamLeader{" +
                "name=" + getName() +
                ", projects=" + projects +
                ", countPeoplesInTeam=" + countPeoplesInTeam +
                '}';
    }
}
