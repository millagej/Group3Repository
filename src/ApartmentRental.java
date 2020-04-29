import java.util.Scanner;

public class ApartmentRental {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Age;
        String MaritalStatus, Job, Answer, Name, Name1;
        int creditScore=0;

        System.out.println("*********************************\n*\t\t\t\t\t\t\t\t*\n*\t\tApartment Rental\t\t*\n*\t\t\t\t\t\t\t\t*");
        System.out.println("*********************************\n");
        System.out.println("Please enter your information below to get started:\n");

        System.out.print("Your income: $");
        int income = input.nextInt();

        System.out.print("Yor credit Score:");
        int creaditScore=input.nextInt();

        if (income >= 3500 || creditScore>=700 ) {
            System.out.println("Nice. You're qualified. Please continue\n");
            System.out.print("Last Name:");
            Name1 = input.next();
            System.out.print("First Name:");
            Name = input.next();
            System.out.print("Your age in number:");
            Age = input.nextInt();
            if (Age>=18 && Age <120) {
                System.out.print("Marital status:");
                MaritalStatus = input.next();
                if (MaritalStatus.equalsIgnoreCase("Married")) {
                    System.out.print("How many kids do you have?");
                    int Kids;
                    Kids = input.nextInt();

                    System.out.print("Your job:");
                    Job = input.next();

                    System.out.println("The information you entered is:\n");
                    System.out.println("Last name is: "+Name + "\nFirst name is: " + Name1 +
                            "\nAge is: " + Age + "\nMarital status is: " + MaritalStatus +
                            "\nNumber of kids is: " + Kids + "\nJob is: " + Job + "\n");
                    System.out.println("Is that correct? Type: \'Yes or No\'\n");


                } else
                    System.out.print("Your job:");
                Job = input.next();

                System.out.print("The information you entered is:\n");
                System.out.println(Name + "\n" + Name1 + "\n" + Age + "\n" + MaritalStatus + "\n" + Job + "\n");

                selectRoom();

                System.out.println("Do you want to schedule a showing time to see the selected apartment?\n");
                System.out.println("Yes\nNo");


                Answer = input.next();

                if (Answer.equalsIgnoreCase("y")){
                    System.out.println("Please choose the time which best works for you tomorrow:\n11 A.M \n 2 P.M\n" +
                            " 3 P.m\n");
                    int time=input.nextInt();
                    String ans ="";
                    if (time ==11){
                        ans = "See you at 11:00 tomorrow";
                    }else if (time ==2){
                        ans= "See you at 2:00 tomorrow";
                    }else if (time==3){
                        ans = "See you at 3:00 tomorrow";

                    }else {
                        ans = "Sorry. We don't have showing at"+time;
                    }
                    System.out.println(ans);

                }else{
                    System.out.println("Thank you so much for visiting our website.\n");
                }
                System.out.println("     ************** Bye *************     ");




            }
            else{
                System.out.println("Sorry. People UNDER 18 or OVER 120 are not eligible to apply\n");
            }
        }
        else {
            System.out.println("Sorry. You are not qualified to rent our apartment.");
        }




    }
    static void selectRoom(){
        Scanner input = new Scanner(System.in);

        System.out.println("Now this is the list of our available apartments\nPlease choose the one " +
                "you are interested in:\n");
        System.out.println("1. 1 Bedroom, 1 bathroom (Starting at: $900)");
        System.out.println("2. 2 bedroom, 1 bathroom (Starting at: $1000)");
        System.out.println("3. 2 bedroom, 2 bathroom (Starting at: $1200)");
        System.out.println("4. 3 bedroom, 2 bathroom (Starting at: $1600)\n");
        System.out.println("Please choose a number:\n");

        int num=input.nextInt();

        switch (num){
            case 1:
                System.out.println(" One bed, One bath (Price: $950). Utilities included ");
                break;
            case 2:
                System.out.println(" Two bed, One bath (Price: $1100). Only electricity included ");
                break;
            case 3:
                System.out.println(" two bed, Two bath (Price: $1300). Trash and Water included ");
                break;
            case 4:
                System.out.println(" Three bed, Three bath (Price: $1650). All utilities included ");
                break;

            default:
                System.out.println("Invalid number");
                selectRoom();

        }


    }

}
