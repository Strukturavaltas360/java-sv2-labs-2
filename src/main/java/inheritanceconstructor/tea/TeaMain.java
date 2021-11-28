package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("tea", 500);
        HerbalTea herbalTea = new HerbalTea("gyógytea", 600);

        System.out.println(String.format("name: %s, price: %d", tea.getName(), tea.getPrice()));
        System.out.println(String.format("name: %s, price: %d", herbalTea.getName(), herbalTea.getPrice()));
    }
}
