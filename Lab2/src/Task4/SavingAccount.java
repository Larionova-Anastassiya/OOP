package Task4;

//метод с процентной ставкой
public class SavingAccount extends Account{
	private double interestRate; 
	
	//Constructors
	SavingAccount(){
		//empty
	}
	public SavingAccount(int a, double interestRate) { //примет наш аккаунт и сколько процентов прибавить
		super(a);
		this.interestRate = interestRate; //используем если одинаковые названия у переменных
	}
	
	//Methods
	public void addInterest() {
		super.deposit((super.getBalance() * interestRate) / 100); //добавит проценты от счета к счету в депозите аккаунта прибавит
	}

}

