import java.util.Scanner;

/*
Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака.
Например, если дана строка "string" результат будет "ri", для строки "code" результат "od",
для "Practice" результат "ct".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] str2 = new char[2];
        char[] c = str.toCharArray();
        System.out.println(c[c.length / 2 - 1] + "" + c[c.length / 2]);
        System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
        str.getChars(str.length() / 2 - 1, str.length() / 2 + 1, str2, 0);
        System.out.println(str2);
    }
}