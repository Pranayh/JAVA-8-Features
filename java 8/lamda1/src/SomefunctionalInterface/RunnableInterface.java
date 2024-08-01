package SomefunctionalInterface;

public class RunnableInterface {
    public static void main(String[] args) {

        Runnable runnable = () ->System.out.println("this is runnable only override run() method using Lambda Function  ");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
