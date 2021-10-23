package ru.ibs.homework.javase.partone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestApp {
    public static void main(String[] args) {
        List<String> listOfSkillsDeveloper= new ArrayList<>();
        listOfSkillsDeveloper.add("DataBase");
        listOfSkillsDeveloper.add("RabbitMQ");

        List<String> listOfProjectsTeamLeader = new ArrayList<>();
        listOfProjectsTeamLeader.add("SuperProject");
        listOfProjectsTeamLeader.add("MegaNova");

        Trainee trainee = new Trainee("Vasya",1,true,false);
        Developer developer = new Developer("Petya", 2, "Java",listOfSkillsDeveloper);
        TeamLeader teamLeader = new TeamLeader("Natasha",3,listOfProjectsTeamLeader,8);

        Set<Employee> setOfEmployees = new HashSet<>();
        setOfEmployees.add(trainee);
        setOfEmployees.add(developer);
        setOfEmployees.add(teamLeader);

        List<Employee> listOfEmployees = new ArrayList<>(setOfEmployees);

        System.out.println(listOfEmployees);


    }
}
