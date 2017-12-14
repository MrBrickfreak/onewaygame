import java.util.*; public class loopbeta {
    public static void main(String[] args) {

        Scanner rep = new Scanner(System.in);
       // String PlayerName;
        String d1;
        String line1, line2;
       // String input = "Y";
        int age = 0;
       //  int n = 4;

        line1 = "DEAD";
        line2 = "NOTHING";

        Timer timer1 = new Timer();
        timer1.schedule(new TimerTask() {
            public void run() {
                System.out.println("WELCOME TO BETA LOOP");
            }
        }, 2000);


        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            public void run() {
                System.out.println("JUST WAIT A 3 SECONDS");
            }
        }, 3000);


        Timer timer5 = new Timer();
        timer5.schedule(new TimerTask() {
            public void run() {
                System.out.println("Please enter your age, you know, PEGI n stuff...");
            }
        }, 4000);  // after 11 seconds

        //scanner n rep for player age

        while (age == 0)
        {
            if (!rep.hasNextInt()) {
                //rep.close();
                rep = new Scanner(System.in); //creating new values and deleteng old
                System.out.println("You must enter a number");

            } else {
                age = rep.nextInt();
                if (age >= 18)
                {
                    System.out.println("K");
                } else {
                    System.out.println("Go play minecraft.");   //else player must GTFO
                    System.exit(0);
                }
            }
        }

        System.out.println("INPUT YOUR NAME");


        //PlayerName = rep.next();


        System.out.print("Okay, lets start!");
        System.out.println("\nWhat do you do? \nA. DIE.");
        System.out.println("B. EMPTY ");
        System.out.println("Also, type 'exit' if you want to end this.");


        d1 = rep.next();

        switch (d1) {

            case "exit":
                System.exit(0);
                break;

            case "A":
                System.out.println(line1);
                System.exit(0);
                break;
            case "a":
                System.out.println(line1);
                System.exit(0);
                break;
            case "B":
                System.out.println(line2);
                break;
            case "b":
                System.out.println(line2);
                break;
            default:    //if player type anything except A or B or exit then
                System.out.println("You chosed to stand on place, and after some time you died, GG");
                System.exit(0);
                break;
        }

    }
}