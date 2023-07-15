package JAVA;
import java.util.*;
public class conitionals {
    public static void main(Strings[] args){

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }*/


//----------------------------------------------------------------------------------------------------------------------

        /*different namaste using button with if else.
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for hindi");
        System.out.println("Press 2 for english");
        System.out.println("Press 3 for spanish");
        int button=sc.nextInt();

        if(button==1)
            System.out.println("Namaste");
        else if(button==2)
            System.out.println("Hello");
        else if(button==3)
            System.out.println("Bonjour");
        else
            System.out.println("Invalid input");*/

//----------------------------------------------------------------------------------------------------------------------

        //above question using switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for hindi");
        System.out.println("Press 2 for english");
        System.out.println("Press 3 for spanish");
        int button = sc.nextInt();

        switch(button){

            case 1:
                System.out.println("Namaste");
                break;

            case 2:
                System.out.println("Hello");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid input");
        }





    }
}

