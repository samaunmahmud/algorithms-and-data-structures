package StringManipulation;

public class Main {


    public static void main(String[] args){

        String s = "aEiOu";

//        int number = CountVowels.countVowels(s);
//        System.out.println("Number of Vowles is : "+number);

        ReverseString reverseString = new ReverseString();

        String st = reverseString.reverseString(s);
        System.out.println(st);






    }
}
