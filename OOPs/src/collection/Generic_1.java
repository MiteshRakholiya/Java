package collection;

class Data {

	public Object getObj() {
		return obj;
	}

	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
}


class GenricClass<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public GenricClass(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenricClass [data=" + data + "]";
	}
}


public class Generic_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Data data = new Data("String");
//		String variable=(String) data.getObj();
//		System.out.println(variable);

		GenricClass<String> gc = new GenricClass<String>("Some data");
		String data =  gc.getData();
		System.out.println(data);
	}

}
