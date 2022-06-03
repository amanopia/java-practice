package ArraysAssignments;//package ArraysAssignments;
//
//import java.sql.SQLOutput;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class Panagram {
//    public static void main(String[] args) {
//        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        for(int i =0; i<sentence.length();i++){
//            System.out.println((int)sentence.charAt(i)-97);
//        }
//        boolean[] arr = new boolean[26];
//        for(int i=0;i<sentence.length();i++){
//            arr[sentence.charAt(i)-97] = true;
//        }
//        System.out.println(Arrays.toString(arr));
//        for(boolean b: arr){
//            if(!b){
//                System.out.println("Not a panagram");
//                break;
//            } else {
//                System.out.println("The sentence is a panagram");
//            }
//        }
//   }
//}

class Panagram {
    public static void main(String[] args) {
        String sentence = "thequ";
        System.out.println(panacheck(sentence));
    }
    static boolean panacheck(String sentence){
        if(sentence.length() <26){
            return false;
        }
        boolean[] arr = new boolean[26];
        for(int i=0; i<sentence.length(); i++){
            arr[sentence.charAt(i) - 97] = true;
        }
        for(boolean b:arr){
            if(!b){
                return false;
            }
        }
        return true;
    }
}