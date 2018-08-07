package concurrent.readwritelock;




// WritingThread不断写入数据，每次写入的都是10个相同的字符：

public class WritingThread extends Thread {

    private DataHandler handler;

    public WritingThread(DataHandler handler) {
        this.handler = handler;
    }

    public void run() {
        char[] data = new char[10];
        for(;;) {
            try {
                fill(data);
                handler.write(getName(), data);
                Thread.sleep((long)(Math.random()*1000+100));
            }
            catch(InterruptedException ie) {
                break;
            }
        }
    }

    // 产生一个A-Z随机字符，填入char[10]:
    private void fill(char[] data) {
        char c = (char)(Math.random()*26+'A');
        for(int i=0; i<data.length; i++)
            data[i] = c;
    }

}