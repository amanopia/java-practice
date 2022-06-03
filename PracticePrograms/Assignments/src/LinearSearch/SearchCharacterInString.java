package LinearSearch;

import java.util.Scanner;

public class SearchCharacterInString {
    public static void main(String[] args){
        String str = "asdad asdadaa asd";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char alphabet = in.next().charAt(0);
        System.out.print(searchStr(str, alphabet));
    }
    static boolean searchStr(String str, char alph){
        //base case
         if(str.length() == 0){
             return false;
         }
         for(char a:str.toCharArray()){
             if(a == alph){
                 return true;
             }
         }
         return false;
    }
}
