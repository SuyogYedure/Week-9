import java.io.FileOutputStream;
import java.io.FileWriter;
class ReadDemo{
  public static void main(String args[]){
    try{
      FileReader fr=new FileReader("notes.txt");
      int i;
      while((i=fr.read())!=-1){
        System.out.print((char)i);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}