public class Main {
    public static void main(String[] args) {
        String greeting = "Welcome to my Java program.";
        System.out.println(greeting);

        System.out.println("Function 1 /////////////////////////////////////////////////");

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        System.out.println("Function 2 /////////////////////////////////////////////////");

        flipNHeads(1);

    }

    public static String pluralize(String name, int count) {
        if (count == 0 || count > 1) {
            return name + "s";
        } else {
            return name;
        }
    }

    public static void flipNHeads(int n) {
        int numFlips = 0;
        int seqFlips = 0;
        while (seqFlips != n) {
            int random = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
            if (random > .5) {
                System.out.println("heads");
                numFlips++;
                seqFlips++;
            } else {
                System.out.println("tails");
                seqFlips = 0;
                numFlips++;
            }
        }
        System.out.println("It took " + numFlips + " flips to flip " + n + " heads in a row.");

    }

}