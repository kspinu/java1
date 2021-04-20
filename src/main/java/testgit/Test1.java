package testgit;

import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {8,9,10,1,2,3,4,5};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


        int[] arrDesc = Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(arrDesc));
    }
}
