import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.isEmpty()) {
                break;
            }
            line += (" " + nextLine);
        }
        String[] words = line.toLowerCase().split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            int countWord = 0;
            if (map.get(word) != null) {
                countWord = map.get(word);
            }
            countWord++;
            if ((!word.equals(" ")) && (!word.isEmpty())) {
                map.put(word, countWord);
            }
        }

        int countMax = Collections.max(map.values());
        Set<String> set = new TreeSet<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == countMax) {
                set.add(entry.getKey());
            }

        }

        for (String s : set) {
            System.out.println(s);
        }

        scanner.close();
    }
}

