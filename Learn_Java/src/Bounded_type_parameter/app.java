package Bounded_type_parameter;

import LinkedList.Test;

//class Data<K extends Integer, V extends app> {
//	private K key;
//	private V value;
//
//	public Data(K key, V value) {
//		this.key = key;
//		this.value = value;
//	}
//
//	@Override
//	public String toString() {
//		return "Data [key=" + key + ", value=" + value + "]";
//	}
//
//	public K getKey() {
//		return key;
//	}
//
//	public V getValue() {
//		return value;
//	}
//
//	public <E extends Character, N extends Number> void display(E element, N number) {
//		System.out.println("Element: " + element + " Number: " + number);
//	}
//	----------------------------------------
	class Data<T extends Comparable<T>> implements Comparable<T>{
		private T myVariable;

		public Data(T myVariable) {
			super();
			this.myVariable = myVariable;
		}

		public T getMyVariable() {
			return myVariable;
		}

		@Override
		public String toString() {
			return "Data [myVariable=" + myVariable + "]";
		}

		@Override
		public int compareTo(T o) {
			
			return getMyVariable().compareTo(o);
		}
	}
	
	
public class app {
	public static void main(String[] args) {
//		Data<Integer, app> data = new Data<Integer, app>(1, new app());
//		data.display('$', 1);
//		data.getValue().test();
//		System.out.println(data.getKey());
//		
		
		
		Data<Integer> data = new Data<Integer>(1); //part1
		
		System.out.println(data.compareTo(1));//part2

//	public void test() {
//		System.out.println("Testing....");
	}
}

