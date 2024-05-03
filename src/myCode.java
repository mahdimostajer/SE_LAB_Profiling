import java.util.Scanner;

public class myCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in1 = scanner.next();
        String in2 = scanner.next();
        String in3 = scanner.next();
        String in4 = scanner.next();
        String[] inputs = {in1,in2,in3,in4};

        System.out.println(efficientConcat(inputs));
    }

    public static String inefficientConcat(String[] strings) {
        String result = "";
        for (String s : strings) {
            result += s;
        }
        return result;
    }

    public static String efficientConcat(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            result.append(s);
        }
        return result.toString();
    }
}
