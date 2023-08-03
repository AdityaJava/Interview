package Deutschebank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KaprekarConstant {
    static Integer iterations = 0;

    /*
    input>=1000 and input<=9999
     */
    public static void main(String[] args) {
        for(int i=1000; i<=9999; i++){
            checkKaprekarConstant(i);
        }
    }

    public static void checkKaprekarConstant(Integer input) {
        Integer realInput = input;
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            integers.add(input % 10);
            input = input / 10;
        }

        List<Integer> ascendingList = integers.stream().sorted().collect(Collectors.toList());
        List<Integer> descendingList = integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Integer number1 = convertListToNumber(ascendingList);
        Integer number2 = convertListToNumber(descendingList);

        if(Math.abs(number1-number2)==6174){
            iterations++;
            System.out.println(realInput+" is karpekers constant needed iterations "+iterations);
            return;
        }
        else if(Math.abs(number1-number2)==0 || Math.abs(number1-number2)<6174){
            iterations=0;
            return;
        }
        else {
            iterations++;
            checkKaprekarConstant(Math.abs(number1-number2));
        }

    }

    public static Integer convertListToNumber(List<Integer> orderedList) {
        Integer sum = 0;
        Integer multiplier = 1000;
        for (Integer element : orderedList) {
            sum = sum + element*multiplier;
            multiplier = multiplier/10;
        }
        return sum;
    }


}
