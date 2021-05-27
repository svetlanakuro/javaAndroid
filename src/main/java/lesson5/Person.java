package lesson5;

public class Person {
    private String surname;
    private String name;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Person(String surname, String name, String position, String email, String telephone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }

    @Override
    public String toString() {
        return "Фамилия: " + surname + '\n' +
                "Имя: " + name + '\n' +
                "Должность: " + position + '\n' +
                "email: " + email + '\n' +
                "Телефон: " + telephone + '\n' +
                "Зарплата: " + salary +
                "Возрваст: " + age;
    }

    public void info() {
        System.out.println(toString());
    }

}
