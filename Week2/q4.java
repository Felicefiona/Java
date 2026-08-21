import java.util.Scanner;

public class q4 {

    static String normalizeCode(String code) {

        code = code.trim();
        code = code.toUpperCase();

        if (code.length() != 13) {
            return "Invalid: code must be 13 characters";
        }

        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        // Check publisher has only letters
        for (int i = 0; i < publisher.length(); i++) {
            if (!Character.isLetter(publisher.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        // Check year and catalog contain only digits
        for (int i = 0; i < year.length(); i++) {
            if (!Character.isDigit(year.charAt(i))) {
                return "Invalid: year must contain digits";
            }
        }

        for (int i = 0; i < catalog.length(); i++) {
            if (!Character.isDigit(catalog.charAt(i))) {
                return "Invalid: catalog must contain digits";
            }
        }

        return "[" + publisher + "] YEAR: " + year
                + " | CATALOG: " + catalog;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN code: ");
        String code = sc.nextLine();

        System.out.println(normalizeCode(code));

        sc.close();
    }
}