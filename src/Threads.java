import java.util.function.Consumer;


public class Thread_test
{
    public void run()
    {
        Consumer<String> printMessage = message -> {
            for(int i = 0; i < 5; i++)
            {
                System.out.println(message + " Count: " + i);
            }
            System.out.println(message + "beendet");
        };

        Thread threadTest1 = new Thread(() -> printMessage.accept("Thread 1"));
        Thread threadTest2 = new Thread(() -> printMessage.accept("Thread 2"));
        Thread threadTest3 = new Thread(() -> printMessage.accept("Thread 3"));

        threadTest1.start();
        threadTest2.start();
        threadTest3.start();
    }





}
