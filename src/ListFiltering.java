import java.util.LinkedList;
import java.util.List;

public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        List<Object> integerList = new LinkedList<>();
        for (Object o : list) {
            if (o instanceof Integer) {
                integerList.add(o);
            }
        }
        return integerList;
    }
}
