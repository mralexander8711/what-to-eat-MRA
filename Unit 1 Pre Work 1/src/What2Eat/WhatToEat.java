package What2Eat;

import java.util.Scanner;

public class WhatToEat {

public static void main (String [] arg) {	
		
		Scanner scan = new Scanner(System.in);
                boolean validResponse = false; // variable use to keep asking user for a valid response 
                int eventType =0; // default value 
                String UserInput = ""; // storing eventType
                String PartySizeInput = ""; // storing eventType
                int partySize = 0; // init partysize 
                String MsgConstructer = " Because you are hosting "; // developing msg here 
                String PartySizeMsg = ""; 
	
                 //message the user what to type in
		System.out.println("What's your Event Type? Please type either option 1,2, or 3");
                //now print choices
                System.out.println("1. Casual");
                System.out.println("2. Semi-Formal");
                System.out.println("3. Formal");
                
                while (validResponse != true)
                {
                     UserInput = scan.next();
                     //validate user response 
                     if (UserInput != "") 
                     {
                         //validResponse thus far 
                         eventType = Integer.parseInt(UserInput);
                         
                         // Check to see if response is either a 1,2 or 3
                         if (eventType == 1 || eventType == 2 || eventType == 3)
                         {
                             validResponse = true; 
                         }
                         else
                         {
                             System.out.println("Invalid option choosen please Press");
                             System.out.println("1. Casual");
                             System.out.println("2. Semi-Formal");
                             System.out.println("3. Formal");
                         }
                     }
                     else
                     {
                         // user gave 
                         System.out.println("Invalid option choosen please try again");
                     }
                }
                // now we offically know what event we have 
                System.out.println("How large is your party? ");
                PartySizeInput = scan.next();
                partySize = Integer.parseInt(PartySizeInput);
                
                if (partySize == 1)
                {
                    PartySizeMsg = " prepared in your microwave"; 
                }
                else if (partySize >= 2 && partySize <= 12)
                {
                    PartySizeMsg = " prepared in your kitchen"; 
                }
                else //anything higher then 12 
                {
                    PartySizeMsg = " prepared by a catering company"; 
                }
                
                switch (eventType) 
                {
                    // case 1 is for a Casual event 
                    case 1:
                        MsgConstructer = MsgConstructer + "Casual event for " + partySize + " participants you should serve finger foods " + PartySizeMsg; 
                        break; 
                    // case 2 is for semi event 
                    case 2:
                        MsgConstructer = MsgConstructer + "semi formal for" + partySize + " particpants you should serve fried chicken " + PartySizeMsg; 
                        break;
                    // case 3 is formal 
                    case 3: 
                        MsgConstructer = MsgConstructer + "formal event for " + partySize + " particpants you should serve Chicken Parmesan " + PartySizeMsg; 
                        break;
                }
                System.out.println(MsgConstructer);
	}
}

