package Containers1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet with the name comparator
        Set<Person> treeSetByName = new TreeSet<>(new HobbyComparator());
        treeSetByName.add(new Person("John", 30));
        treeSetByName.add(new Person("Alice", 25));
        treeSetByName.add(new Person("Bob", 35));

        // Iterate through the TreeSet and print the name and age
        System.out.println("Persons sorted by name:");
        for (Person person : treeSetByName) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

        // Create a TreeSet with the age comparator
        Set<Person> treeSetByAge = new TreeSet<>(new AgeComparator());
        treeSetByAge.add(new Person("John", 30));
        treeSetByAge.add(new Person("Alice", 25));
        treeSetByAge.add(new Person("Bob", 35));

        // Iterate through the TreeSet and print the name and age
        System.out.println("\nPersons sorted by age:");
        for (Person person : treeSetByAge) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

        // Create a HashMap to store Person and List<Hobby>
        Map<Person, List<Hobby>> hobbyMap = new HashMap<>();

        // Create hobbies and addresses
        List<Address> cyclingAddresses = new ArrayList<>();
        cyclingAddresses.add(new Address("Romania"));
        cyclingAddresses.add(new Address("Franta"));
        Hobby cyclingHobby = new Hobby("Cycling", 3, cyclingAddresses);

        List<Address> swimmingAddresses = new ArrayList<>();
        swimmingAddresses.add(new Address("Canada"));
        swimmingAddresses.add(new Address("Olanda"));
        Hobby swimmingHobby = new Hobby("Swimming", 2, swimmingAddresses);

        // Add hobbies to the map
        List<Hobby> johnHobbies = new ArrayList<>();
        johnHobbies.add(cyclingHobby);
        johnHobbies.add(swimmingHobby);
        hobbyMap.put(new Person("John", 30), johnHobbies);

        // Print the names of hobbies and countries where they can be practiced
        Person john = new Person("John", 30);
        List<Hobby> johnHobbiesList = hobbyMap.get(john);

        System.out.println("\nHobbies for " + john.getName() + ":");
        for (Hobby hobby : johnHobbiesList) {
            System.out.println("Hobby: " + hobby.getName());
            System.out.println("Countries where it can be practiced:");
            for (Address address : hobby.getAddresses()) {
                System.out.println(address.getCountry());
            }
            System.out.println();
        }

   }
}