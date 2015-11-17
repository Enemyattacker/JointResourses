package ru.stetsenko;

public class Main {

    public static void main (String[] args) {
        Demo thread = new Demo();
        thread.setName("FIRST: ");

        Demo anotherThread = new Demo();
        anotherThread.setName("SECOND: ");

        thread.start();
        anotherThread.start();

        try{
            thread.join();
            anotherThread.join();
        }
        catch(InterruptedException e){
            System.out.println("Поток прерван");
        }

        System.out.println("Финальное значение " + Demo.count);
}
}
