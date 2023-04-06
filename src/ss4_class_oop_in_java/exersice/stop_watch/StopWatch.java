package ss4_class_oop_in_java.exersice.stop_watch;

import javafx.scene.paint.Stop;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.stopTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public void staTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void stoTime() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.stopTime - this.startTime;
    }
}

