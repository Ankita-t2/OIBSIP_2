// Ankita Gorakh Thorat 
// task 3
//ATM Interface



import java.util.Scanner;

public class ATMApp{
    
        public static void main(String[] args){
        atmInterface op=new atmimplement();
        int atmNum=1234567;
        int Pin=321;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("! Welcome to ATM Interface !");
            System.out.print("Enter ATM Number = ");
            int atmnum=in.nextInt();
            System.out.print("Enter Your PIN = ");
            int ippin=in.nextInt();
            if((atmNum==atmnum)&&(Pin==ippin)){
                while(true){
                    System.out.println("Welcome to ATM !!!");
                    System.out.println("1. Transaction history \n2. Withdraw \n3. Deposit \n4. Transfer \n5. Quit");
                    System.out.println("Enter choice:");
                    int option=in.nextInt();
                    if (option==1){
                        op.viewtansactionHistory();
                        op.viewBalance();
                    
                    }
                    else if(option==2){
                        System.out.println("Enter amount = "); 
                        double withdrawAmt=in.nextDouble();
                        op.withdrawnAmount(withdrawAmt);
                    }
                    else if(option==3){
                        System.out.println("Enter amount = ");
                        double depositAmt=in.nextDouble();
                        op.depositAmount(depositAmt);
                    }
                    else if (option==4){
                        System.out.println("Currently disabled");
                    }
                    else if(option==5){
                        System.out.println("Thank you for using ATM.\n"+"Please collect your ATM Card.");
                        System.exit(0);
                    }
                    else{
                        System.out.println("Please enter valid option .");
                    }
                }
            }
            else{
                System.out.println("Invalid ATM number or PIN!");
                
                System.exit(0);
            }
        }
        }
}
