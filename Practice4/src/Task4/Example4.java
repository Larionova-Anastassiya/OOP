package Task4;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
       double leftOperand, result, rightOperand;
       String  leftString, operator, rightString;
       
       StringTokenizer tokenizer;
       Scanner in = new Scanner(System.in);
       
       
       //чтобы можно было вводить несколько строчек с выражениями (3+21 4/2 5*2) или (6*1*2-5 = 6.0)
       try {
	       StringTokenizer input = new StringTokenizer(in.nextLine(), " "); //делит по пробелам разные примеры
	       
	       while(input.hasMoreElements()) { //спец функция серии элементов
	       
	
	       //tokenizer = new StringTokenizer(in.nextLine(), "+-/*", true); //"+-/*" встречая эти знак разделит, при этом их тоже считая +//-//*///
	    	   tokenizer = new StringTokenizer(input.nextToken(), "+//-//*///", true);
	
	    	   try {
	    	   
	    	  
	          leftString   = tokenizer.nextToken();
	          operator     = tokenizer.nextToken();
	          rightString  = tokenizer.nextToken();
	          
	          
	
	          leftOperand  = Double.parseDouble(leftString);
	          rightOperand = Double.parseDouble(rightString);
	
	          if (operator.equals("*"))
	              result = leftOperand * rightOperand;
	          
	          
	          
	          else if (operator.equals("/"))
	              result = leftOperand / rightOperand;
	           
	          
	          
	          else if (operator.equals("+"))
	              result = leftOperand + rightOperand;
	           
	          
	          
	          else if (operator.equals("-"))
	              result = leftOperand - rightOperand;
	          
	          else
	        	  result = 0.0;
	        	  //System.out.println("Result not found");
	    	  
	          System.out.println("Result: " + result);
	    	  
	       }
	       
	       
	       
	       catch (NoSuchElementException nsee) //Если нет элемента проверка идет
	       {
	          System.out.println("Invalid syntax");
	       }
	       catch (NumberFormatException nfe) //Если какой то элемент не цифра проверка
	       {
	          System.out.println("One or more operands is not a number");
	       }
	
	       }
	       }
	       catch (NoSuchElementException nsee) //Если нет элемента проверка идет
	       {
	          System.out.println("Invalid examples");
	       }
	       finally {
	    	   in.close();
	       }
    	}
    }



/*
1. Правильное выполнение кода по условиям
5.3+9.2
Result: 14.5

2. Если нет элемента проверка идет
5.3+
Invalid syntax

3. Если какой то элемент не цифра проверка
5.3+a
One or more operands is not a number
 */
