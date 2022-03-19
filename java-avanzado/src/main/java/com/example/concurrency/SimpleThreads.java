package com.example.concurrency;

public class SimpleThreads {

    static long patience = 50000;
    static String[] messages = {
            "Mensaje 1",
            "Mensaje 2",
            "Mensaje 3",
            "Mensaje 4",
    };

    public static void main(String[] args)  throws InterruptedException {
        Thread.currentThread().setName("thread1");

        long startTime = System.currentTimeMillis();

        Thread thread2 = new Thread(() -> {
            Thread.currentThread().setName("thread2");
            threadMessage("Iniciando trabajo");
            try {
                for (String message : messages) {
                    Thread.sleep(4000);
                    threadMessage(message);
                }
                threadMessage("Ejecución correcta, fin :)");
            } catch (InterruptedException e) {
                threadMessage("Hilo interrumpido!");
            }
        });
        thread2.start();

        threadMessage("Esperando a que thread2 termine");

        while (thread2.isAlive()) {
            threadMessage("Continúo esperando...");
            thread2.join(1000);
            long elapsedTime = System.currentTimeMillis() - startTime;
            if ( elapsedTime > patience && thread2.isAlive()) {
                threadMessage("Me cansé de esperar!");
                thread2.interrupt();
                thread2.join();
            }
        }
        threadMessage("Fin");
    }

    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }
}

