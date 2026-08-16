package StringManipulation;

public class CapitilizingString {


    public String capitilize(String s){

        if(s==null || s.length()==0){
            return "";
        }

        String[] arr = s.trim().replaceAll(" +"," ").split(" ");


        for(int i =0; i<arr.length;i++){
            arr[i]= arr[i].substring(0,1).toUpperCase()+
                    arr[i].substring(1).toLowerCase();


        }

        StringBuilder sb = new StringBuilder();

        for(String str : arr){
            sb = sb.append(str).append(" ");


        }

        return sb.toString();

    }
}
