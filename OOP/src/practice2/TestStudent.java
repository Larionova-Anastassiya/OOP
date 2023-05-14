//для проверки кода написанный ранее. можно менять данные и в классе и в основном коде
package practice2;

public class TestStudent {
	public static void main(String[] args) {
		//Student s = new Student(); вызов и покажет пустой
		Student s = new Student("Anna", 1,20, 60); //имя добавится с айди и годом,grade но покажет только имя
		Student t = new Student("Miras", 3,22, 80);
		Student v = new Student("Nastya", 67,21, 100);
		System.out.println(s.name + " " + s.getGrade()); //покажет имя
		System.out.println(t.getId() + " " + t.name); //покажет айди и имя
		System.out.println(v.getId() + " " + v.name + " " + v.getyear()); //покажет айди и имя и год
	}
}
