package b5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> persons;

    public Hotel() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public Person findFirst(String passport) {
        for (int i = 0; i < this.persons.size(); i++) {
            if (persons.get(i).getPassport().equals(passport)) {
                return persons.get(i);
            }
        }
        return null;

    }
    public boolean delete(String passport) {
        Person person = findFirst(passport);
        if (person == null) {
            return false;
        } else {
            this.persons.remove(person);
            return true;
        }
    }

    public int calculator(String passport) {
        // Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        Person person = findFirst(passport);
        if (person == null) {
            return 0;
        }
        return person.getRoom().getPrice() * person.getNumberRent();
    }

    public void show() {
        // this.persons.forEach(p -> System.out.println(p.toString()));
        for (int i = 0; i < this.persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}
