package com;

public class MultiThreading {
    public static void main(String[] args) {
//        System.out.println("main start...");
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
//                System.out.println(Thread.currentThread().getName()+" run...");
                int[] a = new int[]{1, 3, 5, 7, 9, 11};
                for(int i:a){
                    System.out.println(i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {}
                }
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
//                System.out.println(Thread.currentThread().getName()+" run...");
                int[] b = new int[]{2, 4, 6, 8, 10, 12};
                for(int i:b){
                    System.out.println(i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {}
                }
            }
        };

        new Thread(runnable1).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
        new Thread(runnable2).start();
//        System.out.println("main end...");
    }
}

