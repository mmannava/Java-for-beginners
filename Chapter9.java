import java.util.Scanner;

/**
 * Created by Manasa on 3/4/2016.
 *  This program represents the thread behaviour as per command issued.
 */
public class Chapter9 {
    public static void main(String args[]){
        System.out.println("Issue a command to the thread");
        System.out.println("They could be either start() or sleep() or wait() or suspend() or notify() or resume() or stop() or run()");
        Scanner sc = new Scanner(System.in);
        String threadLifeCycle = sc.nextLine();

        switch(threadLifeCycle){

            case "start()":
                System.out.println("Thread Started execution");
                break;
            case "sleep()":
                System.out.println("Thread is in sleep mode");
                break;
            case "wait()":
                System.out.println(" The thread is waiting to be executed");
                break;
            case "suspend()":
                System.out.println("The thread has been suspended");
                break;
            case "notify()":
                System.out.println("The thread has been notified for execution");
                break;
            case "resume()":
                System.out.println("The thread has resumed execution");
                break;
            case "stop()":
                System.out.println("The thread has stopped execution");
                break;
            case "run()":
                System.out.println("The thread is running");
                break;
        }
    }
}
