package lesson5;

public class Main {
    public static void main(String[] args) {
        Person[] perArray = new Person[5];
        perArray[0] = new Person("Ivanov", "Ivan", "Engineer", "ivivan@mailbox.com", "81234567890", 30000, 30);
        perArray[1] = new Person("Petrov", "Peter", "Designer", "petpeter@mailbox.com", "81234567890", 25000, 28);
        perArray[2] = new Person("Vasiliev", "Ivan", "Manager", "vasivan@mailbox.com", "81234567890", 30000, 42);
        perArray[3] = new Person("Ivanov", "Peter", "Director", "ivpeter@mailbox.com", "81234567890", 50000, 50);
        perArray[4] = new Person("Petrov", "Vasily", "Accountant", "petvasily@mailbox.com", "81234567890", 45000, 48);

        for (int i = 0; i < perArray.length; i++) {
            if (perArray[i].getAge() >= 40) {
                perArray[i].info();
                System.out.println();
            }
        }
    }
}
