import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> posList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for (Integer item: intList) {
            if (item > 0) {
                posList.add(item);
                if (item % 2 == 0) {
                    evenList.add(item);
                }
            }
        }

        Collections.sort(evenList);
        Collections.sort(posList);
        System.out.println(evenList);
        System.out.println(posList);


    }
}

