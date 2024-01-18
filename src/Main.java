import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("principal:" );
        int principal =scanner.nextInt();
        System.out.println("Annual Interest Rate: ");
        float annualInterest =scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT /MONTHS_IN_YEAR;

        System.out.println("period(years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest*Math.pow(1+ monthlyInterest, numberOfPayments)
                /(Math.pow(1+monthlyInterest,numberOfPayments)-1));
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currencyFormat.format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);






        }
    }
