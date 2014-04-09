public class LLDriver{
	public static void main(String[] args) {
		LinkedList2 L = new LinkedList2();
		System.out.println(L);

		L.add("Sully");
		System.out.println(L);
		L.add("Mike");
		System.out.println(L);
		L.add("Randall");
		System.out.println(L);
		L.add("Boo");
		L.add("hi");
		L.add("ho");
		L.add("hum");
		System.out.println(L);
		System.out.println(L.get(2));
	}
}