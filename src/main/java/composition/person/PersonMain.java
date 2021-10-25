package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Address home = new Address("Hungary", "Kecskemét", "Irinyi út 2.","6000");
        Address newHome = new Address("Hungary", "Szombathely", "Petőfi útca 15.","9700");
        Person person = new Person("Szabina", "DLH56789", home);
        System.out.println(person.personToString());
        person.moveTo(newHome);
        System.out.println(person.personToString());
        newHome.correctData("Deutschland", "München", "Karlsstrasse 1", "80000");
        System.out.println(person.personToString());
        person.correctData("Antonietta","JKL0345", home);
        System.out.println(person.personToString());
        System.out.println(newHome.addressToString());
    }
}
