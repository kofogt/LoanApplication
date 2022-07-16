package LoanApplication;

import java.util.Scanner;

public class ApplyForLoan {
    static int loanAmount;
    static int tenure;
    static final int MINLOANAMOUNT = 50000;
    static final int PERCENTAGE = 100;
    static int numberOfMonths = 12;
    static final double interestRate = 0.15;

    ApplyForLoan(int loanAmount, int tenure) {
        this.loanAmount = loanAmount;
        this.tenure = tenure;
    }
    static String getLoanDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Loan amount you intent to borrow: ");
        loanAmount = Integer.parseInt(scanner.nextLine());
        System.out.print("How many years would you like the loan for: ");
        tenure = Integer.parseInt(scanner.nextLine());
        getMonthlyRepayment();
        return "Loading Loan";
    }
    static double getMonthlyRepayment(){
        double total, totalPlusInterest;
       numberOfMonths *= tenure;
        totalPlusInterest = (interestRate * loanAmount) + loanAmount ;
        total = (interestRate* totalPlusInterest) /numberOfMonths;
       System.out.println("$"+total+" will be paid monthly until $"+ totalPlusInterest+ " has been repaid.");
       return total;
    }

}
