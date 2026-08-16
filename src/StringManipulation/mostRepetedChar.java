package StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class mostRepetedChar {

    public Character RepetedChar(String str){

        if(str == null || str.length()==0){
            return ' ';
        }


        Map<Character,Integer> map = new HashMap<>();



        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }

        char ch=' ';
        int count =0;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>count){
                ch = entry.getKey();
                count = entry.getValue();
            }
        }

        return ch;

    }
}
