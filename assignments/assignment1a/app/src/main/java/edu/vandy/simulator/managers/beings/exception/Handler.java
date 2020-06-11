package edu.vandy.simulator.managers.beings.exception;

public class Handler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("unexpected exception " + e.getMessage() +" occurred for thread "+ t.getName());
    }
}
