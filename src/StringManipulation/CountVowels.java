package StringManipulation;

import java.util.Locale;

public class CountVowels {

    public static int countVowels(String s){
        int count =0;
        String str = s.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }

        }
        return count;

    }


}
