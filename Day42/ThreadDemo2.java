class RunThread implements Runnable{
  public void run(){
    System.out.println("Thread is Running");
  }
}
class ThreadDemo2{
  public static void main(String args[]){
    RunThread rt1 = new RunThread();
    Thread thread = new Thread(rt1);
    thread.start();
  }
}