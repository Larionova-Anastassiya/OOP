package Lab1;
import java.util.Vector;

public class Books {
		//какие будут данные инициализация их
		String name; //название будет
		private int paged; //прямого доступа нет
		private int id;
		private int year; //прямого доступа нет так как приватное
		private String color; //прямого доступа
		Language language; //enum хранящий определенные данные 
		//final book;
		
		//наши статичные данные которые могут меняться
		static int cnt;
		static Vector<Books> books;
		
		
		//будет добавлять в вектор каждый раз когда вызов добавления
		static{
			books = new Vector<Books>();
		}
		//сам считает сколько книг при вызове класса добавляя их в вектор списка
		//init block
		{
			id = cnt++;
			books.add(this);
		}
		
		
		
		
		//constructor чтобы назначать переменные
		public Books() {}
		
		public Books(String name){ //присваивает имени данные
			this.name = name;
		}
		
		
		public Books(String name, int paged, int id, int year, String color, Language language){ //присваивает все данные сразу
			this(name); // 1 способ: если вызвать наш свой же конструктор в прошлом созданный
			//name = name;
			this.paged = paged; //2 способ: используем так как одинаковые названия у значений
			this.id = id;
			this.year = year;
			this.color = color;
			this.language = language;
		}
		
		
		
		
		//methods чтобы манипулировать объектами - символизирует поведение
		public void setName(String person) { //принимает данные, противоположно get
			name = person;
		}
		
		public String getName() { //даем только посмотреть данные
			return(name);
		}
		
		public void setPaged(int newpaged) {
			paged = newpaged;
		}
		
		public int getPaged() {  //даем только посмотреть данные
			return(paged);
		}
		
		public void setId(int newid) {
			id = newid;
		}
		
		public int getId() {  //даем только посмотреть данные
			return(id);
		}
		
		public void setYear(int year) {
			this.year = year; //2 способ: используем так как одинаковые названия у значений
		}
		
		public int getyear() { //даем только посмотреть данные
			return(year);
		}
		
		public void setColor(String color) { //принимает данные, противоположно get
			this.color = color;
		}
		
		public String getColor() { //даем только посмотреть данные
			return(color);
		}
		

		//Выводить будет лист с именем и цветом каждой книги
		public String toString() {
			return "Book: "+ name + ", Color: " + color + ", Language: " + language ;
		}
}
