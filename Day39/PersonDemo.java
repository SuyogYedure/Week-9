import java.util.*;
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        int ageComparison = Integer.compare(age, other.age);
        if (ageComparison == 0) {
            return name.compareTo(other.name);
        }
        return ageComparison;
    }

    @Override
    public String toString() {
        return "Person{" +"name='" + name + '\'' +", age=" + age +'}';
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
public class PersonDemo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        System.out.println("Enter the number of people:");
        int numPeople = s.nextInt();
        s.nextLine();

        for (int i = 0; i < numPeople; i++) {
            System.out.println("Enter name and age of person " + (i + 1) + ":");
            String name = s.nextLine();
            int age = s.nextInt();
            s.nextLine();
            people.add(new Person(name, age));
        }

        System.out.println("Before sorting:");
        for (Person p : people) {
            System.out.println(p);
        }

        people.sort(new AgeComparator());
        System.out.println("After sorting by age:");
        for (Person p : people) {
            System.out.println(p);
        }

        Collections.sort(people);
        System.out.println("After sorting by age and then name:");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
