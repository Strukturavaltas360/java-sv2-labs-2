package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer(new Cpu("core i5", 4.5));
        System.out.println(pc);
        System.out.println();
        pc.addHardware(new Hardware("HDD", "1 TB"));
        pc.addHardware(new Hardware("Monitor", "LG 24"));
        System.out.println(pc);
        System.out.println();
        pc.addSoftware(new Software("JAVA", 18));
        pc.addSoftware(new Software("Windows", 10));
        pc.addSoftware(new Software("IntelliJ", 2021.2));
        System.out.println(pc);
        System.out.println();
    }
}
