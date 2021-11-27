package fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("fruit");
        fruit.setWeight(0.1);
        System.out.println(String.format("name: %s, weight: %f",
                fruit.getName(), fruit.getWeight()));

        Grape grape = new Grape();
        grape.setName("grape");
        grape.setWeight(0.2);
        grape.setType("csemege");
        System.out.println(String.format("name: %s, weight: %f, type: %s",
                grape.getName(), grape.getWeight(), grape.getType()));

        Apple apple = new Apple();
        apple.setName("apple");
        apple.setWeight(0.3);
        apple.setPieces(2);
        System.out.println(String.format("name: %s, weight: %f, pieces: %d",
                apple.getName(), apple.getWeight(), apple.getPieces()));

        GoldenDelicious gD = new GoldenDelicious();
        gD.setName("golden");
        gD.setWeight(0.4);
        gD.setPieces(3);
        System.out.println(String.format("name: %s, weight: %f, pieces: %d, colour: %s",
                gD.getName(), gD.getWeight(), gD.getPieces(), gD.getColour()));

        Starking starking = new Starking();
        starking.setName("starking");
        starking.setWeight(0.5);
        starking.setPieces(4);
        System.out.println(String.format("name: %s, weight: %f, pieces: %d, colour: %s",
                starking.getName(), starking.getWeight(), starking.getPieces(), starking.getColour()));

    }
}
