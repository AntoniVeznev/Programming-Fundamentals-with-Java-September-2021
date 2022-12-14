package Labs.L05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();

        int minSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSize; i++) {
            int firstItem = firstList.get(i);
            int secondItem = secondList.get(i);
            resultList.add(firstItem);
            resultList.add(secondItem);

        }

        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(minSize, firstList.size()));

        } else if (secondList.size() > firstList.size()) {
            resultList.addAll(secondList.subList(minSize, secondList.size()));

        }

        for (Integer result : resultList) {
            System.out.print(result + " ");

        }
    }
}
