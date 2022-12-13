public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i += 1;
//        }

//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -10);

        for (int j = 100; j >= -10; j-=5){
            System.out.println(j);
        }

//        long p = 2;
//        do {
//            System.out.println(p);
//            p *= p;
//        } while (p < 1000000);

        for (long p = 2; p < 1000000; p *= p) {
            System.out.println(p);
        }

    }
}
