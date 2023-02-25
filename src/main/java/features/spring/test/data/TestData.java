package features.spring.test.data;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    public static List<String> testList = new ArrayList<>() {
        {
            add("TestList");
            add("Test");
            add("List");
            add("Table");
            add("Harry Potter");
            add("Legacy");
        }
    };
}
