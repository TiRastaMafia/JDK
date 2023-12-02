package src.gb.view;

import src.gb.model.ListPersons;
import src.gb.model.Person;

import java.util.Scanner;

public class ConsolView {

    Scanner scan;

    public ConsolView() {
        this.scan =  new Scanner(System.in);
    }

    public void printMenu() {
        System.out.println("Выберете пункт меню:");
        System.out.println("1. Добавить сотрудника");
        System.out.println("2. Поиск номера телефона по имени");
        System.out.println("3. Поиск сотрудника по табельному номеру");
        System.out.println("4. Выборка сотрудников по стажу работы");
        System.out.println("5. Показать всех сотрудников");
        System.out.println("6. Выход");
        System.out.println("Введите значение: ");
    }

    public void printAllPersons(ListPersons listPersons) {
        System.out.println("\n_____________________");
        for (Person person : listPersons.getPersons()) {
            System.out.println(person);
        }
        System.out.println("_____________________\n");
    }

    public String requestName() {
        System.out.println("Введите имя: ");
        String res = scan.next();
        return res;
    }

    public String requestPhoneNumber() {
        System.out.println("Введите номер телефона: ");
        String res = scan.next();
        return res;
    }

    public int requestExperience() {
        System.out.println("Введите страж работы: ");
        int res = scan.nextInt();
        return res;
    }

    public int requestId() {
        System.out.println("Введите табельный номер сотрудника: ");
        int res = scan.nextInt();
        return res;
    }

}
