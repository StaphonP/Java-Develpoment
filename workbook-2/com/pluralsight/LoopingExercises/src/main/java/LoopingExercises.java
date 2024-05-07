public class LoopingExercises {
    public class WhileLoop {
        public static void main(String[] args) {
            int count = 1;
            int sum = 0;
            while(count<=5) {
                System.out.println("I Love Java!");
                sum+=count;
                count++;
            }
        }

    }
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
    public class ForLoop {
        public static void main(String[] args) throws InterruptedException {
            for(int i = 10; i >=1; i--) {
                System.out.println(i+" ");
                Thread.sleep(1000);}
            System.out.println("LAUNCH!");
            }
        }
    }


