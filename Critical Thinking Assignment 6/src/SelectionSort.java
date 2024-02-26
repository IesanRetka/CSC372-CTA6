import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {

    public static void sort(ArrayList<Student> arr, Comparator<Student> comp) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.size(); j++)
                if (comp.compare(arr.get(j), arr.get(min)) < 0)
                    min = j;

            Student temp = arr.get(min);
            arr.set(min, arr.get(i));
            arr.set(i, temp);
        }
    }
}
