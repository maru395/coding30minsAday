// print array, and then push a new item using array push or equivalent
package TenMinsJava;

import java.util.ArrayList;
import java.util.Arrays;

public class day16 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("claus", "marvin", "nethercott"));
        names.add("hipolito");
        System.out.println(names);
    }
}
