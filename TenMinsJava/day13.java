// loop through a numeric array printing both the index and the value
package TenMinsJava;

import java.util.stream.IntStream;

public class day13 {
    public static int nums[] = {1,2,3,4,5};
    public static void main(String[] args) {
        // other way to for loop, 0 is the start, nums.length is the end, using forEach method to print
        IntStream.range(0, nums.length).forEach((i) -> {
            System.out.println(i + " " + nums[i]);
        });
    }
}
