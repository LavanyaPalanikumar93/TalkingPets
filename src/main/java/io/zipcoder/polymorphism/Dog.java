package io.zipcoder.polymorphism;
public class Dog extends Pet {
    public Dog(){
        super();
    }
    public Dog(String name) {
        super(name);
    }
    @Override
    public String Speak() {
        return "Woof";
    }
}


