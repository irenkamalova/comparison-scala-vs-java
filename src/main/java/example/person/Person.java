package example.person;

import java.util.Objects;

public class Person {

    private final String name;
    private final int age;

    private final static int AGE_LOW_BOUNDER = 0;
    private final static int AGE_HIGH_BOUNDER = 200;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person instanceOf(String name, int age)
        throws IllegalAccessException {
        if (age < AGE_LOW_BOUNDER || age > AGE_HIGH_BOUNDER)
            throw new IllegalAccessException("Age is incorrect");
        return new Person(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
            Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "example.person.Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}

