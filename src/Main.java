import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> integers = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            integers.add(random.nextInt(400) );
            sum+=integers.get(i);
        }
        System.out.println(integers);
        System.out.println(sum);
        HashSet<Integer>integers1 = new HashSet<>();
        integers1.addAll(integers);
        int sum2 = 0;
        for (Integer integer : integers1) {
            sum2+=integer;
            System.out.println(integer);
        }
        System.out.println("sum2: " + sum2);

    }
}