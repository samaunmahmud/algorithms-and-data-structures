package StringManipulation;

public class ReverseWords {

    public String reverseWords(String s){

        if(s == null || s.length() == 0){
            throw new NullPointerException();
        }
        String[] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");

        }
        return sb.toString();
    }
}
