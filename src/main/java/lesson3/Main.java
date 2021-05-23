package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            Random rand = new Random();
            int randomNumber = rand.nextInt(10);
            int userAnswer = scannerNumber("Угадайте число от 0 до 9.\nВведите число:",0,9);
            for (int i = 2; i >= 0; i--) {
                if (userAnswer == randomNumber) {
                    System.out.println("Поздравляем! Вы угадали!");
                    break;
                } else if (i == 0) {
                    System.out.println("Вы проиграли. Загаданное число: " + randomNumber);
                    break;
                } else if (userAnswer > randomNumber) {
                    userAnswer = scannerNumber("Загаданное число меньше.\nВы можете попытаться ещё " + i + " раз(а).\nВведите число:",0,9);
                } else if (userAnswer < randomNumber) {
                    userAnswer = scannerNumber("Загаданное число больше.\nВы можете попытаться ещё " + i + " раз(а).\nВведите число:",0,9);
                }
            }
            userAnswer = scannerNumber("Игра окончена. Повторить игру еще раз? 1 – да / 0 – нет.\nВыберите ответ:",0,1);
            if (userAnswer == 0) {
                break;
            }
        } while (true);
    }

    public static int scannerNumber(String message, int min, int max){
        int userAnswer;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(message);
            userAnswer = sc.nextInt();
        } while (userAnswer < min || userAnswer > max);
        return userAnswer;
    }

}
