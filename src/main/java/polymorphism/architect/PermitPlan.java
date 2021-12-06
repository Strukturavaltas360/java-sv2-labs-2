package polymorphism.architect;

public class PermitPlan extends SketchPlan implements Header {
    protected String nameOfClient;
    protected String addressOfBuilding;

    public PermitPlan(int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding) {
        super(pagesOfDocumentation, title);
        this.nameOfClient = nameOfClient;
        this.addressOfBuilding = addressOfBuilding;
    }

    String getHeader() {
        return  String.format("%s\nÉpíttető: %s\nHelyszín: %s", title, nameOfClient, addressOfBuilding);
    }

    @Override
    public String getNameOfClient() {
        return nameOfClient;
    }

    @Override
    public String getAddressOfBuilding() {
        return addressOfBuilding;
    }
}
