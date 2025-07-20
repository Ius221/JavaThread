//Thread Name and Priority
//Write a program that sets and displays the name and priority of two threads. Observe and note how thread priorities affect execution.

package com.gupta.Thread.basic.second;

public class Main extends Thread {
//    SETTING THREAD NAME
    Main(String name){
        super(name);
    }

    public static void main(String[] args) {
        Main  m1 = new Main("First_Thread");
        Main  m2 = new Main("Second_Thread");
        Main  m3 = new Main("Third_Thread");
        Main  m4 = new Main("Fourth_Thread");

        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        m3.setPriority(1);      //MIN_PRIORITY
        m4.setPriority(9);      //MAX_PRIORITY

        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" with priority "+Thread.currentThread().getPriority());
    }
}
