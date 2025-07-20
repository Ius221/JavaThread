/* PROBLEM -- 1
Thread Creation Approaches
Explain two ways to create a thread in Java. Create one assignment program using each approach to demonstrate your understanding.
* */
/*
* The SOLUTION
* The two ways are
* i. Implementing runnable interface
* ii. extends Thread class
* */


package com.gupta.Thread.basic.first;
public class Main {
    public static void main(String[] args) {
//        By Extending Thread class
        MyThread myThread = new MyThread();
        myThread.start();

//        By Implementing runnable interfaces
        MyThreadInteface myThreadInteface = new MyThreadInteface();
        Thread t1 = new Thread(myThreadInteface);
        t1.start();
    }
}

class MyThread extends  Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(i+" "+currentThread().getName());
        }
    }
}

class MyThreadInteface implements  Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}