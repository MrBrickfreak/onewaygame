import java.util.*;
public class TextGame {
    public static void main(String[] args) {
        ///INFO OF GAME AND OBJECTS.

         /*
         *Game that was made as homework by Henry Orlov for java classes.
         *IVSB12.
         *12 month 2017.
         */

        //ALL OBJECTS LISTED BELOW.
        Scanner rep = new Scanner(System.in);                //Scanner.
        String PlayerName;                                   //Nickname or name for player.
        String decision1, decision2, decision3, decision4;   //Strings for decisions.
        int age;           // int for age.
        int deathage;      // date of death = age + 64. that will be at easter egg ending.
        String sline1, sline2, sline3, sline4, sline5, sline6, sline7, sline8, sline9, sline10, sline11, sline12, sline13, sline14, sline15, sline16, sline17;  //Lines for "system" messages.
        String eline1, eline2, eline3, eline4, eline5, eline6, eline7, eline8, eline9, eline10, eline11, eline12, eline13, eline14, eline15, eline16;           //Plot events lines.
        String rline1, rline2, rline3, rline4, rline5, rline6;    //Lines for rebel.
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///LINES LISTED BELOW.
        //Lines for system messages. \n helps sparate text by lines.
        sline1 = "WELCOME TO EPIC, NEW, BRAINKILLING, BLOODTHRILLING";
        sline2 = "ULTIMATE";
        sline3 = "ONE WAY GAME! V0.4\nSTAR WARS™ UNIVERSE\nBY O.HENRY";
        sline4 = "DISCLAIMER: Without any microtransactions!";
        sline5 = "Please enter your age, you know, PEGI n stuff...";
        sline6 = "You must enter a number";
        sline7 = "Ok.";
        sline8 = "Go play minecraft.";
        sline9 = "INPUT YOUR NAME:";
        sline10 = "OK, Game starts!";
        sline11 = "Also, type 'exit' if you want to end this.";
        sline12 = "Do you want to restart game?(TYPE Y/N)";
        sline13 = "Ok,Bye";
        sline14 = "Ok,sad but goodluck!";
        sline15 = "YOU WON IN STRANGE WAY!!!\nYOU GOT EASTER EGG ENDING!";
        sline16 = "ONE WAY GAME 2\nCOMING 2018\nPRE ORDER TO GET FREE HAT FOR TEAM FORTRESS 2!";
        sline17 = "YOU WON!";

        //LINES FOR PLOT EVENTS.
        eline1 = "\nYou wake up in some weird looking prison cell.\nIt looks like empire finally got you.\nThere is some weirdo rebel standing in front of you...";
        eline2 = "\nWhat do you do? \nA. Do not pay attention for him.\nB. Follow him.";
        eline3 = "\n*You both running from the cell.\n*after some time, you start to realize that you on board of Star Destroyer starship";
        eline4 = "*suddenly stormtroopers show up and that guy shots them ";
        eline5 = "You punch him in a face, after he falls you start to beat cr*p out of him \nAfter 2 weeks you was awarded by medal of galactic honor from the hands by great emperor Palpatine \nSince then you live happy with name of great moff ";
        eline6 = "After 64 years you died in glory at age of ";
        eline7 = "*You just shot a lot of stormtroopers to get to the capsules, but rebel got serious injure.\nYou can run away alone or...";
        eline8 = "You chosed to stand on place, and after some time you died, GG";
        eline9 = "What do you want to do?\nA. Ask man about situation.\nB. Do not ask anything.";
        eline10 = "He rotate his head to your direction and...\n*suddenly stormtroopers show up behind him and kills him because he was looking at your direction\nAfter him they shot you *GAME OVER*";
        eline11 = "What do you do?\n A.Take gun from dead guards.\n B.Remain without anything.\n C.Try to kill this man in a glory of great galactic empire.";
        eline12 = "*You take gun from corpse and proceed to escape capsules with rebel";
        eline13 = "You both running in direction of capsules \n then sudennly more stormtroopers shows up and starting to shoot \n that guy just kills almost all of them but his ammo runs out and last trooper kills both of you *GAME OVER*";
        eline14 = "What do you do?\n A.Take him.\n B.Left him to die.";
        eline15 = "You just escaped Star Destroyer with your new friend, now you won, but what about next page of this story?";
        eline16 = "After you left him and escaped your escape pod EXPLODES because carma you cold hearted tin man!!!*GAME OVER*";

        //LINES FOR REBEL.
        rline1 = "\nREBEL:Stand up... there you go. You were dreaming.";
        rline2 = "\nREBEL:Well, not even last night's space storm could wake you.";
        rline3 = " right? Cmon, lets get the hell out of here.";
        rline4 = "REBEL:Good, Die alone! *He open cage and runs away. After some time stormtroopers come and shot you * GAMEOVER";
        rline5 = "REBEL:Nice, at least somebody is friendly here!";
        rline6 = "\nREBEL: okay I can see escape capsules, in this way!";
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///STATUSES EXPLANATIONS.
           /*
             0 - status for exiting game.
             1 - status for beating the game.
             2 - status for denied access because of small age.
             3 - easter egg ending.
           */
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///GAME STARTS HERE.
        //FIRST LINE.
        Timer timer1 = new Timer();            //Timer for line to accure.
        timer1.schedule(new TimerTask() {      //New timer task.
            public void run() {                //Storage code that will run after time.
                System.out.println(sline1);    //First line of whole game.
                              }
        }, 2000);                       //After 2 seconds it will be executed.
                                              //ALL NEXT LINES USE SAME CODE.
        //SECOND LINE.
        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            public void run() {
                System.out.println(sline2);
                              }
        }, 5000);

        //THIRD LINE.
        Timer timer3 = new Timer();
        timer3.schedule(new TimerTask() {
            public void run() {
                System.out.println(sline3);
                              }
        }, 7000);

        //FOURTH LINE.
        Timer timer4 = new Timer();
        timer4.schedule(new TimerTask() {
            public void run() {
                System.out.println(sline4);
            }
        }, 9000);

        //FIFTH LINE.
        Timer timer5 = new Timer();
        timer5.schedule(new TimerTask() {
            public void run() {
                System.out.println(sline5);
            }
        }, 11000);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///AGE PART.
        //LOOP FOR ACCURATE AGE INPUT.
        while (true)         //While TRUE it will execute if statement.
        {
            if (!rep.hasNextInt()) {          //if scanner see negative from integer.
                rep = new Scanner(System.in); //Creating new values and deleteng old.
                System.out.println(sline6);   //Print line sline6.
            } else {                   //else is not true then
                age = rep.nextInt();   //age input in int.
                if (age >= 18)         //if age is 18 or more then
                {
                    System.out.println(sline7); //Proceed to game.
                } else {                        //else...
                    System.out.println(sline7 + sline8);   //Else player must GTFO.
                    System.exit(2); //Goodbye game. Resstricted status.
                }
                break; //ends loop.
            }
        }

        //DEATH AGE.
        deathage = (age + 64); //Counts the age of death that will be showed at the easter egg ending.
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///PLAYER NICKNAME OR NAME PART.
        System.out.println(sline9); //Line asking for player name.
        PlayerName = rep.next();    //Scanner rep for player name.
        System.out.print(sline10);  //Line for game start.

        //FIRST LINE OF THE GAME.
        Timer timer6 = new Timer(); //Same timers as in START PART.
        timer6.schedule(new TimerTask() {
            public void run() {
                System.out.print(eline1);
            }
        }, 2000);

        //SECOND LINE OF THE GAME.
        Timer timer7 = new Timer();  //Same timers as in START PART.
        timer7.schedule(new TimerTask() {
            public void run() {
                System.out.print(rline1);
                System.out.print(rline2);
                System.out.print(PlayerName);  //Name in middle of conversation.
                System.out.println(rline3);
                System.out.println(eline2);
                System.out.println(sline11);
            }
        }, 7000);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        ///FIRST DECISION PART.
        decision1 = rep.next(); //Scan next input as case for switch decision1.

        //FIRST SWITCH.
        switch (decision1.toUpperCase()) { //This line makes anything that you input in upper case, and comapres to "A or B or EXIT".

            case "EXIT":               //In case when typed exit.
                System.exit(0); //Status for exiting game.
            break;

            case "A":
                System.out.println(rline4); //println rline4.
                System.out.println(sline12);
                Scanner rep2 = new Scanner(System.in);  //New scanner rep2 holds answer.
                String input2 = rep2.nextLine();
                if (input2.toLowerCase().equals("y")) //It makes anything that you input in lower case.
                    main(new String[0]);              //Jumps at start of method.
                else {
                    System.out.println(sline15);
                    System.exit(0);            //Status for exiting game.
                }
                break;

            case "B":
                System.out.println(rline5 + eline3); //println rline4 + eline3.
                break;

            default:    //By default if player type anything except A or B or exit then.
                System.out.println(eline8);
                System.out.println(rline3); //println rline3.
                System.out.println(sline12);
                Scanner rep3 = new Scanner(System.in);
               String input3 = rep3.nextLine();
                if (input3.toLowerCase().equals("y")) //This line makes anything that you input in lower case, and compares it to "y".
                    main(new String[0]);              // Jumps at start.
                else {
                    System.out.println(sline12);
                    System.exit(0); //Status for exiting game.
                }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///SECOND DECISION PART.
                System.out.println(eline9);
                decision2 = rep.next(); //Involves scanner for switch (decision2).
        //SECOND SWITCH.
                switch (decision2.toUpperCase()) { //This line makes anything that you input in upper case, and comapres to "A or B or EXIT".

                    case "EXIT":
                        System.exit(0); //Status for exiting game.
                        break;

                    case "A":
                        System.out.println(eline10);
                        System.out.println(sline13);
                        Scanner rep4 = new Scanner(System.in);
                        String input4 = rep4.nextLine();
                        if (input4.toLowerCase().equals("y")) //This line makes anything that you input in lower case, and comapres to "y".
                            main(new String[0]);              //Jumps at start.
                        else {
                            System.out.println(sline13);
                            System.exit(0); //Status for exiting game.
                             }

                    case "B":
                        System.out.println(eline4 + rline6);
                        break;

                    default:    //Default is made for case if player type anything except A or B or exit then.
                        System.out.println(eline8);
                        System.out.println(sline12);
                        Scanner rep5 = new Scanner(System.in); //Creates new scanner.
                        String input5 = rep5.nextLine();
                        if (input5.toLowerCase().equals("y")) //This line makes anything that you input in lower case, and comapres to "y".
                            main(new String[0]);              //Jumps at start.
                        else {
                            System.out.println(sline13);
                            System.exit(0); //Status for bad ending.
                             }
                }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///THIRD DECISION PART.
                System.out.println(eline11);
                decision3 = rep.next(); //Involves scanner for switch(decision3).

        //THIRD SWITCH.
                switch (decision3.toUpperCase()) { //This line makes anything that you input in upper case, and comapres to "A or B or EXIT".

                    default:
                        System.out.println(eline8);
                        System.out.println(sline12);
                        Scanner rep6 = new Scanner(System.in);
                        String input6 = rep6.nextLine();
                        if (input6.toLowerCase().equals("y")) //This line makes anything that you input in lower case, and comapres to "y".
                            main(new String[0]);              //Jumps at start.
                        else {
                            System.out.println(sline13);
                            System.exit(0); //Status for exiting game.
                             }

                    case "EXIT":
                        System.exit(0); //Status for exiting game.
                        break;

                    case "A":
                        System.out.println(eline12);
                        break;

                    case "B":
                        System.out.println(eline13);
                        System.out.println(sline12);
                        Scanner rep8 = new Scanner(System.in);
                        String input8 = rep8.nextLine();
                        if (input8.toLowerCase().equals("y")) //This line makes anything that you input in lower case, and comapres to "y".
                            main(new String[0]);              //Jumps at start.
                        else {
                            System.out.println(sline13);
                            System.exit(0); //Status for exiting game.
                             }

                    case "C":
                        System.out.println(eline5 + PlayerName);
                        System.out.println(eline6 + deathage); //eline6 and death age made from your inputed age + 64 years.
                        System.out.println(sline15);
                        System.out.println(sline12);
                        Scanner rep9 = new Scanner(System.in); //New scanner
                        String input9 = rep9.nextLine();
                        if (input9.toLowerCase().equals("y")) //This line makes anything that you input in lower case, and comapres to "y".
                            main(new String[0]);              //Jumps at start.
                        else {
                            System.out.println(sline14);
                            System.exit(3); //Status for easter ending.
                             }
                }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ///FOURTH DECISION PART, AND ENDING.
                System.out.println(eline7); //Print line 7.
                System.out.println(eline14);
                decision4 = rep.next(); //Involves scanner for switch(decision4).

        //FOURTH SWICTH. LAST ONE.
                switch (decision4.toUpperCase()) { //This line makes anything that you input in upper case, and comapres to "A or B or EXIT".

                    default:
                        System.out.println(eline8);
                        System.out.println(sline12);
                        Scanner rep10 = new Scanner(System.in);
                        String input10 = rep10.nextLine();
                        if (input10.toLowerCase().equals("y")) //This line makes anything that you input in lower case, and comapres to "y".
                            main(new String[0]);               //Jumps at start
                        else {
                            System.out.println(sline13);
                            System.exit(0); //Status for exiting game.
                             }

                    case "EXIT":
                        System.exit(0); //Status for exiting game.
                        break;

                    case "A":
                        System.out.println(eline15);
                        System.out.println(sline16);
                        System.out.println(sline12);
                        Scanner rep11 = new Scanner(System.in);
                        String input11 = rep11.nextLine();
                        if (input11.toLowerCase().equals("y")) //This line makes anything that you input in lower case, and comapres to "y".
                            main(new String[0]);               //Jumps at start.
                        else {
                            System.out.println(sline17);
                            System.exit(1); //status for good ending.
                             }

                    case "B":
                        System.out.println(eline16);
                        System.out.println(sline12);
                        Scanner rep12 = new Scanner(System.in);
                        String input12 = rep12.nextLine();
                        if (input12.toLowerCase().equals("y")) //This line makes anything that you input in lower case, and comapres to "y".
                            main(new String[0]);               //Jumps at start.
                        else {
                            System.out.println(sline13);
                            System.exit(0); //status for exiting game.
                             }
                }
    }
}
