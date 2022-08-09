package ASOffice;

public class MainClass {
    public static void main(String[] args) {
        Department.Dev dev1 = new Department.Dev();
        Department.QA qa1 = new Department.QA();
        Department.DevOps devops1 = new Department.DevOps();
        print(dev1);
        System.out.println("---------------------");
        print(qa1);
        System.out.println("---------------------");
        print(devops1);


    }


    public static void print(Object object) {
        System.out.println(object);
    }

}
