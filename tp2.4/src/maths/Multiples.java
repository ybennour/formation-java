package maths;

public class Multiples {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Veuillez passer un argument au programme!");
            return;
        }

        Integer num = new Integer(args[0]);
        for (int i = 0; i < 1000; i++) {
            if (i % num == 0) {
                System.out.println(i);
            }
        }
    }
}
