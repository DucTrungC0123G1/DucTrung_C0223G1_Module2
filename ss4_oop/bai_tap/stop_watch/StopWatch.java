package ss4_oop.bai_tap.stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (this.endTime - this.startTime);
    }
}
