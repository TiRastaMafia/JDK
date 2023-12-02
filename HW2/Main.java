import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался объект Frontender,
// и далее вызывался метод developGUI(), не изменяя существующие интерфейсы, только код основного класса.

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        List<Developer> developers = new ArrayList<>();

        int tempInt = rand.nextInt(0, 100);
        for (int i = 0; i < tempInt; i++) {
            if (rand.nextBoolean()) {
                developers.add(new FrontEndDeveloper());
            } else {
                developers.add(new BackendDeveloper());
            }
        }

        for (Developer developer : developers) {
            checkSpec(developer);
        }

    }

    static void checkSpec(Developer developer) {
        if (developer instanceof FrontEndDeveloper) {
            ((FrontEndDeveloper) developer).developGUI();
        } else {
            System.out.println("Create GUI not supported by this Developer");
        }

    }
}