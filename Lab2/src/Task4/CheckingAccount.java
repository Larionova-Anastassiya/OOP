package Task4;

public class CheckingAccount extends Account{
	private final int FREE_TRANSACTIONS = 2; //константа не изменяемая количество бесплатных транзакций	
	private int countOfTransactions; //подсчет транзакций совершенных
	private double feeForTransaction = 1.0; //цена транзакции на это число умножится для комиссии
	
	
	//Конструкторы
	CheckingAccount(){
		//пустой
	}
	public CheckingAccount(int a) { //принимаюзий параметры аккаунта
		super(a); //вызывает родительские
	}
	
	
	
	//Методы
	//Вызов методов из аккаунта и подсчет транзакций
	public void deposit(double sum) {
		super.deposit(sum);
		countOfTransactions++;
	}
	public void withDraw(double sum) {
		countOfTransactions++;
		super.withDraw(sum);
	}
	public void transfer(double amount, Account other) {
		countOfTransactions++;
		super.transfer(amount, other);
	} 
	
	//Специфический метод для вычита комисии
	public void deductFee() {
		if(countOfTransactions > FREE_TRANSACTIONS) //если транзакции превысили бесплатных
			super.withDraw((countOfTransactions - this.FREE_TRANSACTIONS) * feeForTransaction); //он отнимет сколько транзакций платных умноженные на цену транзакций
	}
	
}

