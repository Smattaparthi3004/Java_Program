//Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
package Task_25092024;

import java.util.Scanner;

public class lab_count {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        name=name.toLowerCase();  // convert the given name in to lowercase
        int Vowel_Count=0, Conson_Count=0;
        int len=name.length();   //lenght of the String Sowjanya->8
        for(int i=0;i<len;i++)
        {
            char ch=name.charAt(i);  // ch holds each single value
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u')
                Vowel_Count=Vowel_Count+1;
            else
                Conson_Count=Conson_Count+1;

        }
        System.out.println("Total No of Vowels :"+ Vowel_Count);
       System.out.println("Total No of Consonants :"+Conson_Count);
    sc.close();
    }
}

/*
--------Output------------
Enter Name:
sowjanya
Total No of Vowels :3
Total No of Consonants :5
*/