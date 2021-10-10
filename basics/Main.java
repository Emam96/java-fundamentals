


import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {



		Main object = new Main();

    

        System.out.println("Function 1 /////////////////////////////////////////////////");

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        System.out.println("Function 2 /////////////////////////////////////////////////");

        flipNHeads(1);

        System.out.println("Function 3 /////////////////////////////////////////////////");

        
        object.clock();
        

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

   


    public synchronized  void clock() {
 
        // LocalDateTime now = LocalDateTime.now();
        
      

        // String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		while (true) {
			System.out.println( Calendar.getInstance().getTime());
			try {
				this.wait(999);
			} catch (InterruptedException e) {
 
				e.printStackTrace();
			}
		}
 
	}




}