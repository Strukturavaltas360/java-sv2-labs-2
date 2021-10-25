package compositionlist;

public class CapsulesMain {
    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("sárga1");
        capsules.addLast("sárga2");
        capsules.addLast("sárga3");
        capsules.addFirst("piros");
        capsules.addFirst("fehér");
        System.out.println(capsules.getColors());

        capsules.removeLast();
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        System.out.println(capsules.getColors());
    }
}
