package polymorphism;

public class ObjectPrint {

	int num;
	
	public ObjectPrint(int num) {
		this.num = num;
	}
	
	

	@Override
	public String toString() {
		return "ObjectPrint [num=" + num + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectPrint op = new ObjectPrint(56);
		System.out.println(op );
	}

}
