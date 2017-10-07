package cit360.threads;

public class ThreadExample extends Thread {

    public void run() {
        System.out.println("Using a Thread to say Hello");
    }

    public static void main(String args[]) {
        ThreadExample ht = new ThreadExample();
        ht.run();
    }

}