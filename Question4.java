//Q4: Write a Java Program to find the duplicate characters in a string.

public class DuplicateCharacters {  
     public static void main(String[] args) {  
        String string1 = "Pragya das";  
        int count;  
        char string[] = string1.toCharArray();  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    string[j] = '0';  
                }  
            }  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }  
}  
