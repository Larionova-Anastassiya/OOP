package Task4;

import java.util.*;

public class Bank { //This is parent 1 главный хранящий аккаунты
	
	public static HashSet <Account> bank = new HashSet <Account>();  //HashSet аккаунтов всех хранящихся
	
	
	
	//Открытие аккаунтов
	public void openAccount(Account a) {
		boolean ok = true; //для работы дефолтно может
		
		
		for(Account acс : bank) { //перебор аккаунтов
			if(a.equals(acс)) { //если пытаемся добавить одинаковый то ошибка
				System.out.println("This account already exists in system!");
				ok = false; //прекратит работу
			}
		}
		
		if(ok) bank.add(a); //если нет такого то добавит в список
	}
	
	//Закрытие аккаунта
	public void closeAccount(Account acc) {
				bank.remove(acc); //удалит аккаунт
	}
	
	
	
	//Методы
	//изменение с помощью банка (перебирая выполнит действия с классами)
	public void update() {
		for(Account aсc : bank) {
			//всем добавит деньги, а потом удалит (в итоге поступит 200)
			aсc.deposit(400);
			aсc.withDraw(200);
			
			//проверка каждого элемента через instanceof выполняя методы этих классов
			if(aсc instanceof SavingAccount) {
				SavingAccount savAcc = (SavingAccount)aсc;
				savAcc.addInterest();
			}
			else if(aсc instanceof CheckingAccount) {
				CheckingAccount cheAcc = (CheckingAccount)aсc;
				cheAcc.deductFee();
				cheAcc.transfer(500, cheAcc);
			}
			else if(aсc instanceof Account) {
				aсc.getBalance();
				aсc.getAccountNumber();
				aсc.transfer(33, aсc);
			}
		}
	}
	
	
	
	//Выведет все значения вектора
	public void getVector() {
		for(Account acс : bank) {
			System.out.println(acс.toString());
		}

		
	}
}

