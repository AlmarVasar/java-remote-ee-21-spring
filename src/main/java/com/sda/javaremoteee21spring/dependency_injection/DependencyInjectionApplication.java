package com.sda.javaremoteee21spring.dependency_injection;

public class DependencyInjectionApplication {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Zoo zoo = new Zoo(dog); // injecting dog into zoo
        EntertainmentPark entertainmentPark = new EntertainmentPark(zoo); //injecting
    }
}
