import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int countLine = scanner.nextInt();
        for (int i = 0; i < countLine; i++) {
            int query = scanner.nextInt();
            if (query == 1) {
                int valueAsKey = scanner.nextInt();
                Integer countValue = map.get(valueAsKey);
                if (countValue == null) {
                    countValue = 1;
                } else {
                    countValue++;
                }
                map.put(valueAsKey, countValue);
            } else {
                if (map.size() > 0) {
                    int firstKey = map.firstKey();
                    int firstValue = map.get(firstKey);
                    if (firstValue == 1) {
                        map.remove(firstKey);
                    } else {
                        map.put(firstKey, --firstValue);
                    }
                    System.out.println(firstKey);
                }
            }
        }


        scanner.close();
    }

}

