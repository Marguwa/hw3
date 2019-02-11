package home_work_3;

/*
1. Написать программу, которая загадывает случайное число от 0 до 9,
и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить
больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос –
«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
*/

import java.util.Scanner;

import static java.lang.System.*;

public class hw3 {
    public static void main(String[] args) {

        startGame();
    }

    public static void startGame() {

        Scanner scanner = new Scanner(in);

        int a, n = (int) (Math.random() * 10);
        out.println("Программа загадала случайное число от 0 до 9, угадайте это число с 3-х попыток.");

        for (int i = 1; i < 4; i++) {
            out.println("Попытка " + i + ": ");
            a = scanner.nextInt();

            if (a == n) {
                out.println("Вы угадали! Загаданное число: " + n);
                break;
            }
            if (a < n) out.println("Загаданное число больше");
            if (a > n) out.println("Загаданное число меньше");
        }

        out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        a = scanner.nextInt();
        out.println((a != 1) ? ("До встречи!") : ("Новая игра"));
        if (a == 1) startGame();
        exit(0);
        scanner.close();
    }
}


