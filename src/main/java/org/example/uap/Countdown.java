package org.example.uap;

import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
    private Timer timer;
    private TimerTask task;
    private int duration;
    private int counter;

    public Countdown(int duration) {
        this.duration = duration;
        this.timer = new Timer();
    }

    public void start() {
        task = new TimerTask() {
            @Override
            public void run() {
                if (duration > 0) {
                    System.out.println(duration + " seconds");
                    duration--;
                } else {
                    System.out.println("Done");
                    stop();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
    public void stop() {
        task.cancel();
        timer.cancel();
    }

    public void reset() {
        stop();
        start();
    }

    public int getRemainingTime() {
        return duration;
    }
}
