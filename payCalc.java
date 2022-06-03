import java.util.*;
import java.util.Scanner;


public class Main
{
    //global variables
    static int hours;
    static double wage;
    static double pay;
    static double monthlyPay;
    static double yearlyPay;
    static Scanner sc = new Scanner(System.in);
    
    static void weekly(){
        System.out.println("How much do you make hourly? ");
        wage = sc.nextDouble();
        
        System.out.println("How many hours per week? ");
        hours = sc.nextInt();
        
        pay = hours * wage;
        monthlyPay = pay * 4;
        yearlyPay = monthlyPay * 12;
        
        System.out.println("Without tax included, you will make " + pay + " in a week, " + monthlyPay + " in a Month, and " + yearlyPay + " in a Year.");
        
        
    }
    static void monthly(){
        System.out.println("How many hours you work per week?");
        hours = sc.nextInt();
        
        System.out.println("How much do you make per month?");
        monthlyPay = sc.nextDouble();
        
        pay = monthlyPay / 4;
        yearlyPay = monthlyPay * 12;
        
        System.out.println("Without tax included, you will make " + pay + " in a week, " + monthlyPay + " in a Month, and " + yearlyPay + " in a Year.");
        
    }
    static void yearly(){
        System.out.println("How much do you make in a year?");
        yearlyPay = sc.nextDouble();
        
        monthlyPay = yearlyPay / 12;
        pay = monthlyPay / 4;
        
        System.out.println("Without tax included, you will make " + pay + " in a week, " + monthlyPay + " in a Month, and " + yearlyPay + " in a Year.");
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter either 'W' for Weekly, 'M' for Monthly, or 'Y' for yearly: ");
            String user = sc.nextLine();
            
            if(user.equals("w")){
                weekly();
                break;
            }else if(user.equals("m")){
                monthly();
                break;
            }else if(user.equals("y")){
                yearly();
                break;
            }else{
                System.out.println("Invalid entry..");
            }
            
        }while(true);
       
    }
}
