package ru.job4j.concurrent;

public class ThreadState {
    public static void main(String[] args) {
        Thread first = new Thread(
                () -> System.out.println(Thread.currentThread().getName())
        );
        Thread second = new Thread(
                () -> System.out.println(Thread.currentThread().getName())
        );
        System.out.println("first " + first.getState());
        first.start();
        System.out.println("second " + second.getState());
        second.start();
        while ((first.getState() != Thread.State.TERMINATED) || (second.getState() != Thread.State.TERMINATED)) {
            System.out.println("first " + first.getState());
            System.out.println("second " + second.getState());
        }
        System.out.println("first " + first.getState());
        System.out.println("second " + second.getState());
    }
}
