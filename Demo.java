package ru.stetsenko;

public class Demo extends Thread {
    public static int count;
    public synchronized void increment(String name){
        count++;
        System.out.println(name+count);
    }

    public void run(){
        for(int j=0; j<1000; j++) {
            increment(getName());
        }
    }
}
