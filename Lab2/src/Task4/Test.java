package Task4;

//import java.util.*;
public class Test {

	public static void main(String[] args) {
		//добавить банк и аккаунты
		Bank BANK = new Bank();
		SavingAccount n1 = new SavingAccount(5, 50); //сразу с процентной ставкой
		CheckingAccount n2 = new CheckingAccount(7); //with class CheckingAccount может выполнять действия считая транзакции
		Account n = new Account(6); //только аккаунт с 0 балансом
		//Account n3 = new Account(6); //Добавить такой же аакаунт то выйдет: This account already exists in system!
		
		Account n4 = new Account(8);
		BANK.openAccount(n4); //добавит новый аккаунт через банк
		// BANK.closeAccount(n4); //удалит аккаунт "закроет"
		
		//добавить к балансу деньги
		n.deposit(4000);
		n1.deposit(50000);
		
		n2.deposit(1000); //бесплатно
		n2.withDraw(100); //бесплатно
		n2.deposit(600); // не бесплатно
		
		n2.deductFee(); //высчитает комиссию с числа из за превышения транзакции
		//n3.deposit(50000); // Добавить такой же аакаунт то выйдет: This account already exists in system!
		
		
		
		//вызовет специфичные методы
		//n1.addInterest(); //из SavingAccount процент высчитает !!!!!!
		
		/*AccountNumber: 5 Balance: 52750.0
		AccountNumber: 6 Balance: 3750.0
		*/
		//n.transfer(250, n1); //От одного аккаунта добавить значения ко второму аккаунту !!!!!!!!
		
		
		
		//Добавить аккаунты в банк (вектора)
		BANK.openAccount(n);
		BANK.openAccount(n1);
		BANK.openAccount(n2);
		//America.openAccount(n3); // Не выведет так как не Добавить такой же аккаунт 
		
		
		BANK.getVector(); //вывести все аккаунты из вектора
		
		BANK.update();
		
		
		System.out.println("После изменения банка:");
		
		
		BANK.getVector(); //вывести все аккаунты из вектора
		
		
	}

}
