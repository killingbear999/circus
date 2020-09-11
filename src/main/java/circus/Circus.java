package circus;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;
import circus.stuff.Cage;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }

            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
        System.out.println("Total value of equipments " + calculateValue(equipments));
        System.out.println("Total value of animals " + calculateValue(animals));
<<<<<<< .merge_file_9GyJ9H
        Cage<Duck> duckCage = new Cage<>();
        Duck duck = new Duck();
        duckCage.lockUp(duck);
        Parrot parrot = new Parrot();
        Cage<Parrot> parrotCage = new Cage<>();
        parrotCage.lockUp(parrot);

        ArrayList<Cage> cages = new ArrayList<>();
        cages.add(duckCage);
        cages.add(parrotCage);

        for(Cage c: cages) {
            c.release();
=======

//        System.out.println(animals.length);
//        animals[2] = new Duck("Louie");
//        System.out.println(animals.length);

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));

        animalArrayList.add(new Duck("Goose"));
        animalArrayList.add(new Parrot("Dolly"));
        Duck louie = new Duck("Louie");
        animalArrayList.add(louie);

        for (Animal a: animalArrayList) {
            System.out.println(a);
        }

        System.out.println("Louie is at index: " + animalArrayList.indexOf(louie));

        animalArrayList.sort(Animal.AnimalNameComparator);
        for (Animal a: animalArrayList) {
            System.out.println(a);
        }

        System.out.println("Louie is at index: " + animalArrayList.indexOf(louie));
        animalArrayList.remove(louie);

        for (Animal a: animalArrayList) {
            System.out.println(a);
>>>>>>> .merge_file_HDSSMy
        }
    }
}
