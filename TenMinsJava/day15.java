// print a defined array, then remove the last item using array pop or equivalent
package TenMinsJava;

import java.util.ArrayList;
import java.util.Arrays;

public class day15 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("claus", "marvin", "nethercott", "hipolito"));
        names.remove(names.size() - 1);
        System.out.println(names);
    }
}
