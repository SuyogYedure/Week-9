import java.io.FileOutputStream;
import java.io.FileWriter;
class FileDemo{
  public static void main(String args[]){
    try{
      FileOutputStream flewriter=new FileOutputStream("notes.txt");
      String str="Java Programming";
      byte bytes[]=str.getBytes();
      
      flewriter.write(bytes);
      flewriter.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}