public class Main {

    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("Hello world!");
                    Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
