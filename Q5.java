import java.io.*;

public class Q5{
    public static void main(String[] args){
		try{
			FileReader fr = new FileReader(new File("originalFile.txt"));
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("copiedFile.txt", true);
			
			int ch;		
			while((ch = br.read())!= -1){ 	
                fw.write((char)ch);
				fw.flush();
			}
			br.close();
			fw.close();
            
			System.out.println("File copied successfully!");
		} 
		catch(IOException e){
			System.out.println("Exception Occured!\n"+e);
		}
		catch(Exception e){
			System.out.println("Exception Occured!\n"+e);
        }
    }
}