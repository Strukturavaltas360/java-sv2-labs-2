package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fish1 = new Fish("pisztráng", "ezüst");
        Fish fish2 = new Fish("bohóc", "vegyes");
        Fish fish3 = new Fish("aranycsuka", "arany");
        aquarium.addFish(fish1); //Kivétel, mert az aquarium példány ornamentalFish listája nem lett példányosítva, így null értékű, aminek az add metódusát hívja meg a program
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        System.out.println(aquarium.getNumberOfFish());
    }
}
