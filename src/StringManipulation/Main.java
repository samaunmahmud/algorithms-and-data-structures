package StringManipulation;

public class Main {


    public static void main(String[] args){

        String s = "Me/I love you";


//        int number = CountVowels.countVowels(s);
//        System.out.println("Number of Vowles is : "+number);

        ReverseString reverseString = new ReverseString();

//        String st = reverseString.reverseString(s);

        ReverseWords reverseWords = new ReverseWords();

        String st = reverseWords.reverseWords(s);
        System.out.println(st);






    }
}
