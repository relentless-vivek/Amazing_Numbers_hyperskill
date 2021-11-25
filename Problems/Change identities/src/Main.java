
class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        Person p3 = new Person();
        p3.name = p2.name;
        p2.name = p1.name;
        p1.name = p3.name;

        p3.age = p2.age;
        p2.age = p1.age;
        p1.age = p3.age;

    }
}