package io.zipcoder.polymorphism;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many pets do you have?");
        Integer numberOfPets = scanner.nextInt();

        ArrayList<String>names=new ArrayList<>();
        ArrayList<Pet>pets=new ArrayList<>();

        for(int i=1;i<numberOfPets;i++){
            System.out.println("What is the name of Pet" + i + "?");
            String nameOfPet = scanner.next();
            names.add(nameOfPet);
            System.out.println("What is the type of Pet?" + i + "?");
            String typeOfPet = scanner.next();
            if (typeOfPet.toLowerCase().equals("dog")) {
                Dog dog = new Dog(String.valueOf(names));
                pets.add(dog);
            }
            if (typeOfPet.toLowerCase().equals("cat")) {
                Cat cat = new Cat(String.valueOf(names));
                pets.add(cat);
            }
        }

        for(int i=0;i<pets.size();i++){
            System.out.println(pets.get(i).getName()+"speak"+pets.get(i).Speak());
        }


    }
}
