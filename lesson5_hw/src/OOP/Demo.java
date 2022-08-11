package OOP;

import java.sql.SQLOutput;

public class Demo {

    public static void main(String[] args) throws CustomException{
//        Phone phone1 = new Phone("hhh777", 12.9); //with 2 params
//        phone1.setNumber(9877126);
//        phone1.setWeight(11.1);
//        phone1.setModel("Galaxy s21+ ultra");
//
//        System.out.printf("phone1 is %s%n", phone1);
//
//
//        Phone phone2 = new Phone(9823922,"huawei_232", 32.99); //with 3 params
//        System.out.printf("phone2 is %s%n", phone2);
//        System.out.println("-----------------");
//        phone2.receiveCall("Vasylyna");
//        System.out.println("-----------------");
//        phone2.receiveCall("Vasyl", 92837823);
//        System.out.println("-----------------");
//        phone2.sendMessage(89320332,"Hi. I'm Dori. Learning a little each day adds up. \n");
//        System.out.println("-----------------");
//
//        Device device = new Device("device test 1");
//        System.out.printf("call the getDeviceName from super-class:%s%n", device.getDeviceName());
//        System.out.println("-----------------");
//
//        System.out.printf("call the getDeviceName from sub-class:%s%n", phone1.getDeviceName());

        Phone phone = Phone.builder()
                        .withModel("Samsung-A52")
                        .withWeight(45.8)
                        .build();
        System.out.println(phone);

        phone.receiveCall("kkj", 12212);
    }
}
