import java.util.*;
public class TextGame {
    public static void main(String[] args) {

        //Homework by Henry ORlov
        //IVSB12
        //12.2017 
 
        Scanner rep = new Scanner(System.in);  //Scanner.
        String PlayerName;      //player nickname or name.
        String d1, d2, d3, d4;     //strings for decisions.
        int age;               // int for age.
        int endage;           // date of death = age + 64. that will be at easter egg ending
        String line2, line3, line4, line5, line6, line7; //lines listed down.
        //Lines that will be in game
        line2 = "REBEL:Good, Die alone! *He open cage and runs away. After some time stormtroopers come and shot you * GAMEOVER";
        line3 = "REBEL:Nice, at least somebody is friendly here!\n*You both running from the cell.\n*after some time, you start to realize that you on board of Star Destroyer starship";
        line4 = "*suddenly stormtroopers show up and that guy shots them" + "\nREBEL: okay I can see escape capsules, in this way!";
        line5 = "You punch him in a face, after he falls you start to beat cr*p out of him \nAfter 2 weeks you was awarded by medal of galactic honor from the hands by great emperor Palpatine \nSince then you live happy with name of great moff ";
        line6 = "After 64 years you died in glory at age of ";
        line7 = "*You just shot a lot of stormtroopers to get to the capsules, but rebel got serious injure.\nYou can run away alone or..."; // \n helps sparate text by lines.
         /// 0 - status for exiting game.
         /// 1 - status for beating the game.
         /// 2 - status for denied access because of small age
         /// 3 - easter egg ending

        Timer timer1 = new Timer();         //Timer for line to accure.
        timer1.schedule(new TimerTask() {    //new timer task.
            public void run() {             // storage code that will run after time.
                System.out.println("WELCOME TO EPIC, NEW, BRAINKILLING, BLOODTHRILLING");       // First line of whole game.
            }
        }, 2000); // after 2 seconds it will be executed.


        Timer timer2 = new Timer(); //Timer for line to accure.
        timer2.schedule(new TimerTask() { //new timer task.
            public void run() {
                System.out.println("ULTIMATE");
            }
        }, 5000); // after 5 seconds.


        Timer timer3 = new Timer(); //Timer for line to accure.
        timer3.schedule(new TimerTask() { //new time rask.
            public void run() {    // storage code that will run after time.
                System.out.println("ONE WAY GAME! V0.1");
                System.out.println("STAR WARS™ VERSION");
                System.out.println("BY O.HENRY");
            }
        }, 7000); // after 7 seconds.

        Timer timer4 = new Timer();   //Timer for line to accure.
        timer4.schedule(new TimerTask() {  //new time rask.
            public void run() {  // storage code that will run after time.
                System.out.println("DISCLAIMER:Without any microtransactions");
            }
        }, 9000); // after 9 seconds.


        Timer timer5 = new Timer();  //Timer for line to accure.
        timer5.schedule(new TimerTask() { //new time rask.
            public void run() { // storage code that will run after time.
                System.out.println("Please enter your age, you know, PEGI n stuff...");
            }
        }, 11000);  // after 11 seconds.

        while (true)       //LOOP FOR ACCURATE AGE INPUT.
        {
            if (!rep.hasNextInt()) {  //if scanner see negative from integer.
                rep = new Scanner(System.in); //creating new values and deleteng old.
                System.out.println("You must enter a number");

            } else {  //else
                age = rep.nextInt();  //age input in int.
                if (age >= 18) //if age is 18 or more.
                {
                    System.out.println("Ok"); //proceed to game.
                } else {
                    System.out.println("Go play minecraft.");   //else player must GTFO.
                    System.exit(2); //goodbye game. resstricted status
                }
                break; //ends loop.
            }
        }
        endage = (age + 64); //counts age of death that will be showed at the easter egg ending.

        System.out.println("INPUT YOUR NAME");
        PlayerName = rep.next(); // scanner rep for player name.

        System.out.print("Okay, lets start!");

        Timer timer6 = new Timer();  //Timer for line to accure.
        timer6.schedule(new TimerTask() { //new time rask.
            public void run() { // storage code that will run after time.
                System.out.print("\nYou wake up in some weird looking prison cell.\nIt looks like empire finally got you.\nThere is some weirdo rebel standing in front of you... ");
            }
        }, 2000); //after 2 seconds.

        Timer timer7 = new Timer(); //Timer for line to accure.
        timer7.schedule(new TimerTask() { //new time rask.
            public void run() { // storage code that will run after time.
                System.out.print("\nREBEL:Stand up... there you go. You were dreaming. ");
                System.out.print("\nREBEL:Well, not even last night's space storm could wake you. ");
                System.out.print(PlayerName);  //name in middle of conversation.
                System.out.println(" right? Cmon, lets get the hell out of here.");
                System.out.println("\nWhat do you do? \nA. Do not pay attention for him.");
                System.out.println("B. Follow him.");
                System.out.println("Also, type 'exit' if you want to end this.");
            }
        }, 7000); //7 seconds.

        d1 = rep.next(); //scan next input as case for switch d1.

        switch (d1.toUpperCase()) { //makes anything that we input in upper case.

            case "exit": // in case when typed exit.
                System.exit(0); //status for exiting game.
            break;

            case "A":
                System.out.println(line2); //println line2.
                System.out.println("Do you want to restart game?TYPE Y/N");
                Scanner rep2 = new Scanner(System.in);  //new scanner rep2 holds answer.
                String input2 = rep2.nextLine();
                if (input2.toLowerCase().equals("y")) //it makes anything that you input in lower case
                    main(new String[0]); // jumps at start
                else {
                    System.out.println("Ok,Bye");
                    System.exit(0); //status for exiting game.
                }
                break;

            case "B":
                System.out.println(line3); //println line3
                break;

            default:    //if player type anything except A or B or exit then
                System.out.println("You chosed to stand on place, and after some time you died, GG");
                System.out.println(line2); //println line2
                System.out.println("Do you want to restart game?TYPE Y/N");
                Scanner rep3 = new Scanner(System.in);
               String input3 = rep3.nextLine();
                if (input3.toLowerCase().equals("y")) //it makes anything that you input in lower case
                    main(new String[0]); // jumps at start
                else {
                    System.out.println("Ok,Bye");
                    System.exit(0); //status for exiting game.
                }
        }
                System.out.println("What do you want to do?");
                System.out.println("A. Ask man about situation.");
                System.out.println("B. Do not ask anything.");

                d2 = rep.next(); //involves scanner for switch (d2)

                switch (d2.toUpperCase()) { //makes anything that we input in upper case

                    case "exit":
                        System.exit(0); //status for exiting game.
                        break;
                    case "A":
                        System.out.println(" He rotate his head to your direction and...");
                        System.out.println(" *suddenly stormtroopers show up behind him and kills him because he was looking at your direction");
                        System.out.println(" After him they shot you *GAME OVER*");
                        System.out.println("Do you want to restart game?TYPE Y/N");
                        Scanner rep4 = new Scanner(System.in);
                        String input4 = rep4.nextLine();
                        if (input4.toLowerCase().equals("y")) //it makes anything that you input in lower case
                            main(new String[0]); // jumps at start
                        else {
                            System.out.println("Ok,Bye");
                            System.exit(0); //status for exiting game.
                             }
                    case "B":
                        System.out.println(line4);
                        break;
                    default:    //if player type anything except A or B or exit then
                        System.out.println("You chosed to stand on place, and after some time you died, GG");
                        System.out.println("Do you want to restart game?TYPE Y/N");
                        Scanner rep5 = new Scanner(System.in);
                        String input5 = rep5.nextLine();
                        if (input5.toLowerCase().equals("y")) //it makes anything that you input in lower case
                            main(new String[0]); // jumps at start
                        else {
                            System.out.println("Ok,Bye");
                            System.exit(0); //status for bad ending.
                             }


                }

                System.out.println(" What do you do?\n A.Take gun from dead guards.\n B.Remain without anything.\n C.Try to kill this man in a glory of great galactic empire.");

                d3 = rep.next(); //involves scanner for switch(d3)

                switch (d3.toUpperCase()) { //makes anything that we input in upper case
                    default:
                        System.out.println("You chosed to stand on place, and after some time you died, GG");
                        System.out.println("Do you want to restart game?TYPE Y/N");
                        Scanner rep6 = new Scanner(System.in);
                        String input6 = rep6.nextLine();
                        if (input6.toLowerCase().equals("y")) //it makes anything that you input in lower case
                            main(new String[0]); // jumps at start
                        else {
                            System.out.println("Ok,Bye");
                            System.exit(0); //status for exiting game.
                             }

                    case "exit":
                        System.exit(0); //status for exiting game.
                        break;

                    case "A":
                        System.out.println("*You take gun from corpse and proceed to escape capsules with rebel");
                        break;

                    case "B":
                        System.out.println(" You both running in direction of capsules \n then sudennly more stormtroopers shows up and starting to shoot \n that guy just kills almost all of them but his ammo runs out and last trooper kills both of you *GAME OVER*");
                        System.out.println("Do you want to restart game?TYPE Y/N");
                        Scanner rep8 = new Scanner(System.in);
                        String input8 = rep8.nextLine();
                        if (input8.toLowerCase().equals("y")) //it makes anything that you input in lower case
                            main(new String[0]); // jumps at start
                        else {
                            System.out.println("Ok,Bye");
                            System.exit(0); //status for exiting game.
                             }

                    case "C":
                        System.out.println(line5 + PlayerName);
                        System.out.println(line6 + endage); //line6 and endage made from your inputed age + 64 years
                        System.out.println("YOU WON INSTRANGE WAY!!!!");
                        System.out.println("YOU GOT EASTER EGG ENDING!");
                        System.out.println("Do you want to take another RUN?TYPE Y/N");
                        Scanner rep9 = new Scanner(System.in);
                        String input9 = rep9.nextLine();
                        if (input9.toLowerCase().equals("y")) //it makes anything that you input in lower case
                            main(new String[0]); // jumps at start
                        else {
                            System.out.println("Ok,sad but goodluck!");
                            System.exit(3); //status for easter ending
                             }
                }

                System.out.println(line7); //print line 7.
                System.out.println(" What do you do?\n A.Take him.\n B.Left him to die.");

                d4 = rep.next(); //involves scanner for switch(d4)

                switch (d4.toUpperCase()) { //makes anything that we input in upper case
                    default:
                        System.out.println("You chosed to stand on place, and after some time you died, GG");
                        System.out.println("Do you want to restart game?TYPE Y/N");
                        Scanner rep10 = new Scanner(System.in);
                        String input10 = rep10.nextLine();
                        if (input10.toLowerCase().equals("y")) //it makes anything that you input in lower case
                            main(new String[0]); // jumps at start
                        else {
                            System.out.println("Ok,Bye");
                            System.exit(0); //status for exiting game.
                        }

                    case "exit":
                        System.exit(0); //status for exiting game.
                        break;

                    case "A":
                        System.out.println("You just escaped Star Destroyer with your new frind, now you won, but what about next page of this story?");
                        System.out.println("ONE WAY GAME 2");
                        System.out.println("COMING 2018");
                        System.out.println("PRE ORDER TO GET FREE HAT FOR TEAM FORTRESS 2!");
                        System.out.println("Do you want to take another run?TYPE Y/N");
                        Scanner rep11 = new Scanner(System.in);
                        String input11 = rep11.nextLine();
                        if (input11.toLowerCase().equals("y")) //it makes anything that you input in lower case
                            main(new String[0]); // jumps at start
                        else {
                            System.out.println("YOU WON!");
                            System.exit(1); //status for good ending
                        }
                    case "B":
                        System.out.println("After you left him and escaped your escape pod EXPLODES because carma you cold hearted tin man!!!*GAME OVER*");
                        System.out.println("Do you want to restart game?TYPE Y/N");
                        Scanner rep12 = new Scanner(System.in);
                        String input12 = rep12.nextLine();
                        if (input12.toLowerCase().equals("y")) //it makes anything that you input in lower case
                            main(new String[0]); // jumps at start
                        else {
                            System.out.println("Ok,Bye");
                            System.exit(0); //status for exiting game.
                        }
                }



    }
}
