package polymorphism.architect;

public abstract class Plan {
    protected int pagesOfDocumentation;

    public Plan(int pagesOfDocumentation) {
        this.pagesOfDocumentation = pagesOfDocumentation;
    }

    abstract public int getPagesOfDocumentation();
}
