package edu.huangxinqi.thread;

/**
 * Created by huangxinqi on 2016/12/17/0017.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread=new Actor();
        int i=0;
        thread.start();
        Actress actress=new Actress();
        Thread thread1=new Thread(actress);
        thread1.start();

    }
}
