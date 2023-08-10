package leetcode.twonumbersaddionlinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        List<String> sl = Arrays.asList( s.split(""));
        String temp = new String();
        List<String> palindromes = new ArrayList<>();
        for(int i=0; i< (sl.size()-1); i++){
            temp = sl.get(i);
            for(int j=i+1; j<sl.size(); j++){
                temp = temp + sl.get(j);
                StringBuilder sb =new StringBuilder(temp);
                //System.out.println(sb.toString());
                if(sb.reverse().toString().equals(temp) && temp.length()>1){
                    palindromes.add(temp);
                }
            }
        }
        String longest = palindromes.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().orElse(null);
        palindromes.forEach(p->System.out.println(p));
        return longest;
    }
}