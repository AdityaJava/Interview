package Youtube;

public class ExceptionHandling {

    public static void main(String[] args) {
        String s = example();
        System.out.println(s);
    }

    public static String example() {
        try {
            System.out.println("sout try");
            int a = 1 / 0;
            return "try";
        } catch (Exception e) {
            System.out.println("sout catch");
            return "catch";
        } finally {
            System.out.println("sout finally");
        }
    }
}
