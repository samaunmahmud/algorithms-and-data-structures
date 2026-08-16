package StringManipulation;

import java.util.Arrays;

public class Anagrams1 {

    public boolean anagram(String a , String b){
        if(a.length()!=b.length()|| a.length()==0||b.length()==0||a ==null||b ==null){
            return false;
        }
        var aa = a.toCharArray();
        var bb = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);

        for(int i =0;i<aa.length;i++){
            if(aa[i]!=bb[i]){
                return false;
            }

        }
        return true;


    }
}
