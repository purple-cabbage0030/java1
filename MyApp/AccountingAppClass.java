class Accounting {
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply: "+valueOfSupply);
		System.out.println("VAT: "+getVAT());
		System.out.println("Total: "+getTotal());
		System.out.println("Expense: "+getExpense());
		System.out.println("Income: "+getIncome());
		System.out.println("Dividend 1: "+getDividend1());
		System.out.println("Dividend 2: "+getDividend2());
		System.out.println("Dividend 3: "+getDividend3());
	}
	
	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend3() {
		return getIncome() * 0.2;
	}
	
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
}


public class AccountingAppClass {


	public static void main(String[] args) {
		// class를 이용한 소속 관계 명시 
//		Accounting.valueOfSupply = Double.parseDouble(args[0]);
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//
//		Accounting.print();

		// otherVariables = ...;
		// otherMethods = ...;
		
		// instance (class 복제본) 생성 - static 사용 불가 
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 20000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.5;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 10000.0;
		a2.vatRate = 0.2;
		a2.expenseRate = 0.2;
		a2.print();
		
	}


}
