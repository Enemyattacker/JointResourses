package ru.stetsenko;

public class Demo extends Thread {

    public int count;
    public void increment(String name){
        count++;
        System.out.println(name+count);
    }

    public void run(){
        for(int j=0; j<1000; j++) {
            increment(getName());
        }
    }
}
