public class MyLinkedList{
	private Node head;

	public MyLinkedList(){
		head = null;
	}

	public String toString(){
		return " " + head; 
	}
	public void add(String d){
		Node tmp = new Node(d);
		tmp.setNext(head);
		head = tmp;
	}
	public String get(int i){
		String ans = ""; 
		int index = i;
		Node temp = new Node(head.getNext().getData());
		
		if (i ==0) {
			ans = temp.getData();
			return ans;
		}
		//else if(i == 1){
		//	ans = temp.getData();
		//}
		else{
			temp = temp.getNext();
			index = i - 1; 
			return  get(index); 
		}
//return ans;
	}
	public void add(int a, String d){
		Node temp = head;
		for (int i = 0; i < a ; i++ ) {
			temp = temp.getNext();
		}
		Node e = new Node(d); 
		temp.setNext(e);
	}
	public String set(int i, String s){

	}

}