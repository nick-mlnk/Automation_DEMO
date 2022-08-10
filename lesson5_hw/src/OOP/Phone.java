package OOP;

import static java.lang.String.format;

public class Phone extends Device{
    private int number;
    private String model;
    private double weight;

    public Phone(String model, double weight) {
        this.model = model;
        this.weight = weight;
    }


    public Phone(int number, String model, double weight) {
        this(model,weight);
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String callerName){
        System.out.printf("Call from %s%n", callerName);
    }

    public void receiveCall(String callerName, int callerNumber){
        System.out.printf("Call from %s%nwith number:%d", callerName, callerNumber);
    }

    public void sendMessage(int receiverNumber, String message){
        System.out.printf("Message '%s' was sent to %d", message, receiverNumber);
    }

    @Override
    public String getDeviceName(){
        return "Phone_SQW_".concat(model);
    }


    @Override
    public String toString() {
        return format("Phone [deviceName: %s, model: %s, number: %d, weight: %f]", getDeviceName(), this.model, this.number, this.weight);
    }
}
