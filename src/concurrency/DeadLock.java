package concurrency;

public class DeadLock {

    public static void main(String[] args) {
        JavaFile firstFile = new JavaFile("file1");
        JavaFile secondFile = new JavaFile("file2");
        JavaCoder firstCode = new JavaCoder(firstFile, secondFile, "first coder:");
        JavaCoder secondCoder = new JavaCoder(secondFile, firstFile, "second coder:");
        firstCode.start();
        secondCoder.start();
    }
}

class JavaCoder extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "trying to checkin " + firstfile);
        this.firstfile.checkIn();
        this.secondfile.checkOut();
    }

    private JavaFile secondfile;
    private JavaFile firstfile;

    JavaCoder(JavaFile firstFile, JavaFile secondFile, String name) {
        super(name);
        this.firstfile = firstFile;
        this.secondfile = secondFile;
    }

};

class JavaFile {
    private String name;

    JavaFile(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public synchronized void checkIn() {
        System.out.println(Thread.currentThread().getName() + "in check-in " + this);      
        System.out.println(Thread.currentThread().getName() + "completing check-in " + this);
    }

    public synchronized void checkOut() {
        System.out.println(Thread.currentThread().getName() + "in check-out " + this);
        while (true) {
        }
    }
};
