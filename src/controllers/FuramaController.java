package controllers;


import java.util.Scanner;

public class FuramaController {
    public static int choose = 0;
   public static void disPlayMainMenu(){
       Scanner sc = new Scanner(System.in);
       System.out.println("1.\tEmployee Management\n" +
               "2.\tCustomer Management\n" +
               "3.\tFacility Management \n" +
               "4.\tBooking Management\n" +
               "5.\tPromotion Management\n" +
               "6.\tExit\n");
       do{
           System.out.println("mời bạn nhập lựa chọn");
           choose = sc.nextInt();
       }while(choose <1 || choose >6);
       switch (choose){
           case 1:
               subMenu1();
               break;
           case 2 :
               subMenu2();
               break;
           case 3:
               subMenu3();
               break;
           case 4:
               subMenu4();
               break;
           case 5:
               subMenu5();
               break;
           case 6:
               System.out.println("kết thúc chương trình");
               break;
       }
   }
   public static void subMenu1(){
       System.out.println("1\tDisplay list employees\n" +
               "2\tAdd new employee\n" +
               "3\tEdit employee\n" +
               "4\tReturn main menu\n");
       Scanner sc = new Scanner(System.in);
       do{
           System.out.println("mời bạn nhập lựa chọn");
           choose = sc.nextInt();
       }while(choose <1 || choose >4);
       switch (choose){
           case 1:
               System.out.println("Display list employees");
               break;
           case 2:
               System.out.println("Add new employee");
               break;
           case 3:
               System.out.println("Edit employee");
               break;
           case 4:
               disPlayMainMenu();
               break;
       }
   }

   public static void subMenu2(){
       System.out.println("1.\tDisplay list customers\n" +
               "2.\tAdd new customer\n" +
               "3.\tEdit customer\n" +
               "4.\tReturn main menu\n");
       Scanner sc = new Scanner(System.in);
       do{
           System.out.println("mời bạn nhập lựa chọn");
           choose = sc.nextInt();
       }while(choose <1 || choose >4);
       switch (choose){
           case 1:
               System.out.println("Display list customers");
               break;
           case 2:
               System.out.println("Add new customer");
               break;
           case 3:
               System.out.println("Edit customer");
               break;
           case 4:
               disPlayMainMenu();
               break;
       }
   }

    public static void subMenu3(){
        System.out.println("1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu\n");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("mời bạn nhập lựa chọn");
            choose = sc.nextInt();
        }while(choose <1 || choose >4);
        switch (choose){
            case 1:
                System.out.println("Display list facility");
                break;
            case 2:
                System.out.println("Add new facility");
                break;
            case 3:
                System.out.println("Display list facility maintenance");
                break;
            case 4:
                disPlayMainMenu();
                break;
        }
    }

    public static void subMenu4(){
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new constracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("mời bạn nhập lựa chọn");
            choose = sc.nextInt();
        }while(choose <1 || choose >6);
        switch (choose){
            case 1:
                System.out.println("Add new booking");
                break;
            case 2:
                System.out.println("Display list booking");
                break;
            case 3:
                System.out.println("Create new constracts");
                break;
            case 4 :
                System.out.println("Display list contracts");
                break;
            case 5 :
                System.out.println("Edit contracts");
                break;
            case 6:
                disPlayMainMenu();
                break;
        }
    }

    public static void subMenu5(){
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("mời bạn nhập lựa chọn");
            choose = sc.nextInt();
        }while(choose <1 || choose >3);
        switch (choose){
            case 1:
                System.out.println("Display list customers use service");
                break;
            case 2:
                System.out.println("Display list customers get voucher");
                break;
            case 3:
                disPlayMainMenu();
                break;
        }
    }

}
