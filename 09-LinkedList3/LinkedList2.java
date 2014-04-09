public class LinkedList2{
	private Node head;
	private Node tail;

	public LinkedList2(){
		head = new Node("asda");
		tail = head; 
	}

	public String toString(){
		String ans = " "; 
		Node tmp = head; 
		while( !(tmp.getNext() == null)){ //|| !(tmp.getNext().equals(head))){
			ans += tmp.getNext(); 
		} 
		return ans; 
	}


	public void add(String d){
		tail.setNext(new Node(d)); 
		tail = tail.getNext(); 
	}

	public String get(int i){
		//String ans = ""; 
		Node temp = head; 
		//int index = i;
		for (int a = 0; a < i + 1; a ++) {
		 	temp = temp.getNext(); 
		 } 
		 return temp.getData(); 
		}
//return ans;
	

	public void add(int a, String d){
		Node temp = head;
		for (int i = 0; i < a ; i++ ) {
			temp = temp.getNext();
		}
		Node e = new Node(d); 
		temp.setNext(e);
	}

	public String set(int i, String s){
		Node temp = head;
		String ans = "";  
		for (int a = 0; a < i ; a++ ) {
			temp = temp.getNext();
		}
		ans = temp.getData(); 
		temp.setData(s); 
		return ans; 
	}
	public String remove(int i ){
		Node temp = head;
		for (int a = 0;a<i;a++){
			temp = temp.getNext();
		}
		String ans = temp.getNext().getData();
		temp.setNext(temp.getNext().getNext());
		if (i==this.length()-1){
			tail=temp;
		}
		return ans;
	}
	public int find(String s){
		Node temp = head;
		int i = -1;
		while(!(temp.getNext()==null)&&!(temp.getNext().equals(head))){
			i++;
			temp = temp.getNext();
			if (temp.getData().equals(s)){
				return i;
			}
		}
		return -1;
	}
	public int length(){
		Node temp = head.getNext();	
		int i = 0;
		while(!(temp.getNext().equals(head)||temp.getNext()==null)){
			i++;
		}
		return i;
	}
	
}