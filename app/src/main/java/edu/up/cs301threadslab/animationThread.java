package edu.up.cs301threadslab;

/**
 * Created by whiteake19 on 11/16/2016.
 */
public class animationThread extends Thread {
    AnimationView amV;

    public animationThread(AnimationView v){
        amV = v;
    }

    public void run(){
        while(true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            amV.postInvalidate();
        }
    }
}
