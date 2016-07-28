
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineInteger = scanner.nextLine().split(" ");
//        int n = Integer.valueOf(lineInteger[0]);
        int k = Integer.valueOf(lineInteger[1]);

        String[] array = scanner.nextLine().split(" ");
        String[] b = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            list.add(Integer.valueOf(b[i]));
        }
        for (int i = 0; i < k; i++) {
            List<String> stringsList = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                if ((j + 1) % list.get(i) != 0) {
                    stringsList.add(array[j]);
                }
            }
            array = stringsList.toArray(new String[stringsList.size()]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if ((i + 1) != array.length) {
                System.out.print(" ");
            }
        }
        System.out.println("");

        scanner.close();
    }

}

