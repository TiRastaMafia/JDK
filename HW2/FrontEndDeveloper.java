public class FrontEndDeveloper extends Developer{
    @Override
    void drinkCoffe() {
        System.out.println("drinkCoffee");
    }

    @Override
    void smoke() {
        System.out.println("smoke");
    }

    public void developGUI() {
        System.out.println("create GUI");
    }

    @Override
    public String toString() {
        return "FrontEndDeveloper";
    }
}
