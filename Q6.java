import java.io.*;
class Student implements Serializable{
    String name;
    int rollNo;

    Student(){}

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nRoll No: " + rollNo;
    }
}
public class Q6 extends Student{
    public static void main(String[] args) {
        Student s = new Student("Kaustav Saha",1929018);
        try {
            FileOutputStream fos = new FileOutputStream("myObjectsFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Write the object to the file
            oos.writeObject(s);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("myObjectsFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Read objects from the file
            Student st = (Student) ois.readObject();

            System.out.println(st.toString());

            ois.close();
            fis.close();
        } 
        catch(IOException e) {
            System.out.println(e);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}