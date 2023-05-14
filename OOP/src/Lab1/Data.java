package Lab1;

public class Data {
	
	//инициализируем данные которые должны быть (поля)
	//private double numbers;
	private double sum;
	private double maxixum;
	private int id;
	//static int cnt;
	 
	/*инициализирующий блок если при добавлении сам считал
	{
		id = cnt++;
		Data.add(this)
	}
	*/
	
	// Constructor где дефолтные значения и принимает любое количество данных
	public Data() {
	    this.sum = this.maxixum = this.id = 0;
	}
	  
	
	//Методы которые выполняют действия
	  public double getMax() { //get для доступа к этим переменным
	    return maxixum;
	  }
	  public void setMax(double maxixum) { //set для их изменения
	    this.maxixum = maxixum; //this так как одинаковые названия у переменной класса и переменной метода
	  }
	  public double getSum() {
	    return sum;
	  }
	  public void setSum(double Newsum) {
	    sum = Newsum; //this не используем так как не одинаковые названия а новое
	  }
	  public int getId() {
	    return id;
	  }
	  public double getAverage() {
	    return sum / id; //находим среднее значения деля наши полученные значения
	  }
	  
	  
	  //выполняем наши действия по добавлению чисел принимая дабл числа
	  public void addData(double x) {
		  
		//находим максимум каждое число сравнивая
	    if (this.maxixum < x) {
	      this.maxixum = x;
	    }
	    
	    //сумму автоматически получаем прибавляя каждые данные, а айди (количество) увеличивая с каждым добавлением
	    this.sum += x;
	    this.id++;
	    
	  }
}
