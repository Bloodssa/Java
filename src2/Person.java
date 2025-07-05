package Second;

public class Person {
    String name;
    int age;
    String gender;
    String address;

    public void myPerson(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public void Info() {
        System.out.println("\n\n--- Person Information ---");
        System.out.println("Name\t: " + name);
        System.out.println("Age\t: " + age);
        System.out.println("Gender\t: " + gender);
        System.out.println("Address\t: " + address);
    }
}
