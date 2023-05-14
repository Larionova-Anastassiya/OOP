package Lab1;

public class Temperature {
	
		//инициализируем данные которые будут
		double tempValue; //наше число 
		String measureUnit; //вид единицы измерения
	
		
		//объявляем конструкторы с условиями
		
		//дефолтное значение если не указано ничего
		public Temperature() {
			tempValue = 0;
			measureUnit = "C";
		}
				
				
		//если указываем оба значения и число и единицу измерения
		public Temperature(double tempValue, String scale) {
			this.tempValue = tempValue;
			this.measureUnit = scale;
		}
				
				
		//если указываем только единицу измерения то будет дефолтная 0
		public Temperature(String scale) {
			measureUnit = scale;
			tempValue = 0;
		}
		
		
		//если указываем только наше значение то по дефолту будет цельсия
		public Temperature(double tempaValue) {
			this.tempValue = tempaValue;
			measureUnit = "C";
		}
		
		
		
		//методы которые выполняют действия
		//преобразовывает по формуле в фаренгейт
		public double ToFahrenheit(double tempValue) {
			double degreeF = (9 * (tempValue / 5) + 32);
			return degreeF;
		}
		
		//преобразовывает по формуле в Цельсия
		public double ToCelsius(double tempValue) {
			double degreeC = 5 * (tempValue - 32) / 9;
			return degreeC;
			
		}
		
		
		//позволяет нам изменять данные которые мы ввели цифры определяет и какие необходимо добавлять в формулы
		void setValue(double tempValue) {
			this.tempValue = tempValue;
		}
		
		//позволяет нам изменять данные которые мы ввели определяет единицу измерения в какую менять
		void setScale(String scale) {
			this.measureUnit = scale;
			
			//проходит по условиям во что преобразовать и какой метод выполнить
			if(this.measureUnit == "F") {
				this.tempValue = ToFahrenheit(this.tempValue);
			} else {
				this.tempValue = ToCelsius(this.tempValue);
			}
			
		}
		
		
		//выполняет данные значения по методам указанных выше
		/*
		void setValueScale(double tempaValue, String scale) {
			setValue(tempaValue);
			setScale(scale);
		}
		*/
		
		
		//позволяет прочесть нашу единицу измерения
		String getScale() {
			return this.measureUnit;
		}
		
		
		//вернет нам ответ в виде строки ответа цифры новой и новой единицы измерения
		public String toString() {
			
			return this.tempValue + " " + this.measureUnit;
		}
	}

