package org.beta.curs14.lombok;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("mihai", 44, "12351234","Romanian");
        Person person2 = Person.builder()
                .name("george")
                .age(44)
                .nationality("Austrian (talhar)")
                .cnp("34161")
                .build();

        System.out.println(person);
        System.out.println(person2);
    }
}
