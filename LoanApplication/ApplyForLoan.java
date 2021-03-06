package LoanApplication;

import java.util.Scanner;

public class ApplyForLoan {
    static int loanAmount;
   static String name;
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
        System.out.print("What is your name? ");
        name = scanner.nextLine();
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
       System.out.println("Hi "+name +" you will have to pay $"+total+"monthly until $"+ totalPlusInterest+ " has been repaid.");
       return total;
    }
    static void takeLoan(){
        String loanDecision, sendLoanRequest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to take the loan now? \nPlease enter Y or N: ");
        loanDecision = scanner.nextLine().toUpperCase();
        sendLoanRequest = (loanDecision.equals("Y")) ? "Loan Application sent" : "Maybe next time" ;
        System.out.println(sendLoanRequest);
    }

}
