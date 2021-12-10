
public class AccountingApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double div1 = income * 0.5;
		double div2 = income * 0.3;
		double div3 = income * 0.2;

		System.out.println("Value of supply: "+valueOfSupply);
		System.out.println("VAT: "+vat);
		System.out.println("Total: "+total);
		System.out.println("Expense: "+expense);
		System.out.println("Income: "+income);
		System.out.println("Dividend 1: "+div1);
		System.out.println("Dividend 2: "+div2);
		System.out.println("Dividend 3: "+div3);

	}

}
