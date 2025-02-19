package stringbased.countvowels;

public class CountVowels {
    public static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiou";
        for (String string : s.split("")) {
            if (vowels.contains(string)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("hello world")); // Output: 3
    }
}
