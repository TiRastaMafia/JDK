package src.gb.model;

public class Person {

    public static int count = 200;
    int personId;
    String phone;
    String name;
    int experience;

    {
        count++;
    }

    public Person(String phone, String name, int experience) {
        this.personId = count;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public int getPersonId() {
        return personId;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return String.format("Табельный номер: %d, Имя: %s, Телефон: %s, Стаж: %d", personId, name, phone, experience);
    }

}
