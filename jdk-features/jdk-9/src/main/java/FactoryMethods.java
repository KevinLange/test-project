import java.util.List;

public class FactoryMethods {

    public void emptyList() {
        List<String> immutableList = List.of();
    }

    public void nonEmptyList() {
        List<String> immutableList = List.of("A", "B");
    }
}
