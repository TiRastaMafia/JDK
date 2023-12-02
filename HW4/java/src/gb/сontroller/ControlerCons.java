package src.gb.сontroller;

import src.gb.model.ListPersons;
import src.gb.model.Person;
import src.gb.model.service.PersonService;
import src.gb.view.ConsolView;

import java.util.List;
import java.util.Scanner;

public class ControlerCons {

    ConsolView consolView = new ConsolView();
    PersonService personService = new PersonService();

    public void buttonClick(){
        _buttonClick();
    }

    private void _buttonClick() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            consolView.printMenu();
            int enterItemMenu = scanner.nextInt();
            switch (enterItemMenu) {
                case 1:
                    String name = consolView.requestName();
                    String phoneNumber = consolView.requestPhoneNumber();
                    int experience = consolView.requestExperience();
                    personService.add(phoneNumber, experience, name);
                    consolView.printAllPersons(personService.getListPersons());
                    break;
                case 2:
                    List<String> resultList = personService.findPhonesByName(consolView.requestName());
                    System.out.println("-----");
                    for (String item : resultList) {
                        System.out.println(item);
                    }
                    System.out.println("-----");
                    break;
                case 3:
                    Person resultPerson = personService.findSomething(consolView.requestId());
                    System.out.printf("-----\n%s\n-----\n", resultPerson);
                    break;
                case 4:
                    List<String> resultListExp = personService.findByExperience(consolView.requestExperience());
                    System.out.println("-----");
                    for (String item : resultListExp) {
                        System.out.println(item);
                    }
                    System.out.println("-----");
                    break;
                case 5:
                    consolView.printAllPersons(personService.getListPersons());
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Введено неверное значение!");
                    break;

            }

        }
    }
}
