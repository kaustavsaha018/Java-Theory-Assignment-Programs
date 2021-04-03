import java.util.*;
public class Q1{
    public static void characterOccurences(String str, char ch){
        int i=0,found=-1,count=0;
        while(i<str.length()){
            found=str.indexOf(ch,i);
            if(found==-1){break;}
            else{
                count++;
                System.out.println(ch+" is found in position: "+found+" of the original string: "+str);
                i=found+1;
                found=-1;
            }
        }
        if(count==0){
            System.out.println(ch+" is not found in any position of the original string: "+str);
        }
        else{
            System.out.println("\nIn total "+ch+" is found "+count+" times in the original string: "+str);
        }
    }
    public static void stringReverse(String str){
        StringBuffer myStr = new StringBuffer(str);
        System.out.println("\nString in Reverse order: "+myStr.reverse());  
    }
    public static void wordCount(String str){
        int i=0,found=-1,count=0;
        while(i<str.length()){
            found=str.indexOf(' ',i);
            if(found==-1){break;}
            else{
                count++;
                i=found+1;
                found=-1;
            }
        }
        System.out.println("\nTotal no. of words in the string: "+str+" are: "+(count+1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);
        
        characterOccurences(str,ch);
        stringReverse(str);
        wordCount(str);
    }
}