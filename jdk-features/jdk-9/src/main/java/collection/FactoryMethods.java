package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {

    public void emptyList() {
        List<String> immutableList = List.of();
    }

    public void nonEmptyList() {
        List<String> immutableList = List.of("A", "B");
    }

    /**
     * @see https://www.journaldev.com/12984/javase9-factories-for-immutable-set
     */
    public void emptySet() {
        Set immutableSet = Set.of();
    }

    public void nonEmptySet() {
        Set<String> immutableSet = Set.of("one","two","three");
    }

    public void nonEmptySetVarargs() {
        String[] nameArr =  { "one", "two", "three"};
        Set<String[]> set= Set.<String[]>of(nameArr);
    }

    public void emptyMap() {
        Map emptyImmutableMap = Map.of();
    }

    public void nonEmptyMap(){
        Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
    }
}
