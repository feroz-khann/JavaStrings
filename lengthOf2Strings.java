import java.util.Scanner;

public class lengthOf2Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int totLength = str1.length()+str2.length();
        System.out.println(totLength);
    }
}
