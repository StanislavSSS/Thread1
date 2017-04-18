package com.ru.isbank;

/**
 * @author sk10271
 *
 */
public class App 
{
    public static void main( String[] args ){
/*        if (!Thread.interrupted())
        try {
            System.out.println("Lets sleep!");
            Thread.sleep(1);
            thread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        FileCreator fileCreator = new FileCreator();
        fileCreator.start();

        FileCreator fileCreator2 = new FileCreator();
        fileCreator2.start();

        FileCreator fileCreator3 = new FileCreator();
        fileCreator3.start();

        FileCreator fileCreator4 = new FileCreator();
        fileCreator4.start();

        FileCreator fileCreator5 = new FileCreator();
        fileCreator5.start();

    }

    public static void thread() throws InterruptedException {
        Thread thread = new Thread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());

        System.out.println("-------------------");

        Thread daemonthread = new Thread();
        daemonthread.setDaemon(true);
        System.out.println(daemonthread.getId());
        System.out.println(daemonthread.getName());
        System.out.println(daemonthread.getThreadGroup());
        System.out.println(daemonthread.getPriority());
        System.out.println(daemonthread.getState());

        System.out.println("-------------------");

        Thread thread3 = new Thread();
        System.out.println(thread3.getId());
        System.out.println(thread3.getName());
        System.out.println(thread3.getThreadGroup());
        System.out.println(thread3.getPriority());
        System.out.println(thread3.getState());

        System.out.println("-------------------");

        Thread thread2 = Thread.currentThread();
        System.out.println(thread2.getId());
        System.out.println(thread2.getName());
        System.out.println(thread2.getThreadGroup());
        System.out.println(thread2.getPriority());
        System.out.println(thread2.getState());
    }
}