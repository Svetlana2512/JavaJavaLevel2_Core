package src.Lesson1;

import src.Lesson1.Competition.ObstacleCourse;
import src.Lesson1.Competition.HeightJumpMeters;
import src.Lesson1.Competition.HundredMeterRun;
import src.Lesson1.People.People;
import src.Lesson1.People.Team;

public class Main {

        public static void main(String[] args) {

            ObstacleCourse obstacleCourse = new ObstacleCourse(new HundredMeterRun(8), new HeightJumpMeters(9));

            Team team1 = new Team("First", new People("Dima", 2, 8),
                        new People("Vika", 3, 8),
                        new People("Lena", 4, 10),
                        new People("Uriy", 3, 4));

            obstacleCourse.doIt(team1);

            team1.getResult();


            ObstacleCourse obstacleCourse2 = new ObstacleCourse(new HundredMeterRun(5), new HeightJumpMeters(3));

            Team team2 = new Team("Second", new People("Vova", 1, 5),
                        new People("Sveta", 4, 9),
                        new People("Kata", 5, 7),
                        new People("Maxim",2, 5));

            obstacleCourse2.doIt(team2);

            team2.getResult();


        }


    }

