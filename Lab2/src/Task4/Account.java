package Task4;

import java.util.Objects;

public class Account { //This is parent 2 (базовый класс)
	//Parameters
	private double balance;
	private int accountNumber;
	
	
	//Constructors
	public Account() {
		//empty 
	}
	public Account(int acc) { //new account only name
		accountNumber = acc;
		balance = 0.0; //по дефолту баланс равен 0
	}
	
	
	
	
	//METHODS
	//standart methods вывести данные
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}

	
	//specific for task
	public void deposit(double sum) {
		this.balance += sum; //добавит сумму к балансу
	}
	public void withDraw(double sum) { //убрать сумму из баланса
		if(this.balance >= sum) 
			this.balance -= sum; //отнимет определенную сумму если это возможно
		else 
			System.out.println("You don't have enough money to do this operation"); //иначе напишет что на балансе нет денег для этой операции
	}
	public void transfer(double amount, Account other) { //передать сумму на другой аккаунт
		withDraw(amount); 
		other.deposit(amount);
	} 
	
	
	
	//обычная проверка на одинаковые элементы (аккаунта) для хэша
	public boolean equals(Object a) {
		if(this == a) return true;
		if(a == null) return false;
		if(this.getClass() != a.getClass())return false;
		Account ac = (Account)a;
		return accountNumber == ac.accountNumber; //проверка на одинаковые номера аккаунтов
	}
	public int hashCode() {
		return Objects.hash(accountNumber); //проверка по номеру
	}
	
	
	
	//строка вывода номера и его баланса с помощью методов
	public String toString() {
		return "Account Number: " + getAccountNumber() + " Balance: " + getBalance();
	}
	public final void print() {
		System.out.println(toString()); //по условию переопределить метод стринг
	}
	
}
