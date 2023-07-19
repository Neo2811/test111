package interestingTest;

public class Test5 {
    public static void main(String[] args) {
        try {
            System.out.println("M");
            System.exit(0);
        }finally {
            System.out.println("F");
        }
    }
}
