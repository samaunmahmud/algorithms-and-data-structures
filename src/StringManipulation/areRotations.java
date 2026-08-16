package StringManipulation;

public class areRotations {
    public static boolean Rotations(String str1, String str2){
        if(str1 ==null || str2 == null){
            return false;
        }

        if(str1.length() != str2.length()){
            return false;
        }

        if(!(str1+str1).contains(str2)){
            return false;
        }

        return true;

    }
}
