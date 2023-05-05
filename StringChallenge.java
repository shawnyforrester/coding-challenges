import java.util.Scanner;

public class StringChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        newString(s);
        sc.close();
    }

    public static void newString(String s) {

        int count = 0;
        for (int i = count; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                System.out.println(s.substring(i, j) + ",");

            }
            count++;
        }

    }

}
