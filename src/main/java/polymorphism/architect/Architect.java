package polymorphism.architect;

public class Architect {
    public static void main(String[] args) {
        Plan p1 = new SketchPlan(1, "SketchPlan1");
        Plan p2 = new PermitPlan(1, "PermitPlan1", "Péter Pál", "Piripócs");
        Plan p3 = new ConstructionPlan(1, "ConstructionPlan1", "Cézár Panna", "Cibakháza", 10);
        SketchPlan sp1 = new SketchPlan(1, "SketchPlan2");
        SketchPlan sp2 = new PermitPlan(1, "PermitPlan2", "Péter Pál", "Piripócs");
        SketchPlan sp3 = new ConstructionPlan(1, "ConstructionPlan2", "Cézár Panna", "Cibakháza", 10);
        Header h2 = new PermitPlan(1, "PermitPlan3", "Péter Pál", "Piripócs");
        Header h3 = new ConstructionPlan(1, "ConstructionPlan3", "Cézár Panna", "Cibakháza", 10);
        PermitPlan pp2 = new PermitPlan(1, "PermitPlan4", "Péter Pál", "Piripócs");
        PermitPlan pp3 = new ConstructionPlan(1, "ConstructionPlan4", "Cézár Panna", "Cibakháza", 10);
        ConstructionPlan cp3 = new ConstructionPlan(1, "ConstructionPlan5", "Cézár Panna", "Cibakháza", 10);

        System.out.println(p1.getPagesOfDocumentation());
        System.out.println(p2.getPagesOfDocumentation());
        System.out.println(p3.getPagesOfDocumentation());

        System.out.println(sp1.getPagesOfDocumentation() + " " + sp1.getTitle());
        System.out.println(sp2.getPagesOfDocumentation() + " " + sp2.getTitle());
        System.out.println(sp3.getPagesOfDocumentation() + " " + sp3.getTitle());

        System.out.println(h2.getNameOfClient() + " " + h2.getAddressOfBuilding());
        System.out.println(h3.getNameOfClient() + " " + h3.getAddressOfBuilding());

        System.out.println(pp2.getPagesOfDocumentation() + " " + pp2.getTitle() + " " + pp2.getNameOfClient() + " " + pp2.getAddressOfBuilding());
        System.out.println(pp3.getPagesOfDocumentation() + " " + pp3.getTitle() + " " + pp3.getNameOfClient() + " " + pp3.getAddressOfBuilding());

        System.out.println(cp3.getPagesOfDocumentation() + " " + cp3.getTitle() + " " + cp3.getNameOfClient() + " " + cp3.getAddressOfBuilding() + " " + cp3.getSheetsOfConstructionDrawings());
    }
}
