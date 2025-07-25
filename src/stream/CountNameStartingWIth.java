package stream;

public class CountNameStartingWIth {
    public static void main(String[] args) {
        long countA = employees.stream()
                .filter(e -> e.getName().startsWith("A"))
                .count();

    }
}
