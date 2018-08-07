package concurrent.readwritelock;

public class Main {

    public static void main(String[] args) {
        DataHandler handler = new DataHandler();
        Thread[] ts = new Thread[] {
                new ReadingThread(handler),
                new ReadingThread(handler),
                new ReadingThread(handler),
                new ReadingThread(handler),
                new ReadingThread(handler),
                new WritingThread(handler),
                new WritingThread(handler)
        };
        for(int i=0; i<ts.length; i++) {
            ts[i].start();
        }
    }

}