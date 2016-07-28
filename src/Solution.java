import java.util.ArrayDeque;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayDeque<Integer> queueOpen = new ArrayDeque<>();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                queueOpen.push(i);
            } else {
                map.put(queueOpen.pop(), i);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println((entry.getKey() + 1) + " " + (entry.getValue() + 1));
        }

        scanner.close();
    }

}

