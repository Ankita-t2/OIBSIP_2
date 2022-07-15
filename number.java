// Ankita  Gorakh Thorat
// task 2
//number guessing game





import java.util.Scanner;

public class number{
    public static void guessingnum(){

        Scanner sc=new Scanner(System.in);
        int num=1+(int)(100*Math.random());

        int maxtri=5;
        int i,guess,score=0;
        System.out.println("A number chosen is between 1 to 100. ");
        for(i=0;i<maxtri;i++){
            System.out.println("Guess the number ");
            guess=sc.nextInt();
            if(num==guess){
                System.out.println("congratulatons!!!! "+"Guessed number is correct");
                score+= 5-i;
                break;
            }
            else if(num>guess &&(num-guess)>20 && i!=maxtri-1){
                System.out.println("The number is  too GREATER than the "+guess);

            }
            else if(num<guess && (num-guess)<20 && i!=maxtri-1){
                System.out.println("The number is too LESS than the "+guess);

            }

            else if(num>guess && i!=maxtri-1){
                System.out.println("The number is GREATER than the "+guess);

            }
            else if(num<guess && i!=maxtri-1){
                System.out.println("The number is LESS than the "+guess);

            }
        }
        if(i==maxtri){
            System.out.println("Trials are over");
        
             System.out.println("The number is : "+num);
        }

        System.out.println("score :"+score);

        
    } 
  public static void main(String[] args) {
    System.out.println("INSTRUCTIONS: "+"1 There are 3 round for player \n"
                        +"2 For each win there are maximum 5 points \n "
                        +"3 Maximum trials are 5");
    int round=3;
    while(round>0){
        guessingnum();
        round--;

    }
    System.out.println("completed 3 rounds");
    
    
        
    }




}