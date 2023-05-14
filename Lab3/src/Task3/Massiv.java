package Task3;

public class Massiv implements MyCollection, Duplicate{
	//or implements Sort, Index only

	@Override
	public boolean sorting(Object o) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean indexes(Object o) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean add(Object o) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean change(Object o) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void print(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void size(Object o) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	//SPECIFIC ONLY MASSIV
	@Override
	public boolean duplicates(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
