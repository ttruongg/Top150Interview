import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void reverseString(char[] s) {
//        int i = 0;
//        int j = s.length - 1;
//
//        while (i < j) {
//            char tmp = s[i];
//            s[i] = s[j];
//            s[j] = tmp;
//            i++;
//            j--;
//        }

        ArrayList<Character> myList = new ArrayList<>();
        for (char c: s){
            myList.add(c);
        }
        Collections.reverse(myList);
        for (int i = 0; i < s.length; i++){
            s[i] = myList.get(i);
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        System.out.println(s);
    }
}