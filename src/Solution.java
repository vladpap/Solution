
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> coder = new HashMap<>();
        int coderNumber = 1;

        do {
            String nextword = scanner.next().toLowerCase();
            if (coder.get(nextword) == null) {
                coder.put(nextword, coderNumber);
                System.out.print(coderNumber + " ");
                coderNumber++;
            } else {
                System.out.print(coder.get(nextword) + " ");
            }
        } while (scanner.hasNext());

    }

}
