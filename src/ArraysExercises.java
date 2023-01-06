import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] peopleArray, Person newPerson){
        int newLength = peopleArray.length + 1;

        Person[] newArray;
        newArray = Arrays.copyOf(peopleArray, newLength);
        newArray[newLength - 1] = newPerson;
        for (Person person: newArray){
            System.out.println(person.getName());
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people;
        people = new Person[3];

        people[0] = new Person("Joshua");
        people[1] = new Person("Kaylee");
        people[2] = new Person("Cathy");

        for (Person person: people){
            System.out.println(person.getName());
        }

        Person Kyle = new Person("Kyle");
        addPerson(people, Kyle);

        for (Person person: people){
            System.out.println(person.getName());
        }
    }

}
