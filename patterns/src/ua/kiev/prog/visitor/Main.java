package ua.kiev.prog.visitor;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accept(new GeneralCarCheck());
    }
}
