package collection;

	/*
	 * 
	The naming conventions are as follows:
	T - Type
	E - Element
	K - Key
	N - Number
	V - Value
	 * 
	 */

	class Test<K,V>{
		private K key;
		private V value;
		public Test(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public K getKey() {
			return key;
		}
		public V getValue() {
			return value;
		}
		
		@Override
		public String toString() {
			return "Data [key=" + key + ", value=" + value + "]";
		}
		
		public <E, N> void display(E element, N number){
			System.out.println("Element: "+element+ " Number: "+number);
		}
		
	}

	public class Type_Parameter {

		public static void main(String[] args) {
			Test<Integer, String> data = new Test<Integer, String>(1, "Chaand");
			
			System.out.println("Key: "+data.getKey()+" value: "+data.getValue());
			data.display("2.0", 25);
		}

	}

