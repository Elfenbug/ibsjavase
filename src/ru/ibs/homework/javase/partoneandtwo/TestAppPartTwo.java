package ru.ibs.homework.javase.partoneandtwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestAppPartTwo {
    public static void main(String[] args) {
        Employee anonymousEmployee = new Employee() {
            int age;
            String sex;

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            @Override
            public void whoImI(Employee employee) {
                System.out.println("I'm anonymous");
            }

            public void printNewFields(String sex, int age) {
                System.out.println("I'm " + sex + " and I'm " + age + " years old");
            }

            public void printHello() {
                System.out.println("Hello from anonymous");
            }
        };

        Trainee firstTrainee = new Trainee("Vasya", 1, true, false);
        Trainee secondTrainee = new Trainee("Innokentiy", 2, false, true);
        Trainee thirdTrainee = new Trainee("Frodo", 1, true, false);
        Developer firstDeveloper = new Developer("Petya", 2, "Java", Arrays.asList("DataBase", "RabbitMQ"));
        Developer secondDeveloper = new Developer("Jack", 3, "C#", Arrays.asList("Kafka", "Django"));
        Developer thirdDeveloper = new Developer("Masha", 3, "Java", Arrays.asList("DataBase", "PL/SQL"));
        TeamLeader firstTeamLeader = new TeamLeader("Natasha", 5, Arrays.asList("SuperProject", "MegaNova"), 8);
        TeamLeader secondTeamLeader = new TeamLeader("Daniel", 6, Arrays.asList("NewStar", "SuperProMega", "KnockKnock"), 8);
        TeamLeader thirdTeamLeader = new TeamLeader("Rustam", 7, Arrays.asList("DigitalRevolution", "ProGamingClub"), 10);

        List<Employee> listOfEmployees = Arrays.asList(firstTrainee, secondTrainee, thirdTrainee,
                firstDeveloper, secondDeveloper, thirdDeveloper, firstTeamLeader, secondTeamLeader, thirdTeamLeader);

        List<Employee> streamCollect = listOfEmployees
                .stream()
                .filter(element -> element.getGrade() > 2)
                .collect(Collectors.toList());
        System.out.println(streamCollect);

        listOfEmployees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
