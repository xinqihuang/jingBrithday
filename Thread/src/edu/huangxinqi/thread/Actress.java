package edu.huangxinqi.thread;

/**
 * Created by huangxinqi on 2016/12/17/0017.
 */
public class Actress implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<100){
            System.out.println(i+"董子敬我喜欢你！");
            i++;
        }
    }
}
