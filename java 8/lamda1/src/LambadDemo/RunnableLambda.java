package LambadDemo;

//class ThreadDemo implements Runnable
//{
//    @Override
//    public void run(){
//        System.out.println("Runnable using previous method");
//    }
//}



public class RunnableLambda {

    public static void main(String[] args) {

//        Thread thread1= new Thread(new ThreadDemo());
//        thread1.start();

        Runnable runnable= () ->{
            System.out.println(" we are overriding 'run()' method Using Lambda Expression ");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
