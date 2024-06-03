package com.mycompany.app;
public class Drive {
    public static void main(String[] args) {
        Avante avante = new Avante();
        Matiz matiz = new Matiz();

        drive(avante, "Avante");
        drive(matiz, "Matiz");
    }

    private static void drive(Car car, String name) {
        System.out.println(name);
        for (int i = 0; i < 5; i++) {
            car.accelerate();
            System.out.println(i + ":" + car.getSpeed());
        }
    }
}
