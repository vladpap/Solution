import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < line.length(); i++) {
            for (int j = (line.length()); j >= i; j--) {
                String temp = line.substring(i, j);
                if (!temp.isEmpty()) {
                    set.add(temp);
                }
            }
        }
        System.out.println(set.size());
        scanner.close();
    }

}

