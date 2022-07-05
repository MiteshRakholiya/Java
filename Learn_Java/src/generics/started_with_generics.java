package generics;


class Data<K, V> {
	private Object obj;

	public Data(Object obj, String string) {
		this.obj = obj;
	}

	public Data(String string) {
		// TODO Auto-generated constructor stub
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
//-----------------------------------------------
	
	private K key;
	private V value;

	public void data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public String toString1() {
		return "Data [key=" + key + ", value=" + value + "]";
	}

	public <E, N> void display(E element, N number) {
		System.out.println("Element: " + element + " Number: " + number);
	}

}
	

class GenericClass1<T> {
	private T data;
	private T variable;

	public GenericClass1(T variable) {
		this.variable = variable;
	}

	public T getVariable() {
		return variable;
	}

	public void GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}

}

public class started_with_generics {
	public static void main(String[] args) {

		Data data = new Data("Some String");

		String variable = (String) data.getObj();
		System.out.println(variable);

		/*
		 * GenericClass<String> genericData = new GenericClass<String>("Some data");
		 * String data = genericData.getData(); System.out.println(data);
		 */

	}
}
