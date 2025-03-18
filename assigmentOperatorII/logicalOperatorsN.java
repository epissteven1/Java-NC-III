package assigmentOperatorII;

/**
 * This class demonstrates the use of logical operators in Java.
 * It includes examples of AND (&&), OR (||), and NOT (!) operators.
 * Additionally, it checks loan eligibility based on credit score and annual
 * income.
 */
public class logicalOperatorsN {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
        System.out.println("!b: " + (!b));

        int creditScore = 720;
        int annualIncome = 55000;

        boolean isEligibleForLoan = (creditScore > 700) && (annualIncome > 50000);
        System.out.println("Loan eligibility: " + isEligibleForLoan);
    }
}
