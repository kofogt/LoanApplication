package LoanApplication;

public class Checker {
    public static void main(String[] args) {
        LoanEligibility jane = new LoanEligibility(15000,19,false,true,false);
       if (jane.isEligibleForLoan()){
           ApplyForLoan.getLoanDetails();
           ApplyForLoan.takeLoan();
       }else{
           System.out.println("You are not eligible for a loan.");
       }
        System.out.println("Have a good day!");
    }
}
