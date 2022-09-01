import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите первое значение для ряда Фибоначчи:");
        int first = in.nextInt();
        System.out.println("Зададим второе значение для ряда Фибоначчи:");
        int second = in.nextInt();
        System.out.println("Укажите сколько чисел ряда Фибоначи вывести:");
        int total = in.nextInt();
        int num;


        if (total < 0) {
            System.out.println("Значение не может быть меньше 1");
        }
        else if (total > 0) {

            System.out.print(first + " " + second + " ");
            for (int i = 3; i <= total; i++) {
                num = first + second;
                System.out.print(num + " ");
                first = second;
                second = num;
            }
        }
    }
}

