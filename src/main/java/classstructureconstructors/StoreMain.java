package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store aStore = new Store("alma");
        Store bStore = new Store("banán");

        System.out.println(aStore.getProductAndStock());
        System.out.println(bStore.getProductAndStock());

        System.out.println("+12 alma, +30 banán");
        aStore.store(12);
        bStore.store(30);
        System.out.println(aStore.getProductAndStock());
        System.out.println(bStore.getProductAndStock());

        System.out.println("-10 alma, -14 banán");
        aStore.dispatch(10);
        bStore.dispatch(14);
        System.out.println(aStore.getProductAndStock());
        System.out.println(bStore.getProductAndStock());
    }
}
