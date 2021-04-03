public class Q2{
    public static void main(String[] args) {
        //demonstrating different constructors of StringBuffer
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Constructor with no parameter has capacity of: "+sb1.capacity());
        StringBuffer sb2 = new StringBuffer(5);
        System.out.println("Constructor with a integer parameter has capacity of: "+sb2.capacity());
        String str = "Hello";
        StringBuffer sb3 = new StringBuffer(str);
        System.out.println("Constructor with a string parameter has capacity of: "+sb3.capacity());
        CharSequence chS = "Java";
        StringBuffer sb4 = new StringBuffer(chS);
        System.out.println("Constructor with a character sequence parameter has capacity of: "+sb4.capacity());
        
        //ensureCapacity() and setLength() methods of StringBuffer
        sb3.ensureCapacity(24);
        System.out.println("Now capacity is: "+sb3.capacity());
        sb3.setLength(4);
        System.out.println("String after setting specific length: "+sb3);

        // charAt() and setCharAt() methods of StringBuffer
        System.out.println("Character at 0th index is: "+sb3.charAt(0));
        sb3.setCharAt(0,'Y');
        System.out.println("String after changing character at 0th index is: "+sb3);

        //getChars() and append() methods of StringBuffer
        char[] target = new char[2];
        sb3.getChars(0,2,target,0);
        System.out.print("Output of getChars(): ");
        for(int i=0;i<2;i++)
            System.out.print(target[i]);
        sb3.append("ow");
        System.out.println("\nString After appending: "+sb3);
        
        //insert(), reverse() and replace() methods of StringBuffer 
        sb3.insert(6," Color");
        System.out.println("String After inserting: "+sb3);
        sb3.reverse();
        System.out.println("String After reversing: "+sb3);
        sb3.reverse().replace(7,12,"Pepper");
        System.out.println("String After replacing: "+sb3);
    }
}