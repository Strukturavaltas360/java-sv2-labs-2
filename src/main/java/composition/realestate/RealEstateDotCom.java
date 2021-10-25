package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        RealEstate house = new RealEstate("Falusi ház", 45_000_000,
                new Details("Központi helyen lévő ház",
                        new Address("Felsőtó", "2312", "Görbe u.", 3),
                        100,
                        1300
                )
        );
        System.out.println(house);

        house.getDetails().getAddress().setHouseNumber(31);
        house.getDetails().setAreaOfSite(1400);
        System.out.println(house);

        Details details = new Details("Sorház", null, 69, 300);
        details.setAddress(house.getDetails().getAddress());
        house.setDetails(details);
        System.out.println(house);
    }
}
