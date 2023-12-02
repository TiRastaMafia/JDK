public class BackendDeveloper extends Developer{
    @Override
    void drinkCoffe() {
        System.out.println("drinkCoffee");
    }

    @Override
    void smoke() {
        System.out.println("smoke");
    }

    @Override
    public String toString() {
        return "BackendDeveloper";
    }
}
