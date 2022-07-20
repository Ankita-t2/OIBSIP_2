import java.util.HashMap;
import java.util.Map;

public class atmimplement implements atmInterface{
   operation atm=new operation();
    Map<Double,String> history=new HashMap<>();
    
    @Override
    public void viewBalance(){
        System.out.println("Amount Available = "+atm.getcheckBalance());

    }
   
    @Override
    public void withdrawnAmount(double withdrawnAmount){
        if((withdrawnAmount%500==0)||(withdrawnAmount%200==0)||(withdrawnAmount%100==0)){
            if(withdrawnAmount<=atm.getcheckBalance()){
                history.put(withdrawnAmount, " Amount withdrawn");
                System.out.println("collect your"+withdrawnAmount+" Amount");
                atm.setcheckbalance(atm.getcheckBalance()-withdrawnAmount);
                viewBalance();
            }
            else{
                System.out.println("Insufficient balance in your account");
            }
        }
        else{
            System.out.println("Please Enter the Amount in the multiples of : 100, 200, 500.");
        }
        

    }
    
    @Override
    public void depositAmount(double depositAmount){
        history.put(depositAmount, " Amount deposited.");
        System.out.println(depositAmount+" successfully Deposited.");
        atm.setcheckbalance(atm.getcheckBalance()+depositAmount);
        viewBalance();
    }
   
    @Override
    public void viewtansactionHistory(){
        for(Map.Entry<Double,String> m: history.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }

}
