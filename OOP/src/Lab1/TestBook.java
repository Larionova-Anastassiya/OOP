package Lab1;


public class TestBook {

	public static void main(String[] args) {
		//Books s = new Books(); вызов и покажет пустой
		//Добавляем наши книги
		Books firstb = new Books("Garry Potter", 3636 , 1, 1997, "orange", Language.ENG); //имя добавится с кол-во страниц, айди, годом, и цветом
		Books secondb = new Books("Cat BOB", 384, 2, 2013, "white", Language.RUS); 
		Books thirdb = new Books("War and peace", 1300, 3, 1868, "red", Language.ENG);
		Books fourthb = new Books("Witch", 150, 4, 2022, "black", Language.ENG);
		
		
		
		//Проверка вывода ответа
		
		System.out.println(Books.books); //покажет вектор всех книг и их цвета (метод toString где имя и цвет)
		System.out.println("All books: " + Books.books.size()); //показать сколько всего наших книг есть
		System.out.println(" "); //промежуток до наших книг
		
		
		
		System.out.println("Name first: " + firstb.name); //покажет имя
		System.out.println("ID: " + secondb.getId() + "; Name second: " + secondb.name); //покажет айди и имя
		System.out.println("Name third: " + thirdb.name + "; Paged: " + thirdb.getPaged() + "; Year: " + thirdb.getyear()); //покажет айди и имя и год
		System.out.println("ID: " + fourthb.getId() + "; Name fourth: "+ fourthb.name + "; Paged: " + fourthb.getPaged() + "; Year: " + fourthb.getyear() + "; Color: " + fourthb.getColor() ); //покажет айди и имя и год and color

	}

}
