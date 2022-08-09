package ASOffice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Department {


    public static class Dev {
        private int countOfPeople;
        private int countOfTasks;
        private String[] equipment;
        private int numberOfOffice;

        public Dev() {
            this.countOfPeople = 24;
            this.countOfTasks = 1093;
            this.equipment = new String[]{"PC", "Laptop", "Mouse", "keyboard", "HDD"};
            this.numberOfOffice = Math.abs(new Random().nextInt());
        }

        @Override
        public String toString(){
            return String.format("Dev department has %d people,%nCurrently there are %d open tasks,%nPeople in the department use such equipments: %s, %nNumber of Dev office is %d", countOfPeople, countOfTasks, Arrays.toString(equipment), numberOfOffice);
        }
    }

    public static class QA {
        private int countOfPeople;
        private int countOfFoundBugs;
        private String[] typeOfQA;
        private String[] grade;
        private int numberOfOffice;

        public QA() {
            this.countOfPeople = 15;
            this.countOfFoundBugs = 1093;
            this.typeOfQA = new String[]{"Manual", "Automation", "General"};
            this.grade = new String[]{"Junior", "Middle", "Senior"};
            this.numberOfOffice = Math.abs(new Random().nextInt());
        }

        @Override
        public String toString(){
            return String.format("QA department has %d people,%nCurrently they have found %d bugs,%nQA in the department: %s, %nThis department has QA with such levels of seniority:%s,%nNumber of Dev office is %d", countOfPeople, countOfFoundBugs, Arrays.toString(typeOfQA), Arrays.toString(grade),numberOfOffice);
        }
    }

    public static class DevOps{
        private int countOfPeople;
        private int countOfDoneTasks;
        private String[] grade;
        private String[] tools;
        private int numberOfOffice;

        public DevOps() {
            this.countOfPeople = 11;
            this.countOfDoneTasks = 233;
            this.grade = new String[]{"Junior", "Middle", "Senior"};
            this.numberOfOffice = Math.abs(new Random().nextInt());
            this.tools = new String[]{"AWS", "Pandas", "Jenkins", "GIT", "Azure DevOps", "TeamCity", "Octopus"};
        }

        @Override
        public String toString(){
            return String.format("DevOps department has %d people,%nCurrently they have done %d tasks,%nThis department has DevOps with such levels of seniority:%s,%nThe main tools the department uses in its work:%s%nNumber of Dev office is %d", countOfPeople, countOfDoneTasks, Arrays.toString(grade),Arrays.toString(tools),numberOfOffice);
        }
    }

}
