package ss4_class_oop_in_java.exersice.stop_watch;

public class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.staTime();
        sw.getStartTime();

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 100000; j++) {
                for (int k = 0; k < 10; k++) {

                }
            }
        }
        sw.stoTime();
//        sw.getElapsedTime();
//        sw.getStopTime();
        System.out.println(sw.getStartTime());
        System.out.println(sw.getStopTime());
        System.out.println(sw.getElapsedTime());

    }
}
