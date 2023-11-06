import java.util.*;

public class SpinWords {

    public static String spinWords(String sentence){

        char[] charArray = sentence.toCharArray();
        char[] temp = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++){
            temp[i] = charArray[charArray.length-i-1];
        }
        return new String(temp);
    }

    public static void main(String[] args) {

        String s = "Thea is angry";
        System.out.println(spinWords(s));
    }
}
