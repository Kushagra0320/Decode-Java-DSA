package Strings;
import java.util.*;
public class Substrings {
    public static void main(String[] args) {
        // program to print all substrings of a given string
        String s="abcde";
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i+1; j <=s.length() ; j++) {// always start with i+1 and will go to length of string
                System.out.println(s.substring(i,j));

            }

        }
    }
}
