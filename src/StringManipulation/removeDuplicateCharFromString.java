package StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicateCharFromString {

    public String removeDuplicate(String str){
        if(str == null || str.length() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(var c :str.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();

    }
}
