import java.util.*;

public class Assignment2 {
   public static void Q1() {
      Scanner q1 = new Scanner(System.in);
      System.out.print("Enter a SSN: ");
      String ssn = q1.nextLine();
      if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
         System.out.println(ssn + " is a valid security number.");
      } else {
         System.out.println(ssn + " is not a valid security number.");
      }
   }

   public static void Q2() {
      Scanner q2 = new Scanner(System.in);
      System.out.print("Enter two characters: ");
      String C = q2.nextLine();
      char C1 = C.charAt(0);
      char C2 = C.charAt(1);
      boolean valid = true;
      String c1 = "";
      String c2 = "";

      if (C.length() != 2) {
         System.out.println("Invalid Input!");
         return;
      }

      if (C1 == 'C') {
         c1 = "Computer Science";
      } else if (C1 == 'M') {
         c1 = "Mathematics";
      } else if (C1 == 'I') {
         c1 = "Information Technology";
      } else {
         valid = false;
      }

      if (C2 == '1') {
         c2 = "Freshman";
      } else if (C2 == '2') {
         c2 = "Sophomore";
      } else if (C2 == '3') {
         c2 = "Junior";
      } else if (C2 == '4') {
         c2 = "Senior";
      } else {
         valid = false;
      }

      if (valid) {
         System.out.println(c1 + " " + c2);
      } else {
         System.out.println("Invalid Input!");
      }

   }

   public static void Q3() {
      char P1 = (char) (65 + (int) (Math.random() * 26));
      char P2 = (char) (65 + (int) (Math.random() * 26));
      char P3 = (char) (65 + (int) (Math.random() * 26));
      int P4 = (int) (Math.random() * 10);
      int P5 = (int) (Math.random() * 10);
      int P6 = (int) (Math.random() * 10);
      int P7 = (int) (Math.random() * 10);
      System.out.println("Vehicle plate number: " + P1 + P2 + P3 + P4 + P5 + P6 + P7);
   }

   public static void Q4() {
      Scanner q4 = new Scanner(System.in);
      System.out.print("Enter a decimal integer: ");
     int d = q4.nextInt();
     int rem;
     String b = "";
     while(d > 0){
        rem = d % 2;
        b = rem + b;
        d = d / 2;   
     }
     while (b.length() < 4) {
        b = "0" + b;
     }
     System.out.println("Binary: " + b);

   }

   public static void Q5() {
      Scanner q5 = new Scanner(System.in);
      int count = 0;

     System.out.print("------------>    <Quiz>    <-------------\n");
     System.out.println("Q1. Which of the the following describes a climate feedback that can amplify warming? ");
     System.out.println(" 1. As the planet warms, more snow accumulates, reflecting more sunlight, cooling Earth. ");
     System.out.println(" 2. Warmer air holds more water vapor, which further increases the greenhouse effect. ");
     System.out.println(" 3. Plants grow faster and absorb more CO₂, reducing warming. ");
     System.out.println(" 4. Increased cloud cover reflects more sunlight and lowers ground temperature. ");
      
     System.out.print("Your Answer: ");
     int a1 = q5.nextInt();
     if (a1 == 2) {
        System.out.println("Correct Answer\n");
        count++;
     }
     else {
        System.out.println("Incorrect Answer\n");
     }


     System.out.println("Q2. Which human activity contributes least directly to increasing atmospheric CO₂ concentrations? ");
     System.out.println(" 1. Deforestation ");
     System.out.println(" 2. Burning coal for electricity ");
     System.out.println(" 3. Cement production ");
     System.out.println(" 4. Using more efficient LED lighting ");

     System.out.print("Your Answer: ");
     int a2 = q5.nextInt();
     if (a2 == 4) {
        System.out.println("Correct Answer\n");
        count++;
     }
     else {
        System.out.println("Incorrect Answer\n");
     }



     System.out.println("Q3. What is the main cause of global warming? ");
     System.out.println(" 1. People talking too much ");
     System.out.println(" 2. Burning of fossil fuels like coal and oil ");
     System.out.println(" 3. Using mobile phones ");
     System.out.println(" 4. Eating ice cream ");

     System.out.print("Your Answer: ");
     int a3 = q5.nextInt();
     if (a3 == 2) {
        System.out.println("Correct Answer\n");
        count++;
     }
     else {
        System.out.println("Incorrect Answer\n");
     }



     System.out.println("Q4. Which gas traps heat in the Earth’s atmosphere? ");
     System.out.println(" 1. Oxygen ");
     System.out.println(" 2. Carbon Dioxide (CO₂) ");
     System.out.println(" 3. Hydrogen ");
     System.out.println(" 4. Helium ");

     System.out.print("Your Answer: ");
     int a4 = q5.nextInt();
     if (a4 == 2) {
        System.out.println("Correct Answer\n");
        count++;
     }
     else {
        System.out.println("Incorrect Answer\n");
     }




     System.out.println("Q5. Which of these is a result of global warming? ");
     System.out.println(" 1. Sea levels rising ");
     System.out.println(" 2. Days getting shorter ");
     System.out.println(" 3. Fewer clouds in the sky ");
     System.out.println(" 4. Earth becoming colder ");

     System.out.print("Your Answer: ");
     int a5 = q5.nextInt();
     if (a5 == 1) {
        System.out.println("Correct Answer\n");
        count++;
     }
     else {
        System.out.println("Incorrect Answer\n");
     }



     switch (count) {
        case 5:
            System.out.println("Excellent");
            break;
        case 4:
            System.out.println("Very good");
            break;
        case 3:
            System.out.println("Time to brush up on your knowledge of global warming.");
            break;
        case 2:
            System.out.println("Time to brush up on your knowledge of global warming.");
            break;
        case 1:
            System.out.println("Time to brush up on your knowledge of global warming.");
            break;
        case 0:
            System.out.println("Time to brush up on your knowledge of global warming.");
            break;    
     
        default:
            break;
     }



     System.out.println("\n\n\nSources:");
     System.out.println("1. Wikipedia");
     System.out.println("2. National Geographic:");
     System.out.println("3. US Environmental Protection Agency:");

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("------------>    <MAIN MENU>    <------------");
      System.out.println("_____________________________________________\n");
      System.out.println("1 - Question-1");
      System.out.println("---------------");
      System.out.println("2 - Question-2");
      System.out.println("---------------");
      System.out.println("3 - Question-3");
      System.out.println("---------------");
      System.out.println("4 - Question-4");
      System.out.println("---------------");
      System.out.println("5 - Question-5");
      System.out.println("---------------");
      int o1;
      String choose;
      do {
         System.out.println("Press option (1-5) to execute the program and press 0 to Exit");
         System.out.print("Enter your option: ");
         o1 = sc.nextInt();
         if (o1 != 0 && o1 != 1 && o1 != 2 && o1 != 3 && o1 != 4 && o1 != 5) {
            System.out.println("------------>       <Invalid Entry!>       <------------\n");
            System.out.println("------------>     <Please Start Again!>    <------------");
            continue;
         } else if (o1 == 1) {

            System.out.println("------------>    <Executing Question 1>    <------------");
            Q1();
            do {
               System.out.println(
                     "\nDo you want to Execute this question again then press (y) Otherwise Press (b) to go to the main menu");
               System.out.print("Choose your option: ");
               choose = sc.next();
               if (!choose.matches("y") && !choose.matches("b")) {
                  System.out.println("Invalid Input! Try Again!");
                  continue;
               } else if (choose.matches("y")) {
                  Q1();
                  continue;
               } else if (choose.matches("b")) {
                  break;
               }
            } while (!choose.matches("b"));
            continue;

         } else if (o1 == 2) {
            System.out.println("------------>    <Executing Question 2>    <------------");
            Q2();
            do {
               System.out.println(
                     "\nDo you want to Execute this question again then press (y) Otherwise Press (b) to go to the main menu");
               System.out.print("Choose your option: ");
               choose = sc.next();
               if (!choose.matches("y") && !choose.matches("b")) {
                  System.out.println("Invalid Input! Try Again!");
                  continue;
               } else if (choose.matches("y")) {
                  Q2();
                  continue;
               } else if (choose.matches("b")) {
                  break;
               }
            } while (!choose.matches("b"));
            continue;
         } else if (o1 == 3) {
            System.out.println("------------>    <Executing Question 3>    <------------");
            Q3();
            do {
               System.out.println(
                     "\nDo you want to Execute this question again then press (y) Otherwise Press (b) to go to the main menu");
               System.out.print("Choose your option: ");
               choose = sc.next();
               if (!choose.matches("y") && !choose.matches("b")) {
                  System.out.println("Invalid Input! Try Again!");
                  continue;
               } else if (choose.matches("y")) {
                  Q3();
                  continue;
               } else if (choose.matches("b")) {
                  break;
               }
            } while (!choose.matches("b"));
            continue;
         } else if (o1 == 4) {
            System.out.println("------------>    <Executing Question 4>    <------------");
            Q4();
            do {
               System.out.println(
                     "\nDo you want to Execute this question again then press (y) Otherwise Press (b) to go to the main menu");
               System.out.print("Choose your option: ");
               choose = sc.next();
               if (!choose.matches("y") && !choose.matches("b")) {
                  System.out.println("Invalid Input! Try Again!");
                  continue;
               } else if (choose.matches("y")) {
                  Q4();
                  continue;
               } else if (choose.matches("b")) {
                  break;
               }
            } while (!choose.matches("b"));
            continue;
         } else if (o1 == 5) {
            System.out.println("------------>    <Executing Question 5>    <------------");
            Q5();
            do {
               System.out.println(
                     "\nDo you want to Execute this question again then press (y) Otherwise Press (b) to go to the main menu");
               System.out.print("Choose your option: ");
               choose = sc.next();
               if (!choose.matches("y") && !choose.matches("b")) {
                  System.out.println("Invalid Input! Try Again!");
                  continue;
               } else if (choose.matches("y")) {
                  Q5();
                  continue;
               } else if (choose.matches("b")) {
                  break;
               }
            } while (!choose.matches("b"));
            continue;
         }

         else if (o1 == 0) {
            System.out.println("------------>             <Exit>           <------------");
            break;

         }
      } while (o1 != 0);

      sc.close();
   }

}
