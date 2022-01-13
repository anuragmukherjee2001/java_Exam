
class Q18B {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        System.out.println("Name of main thread is");
        System.out.println(Thread.currentThread().getName());

        t.start();
    }
}

class Mythread extends Thread { // extending Thread class
    // executiion main thread --> extended thread

    public void run() {
        System.out.println("Name of child thread is");
        System.out.println(Thread.currentThread().getName());
    }
}

