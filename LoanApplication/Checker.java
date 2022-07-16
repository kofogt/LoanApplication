package LoanApplication;

public class Checker {
    public static void main(String[] args) {
        LoanEligibility jane = new LoanEligibility(15000,18,false,true,false);
       if (jane.isEligibleForLoan()){
           ApplyForLoan.getLoanDetails();
       }else{
           System.out.println("You are not eligible for a loan.");
       }
        System.out.println("Have a good day!");
    }
}
