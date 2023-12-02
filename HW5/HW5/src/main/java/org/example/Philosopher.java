package org.example;

public class Philosopher implements Runnable {

    private Object leftFork;
    private Object rightKnife;
    private int count = 1;

    public Philosopher(Object leftFork, Object rightKnife) {
        this.leftFork = leftFork;
        this.rightKnife = rightKnife;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (count <= 3) {
                    doAction(" : Размышляет");
                    synchronized (leftFork) {
                        doAction(" : Поднимает слева вилку");
                        synchronized (rightKnife) {
                            doAction(" : Поднимает справа нож - обедает");
                            doAction(" : кладет справа нож");
                        }
                        doAction(" : Кладет слева вилку. Возвращается размышлять");
                        count++;
                    }
                } else {
                    doAction(" : Размышляет");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println(
                Thread.currentThread().getName() + " " + action);
        Thread.sleep(400);
    }


}
