package ss4_oop.bai_tap.stop_watch;

public class StopWatchMain {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                for (int k = 0; k < 10000; k++) {

                }
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
