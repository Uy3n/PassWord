import java.lang.reflect.Parameter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập password: ");
        String s = sc.nextLine();

        if (countPassWord(s) == false) {
            System.out.println("mật khẩu yếu.");
        }

        if (testUpperCase(s) == false || testNumber(s) == false || testSpecialChar(s) == false) {
            System.out.println("mật khẩu chưa đủ mạnh.");
        }

    }

    public static boolean countPassWord(String s) {
        boolean count = false;

        if (s.length() >= 10) {
            count = true;
        }

        return count;
    }

    public static boolean testUpperCase(String s) {
        boolean test = false;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(i)) {
                test = true;
                break;
            }
        }

        return test;
    }

    public static boolean testNumber(String s) {
        boolean test = false;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(i)) {
                test = true;
                break;
            }
        }

        return test;
    }

    public static boolean testSpecialChar(String s) {
        boolean test = false;

        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

        if (test = m.find()) {
            test = true;
        }

        return test;
    }

}
