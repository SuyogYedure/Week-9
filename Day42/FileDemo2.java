import java.io.FileOutputStream;
import java.io.FileWriter;
class FileDemo2{
  public static void main(String args[]){
     try{
       FileWriter flewriter=new FileWriter("names.txt");
       flewriter.write("abc, xyz, pqr, jkl");
       flewriter.close();
     }
     catch(Exception e){
       System.out.println(e);
     }
  }
}