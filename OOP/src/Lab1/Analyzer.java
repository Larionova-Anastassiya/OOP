package Lab1;

import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// input сканирует с нашей консоли
	
		/* First Idea пока не инт остановка (не работает)
		while(!sc.hasNextInt()) {
			System.out.print("Enter number(Q to exit): "); //выведет тексt
		 */
		
		double number;
	    int tru = 1;  //будет выполняться, пока правдиво
	    
	    Data Answer = new Data();//вызов нашего класса
	    
	    while(tru == 1) { //все правдиво будет выполняться
	      
	      System.out.print("Enter number(Q to exit): "); //выведет тексt
	      String input = sc.next(); //вводим наши значения
	      
	      
	      if(input.equals("Q")) { //если встретит букву то закончит
	    	  
	    	//System.out.print(Answer.getMax() + " " + Answer.getAverage()); в одну строку вывод максимума и среднего значения
	    	  System.out.println("Average = " + Answer.getAverage());
	    	  System.out.print("Maximum = " + Answer.getMax());
	        
	        tru = 0; //закончится добавление
	        return;
	        
	      }
	      
	      number = Double.parseDouble(input); //parseDouble - новый double, инициализированный значением, представленным указанной строкой
	      Answer.addData(number); //добавит наши цифры
	      
	    }
	    
		
		sc.close(); //закрыли сканер
		System.out.print("Close"); //закончилась работа добавления
	}
	
}


