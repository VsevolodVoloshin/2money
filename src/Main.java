import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ �������� ��� ���� ���������:");
        int first = in.nextInt();
        System.out.println("������� ������ �������� ��� ���� ���������:");
        int second = in.nextInt();
        System.out.println("������� ������� ����� ���� �������� �������:");
        int total = in.nextInt();
        int num;


        if (total < 0) {
            System.out.println("�������� �� ����� ���� ������ 1");
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

