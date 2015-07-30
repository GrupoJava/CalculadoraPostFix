import java.util.Vector;

public class Stack<Integer> implements ADTStack<Integer> {
	
	private Vector <Integer> myVec;
	
	public Stack() {
		this.myVec = new Vector <Integer>();	
		myVec.clear();
	}

	@Override
	public void empty() {
		myVec.clear();		
	}

	@Override
	public boolean isEmpty() {
		return myVec.isEmpty();
	}

	@Override
	public int size() {
		return myVec.size();
	}
	
	@Override
	public Integer pop() throws Exception {
		if (myVec.isEmpty())
			throw new Exception("Vector vacio!");
		else
			return myVec.remove(myVec.size()-1);
	}

	@Override
	public Integer peek() throws Exception {
		if (myVec.isEmpty())
			throw new Exception("Vector vacio!");
		else
			return myVec.lastElement();
	}

	@Override
	public void push(Integer x) {
		myVec.add(x);
	}

}
