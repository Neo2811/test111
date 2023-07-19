package interestingTest;

public class Test10 {
    public static void main(String[] args) {
        System.out.print("A");
        synchronized (args) {
            System.out.println("B");
            try {
                args.wait();
            }catch (InterruptedException e) {
                System.out.println("C");
            }finally {
                System.out.println("D");
            }
        }
        System.out.println("E");
    }
}
