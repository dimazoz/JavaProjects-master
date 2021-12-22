package prak24;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg {
    private static String[] getDate(String t) {
        int count = 0;
        String[] allMatches = new String[2];
        Matcher m = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d").matcher(t);
        while (m.find()) {
            allMatches[count] = m.group();
            count++;
        }
        return allMatches;
    }

    public static void main(String[] args) {
        String text = "The credit was approved and issued on 25.11.2021 to a client with account number 34562737";
        String[] dates = getDate(text);
        System.out.println("Дата выдачи кредита:\n"+dates[0]);

    }
}
