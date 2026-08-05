public class Problem1 {

    // ---------- Problem 1: Exam Hall Seat Duplication Checker ----------
    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean foundDuplicate = false;
        boolean[] alreadyPrinted = new boolean[seatNumbers.length];

        for (int i = 0; i < seatNumbers.length; i++) {
            if (alreadyPrinted[i]) continue;

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    foundDuplicate = true;
                    alreadyPrinted[j] = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }
}