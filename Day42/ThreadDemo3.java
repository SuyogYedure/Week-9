class RunThread implements Runnable{
  public void run(){
    for(int i=1;i<=10;i++){
      System.out.println(i);
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }
}
class ThreadDemo{
  public static void main(String args[]){
    RunThread rt1=new RunThread();
    RunThread rt2=new RunThread();
    Thread thread=new Thread(rt1);
    Thread thread1=new Thread(rt2);
    
    thread.start();
      
    thread1.start();
    
  }
}