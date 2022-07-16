package LoanApplication;

public class LoanEligibility {
    public static double getIncome() {
        return income;
    }
    public static double setIncome() {
        LoanEligibility.income = income;
        return income;
    }
    static double income;
    public int getAge() {
        return age;
    }
    private  int age;
 private double  minIncomeAmount = 10000, minAge = 18;
    private Boolean hasCriminalRecord, hasGoodCreditRating, hasDefaultedInPayment,isAdult;

    public LoanEligibility(double income, int age, Boolean hasCriminalRecord, Boolean hasGoodCreditRating, Boolean hasDefaultedInPayment) {
        this.income = income;
        this.age = age;
        this.minIncomeAmount = minIncomeAmount;
        this.minAge = minAge;
        this.hasCriminalRecord = hasCriminalRecord;
        this.hasGoodCreditRating = hasGoodCreditRating;
        this.hasDefaultedInPayment = hasDefaultedInPayment;
        this.isAdult = isAdult;
    }

    Boolean isEligibleForLoan() {
        Boolean acceptableIncome = income>minIncomeAmount ;
        isAdult = age > minAge;
        if (!isAdult || !acceptableIncome || !hasGoodCreditRating || hasCriminalRecord || hasDefaultedInPayment) {
        return false;
        }
        return true;
}
}
