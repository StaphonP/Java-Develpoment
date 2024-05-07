public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;
        int loop = 0;
        do {
            loop += count;
            count++;
            System.out.println("I Love Java!");
        } while (count <= 5);
    }
}