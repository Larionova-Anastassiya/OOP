package Task3;

//добавить, удалить, изменить, вывести результат, размер (индексы, сортировка - интерфесом, т.к. не у всех)

public interface MyCollection extends Sort, Index, Change {
	
	//будет выводить в будущем можем ли мы добавить, удалить и изменить
	boolean add(Object o);
	
	boolean delete(Object o);

	//boolean change(Object o);
	
	
	//будет выводить и показывать размер
	void print(Object o);
	
	void size(Object o);
	
	boolean remove(Object o);
	
	String toString();
	
}
