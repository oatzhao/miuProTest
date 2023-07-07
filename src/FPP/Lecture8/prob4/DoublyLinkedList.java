package FPP.Lecture8.prob4;

public class DoublyLinkedList {
		class Node {
			String value;
			Node next;
			Node previous;
			Node(String x) {value = x;}
			public String toString() {
				return value == null ? "null" : value;
			}
		}

		int numberOfNodes;
		Node head, tail;

		DoublyLinkedList(){
			//header = new Node();
			numberOfNodes = 0;
			head = new Node("0");
			tail = new Node("0");
			head.next = tail;
			tail.previous = head;
		}
		//adds to the end of the list
		public void addLast(String item){
			Node succ = tail;
			Node pred = tail.previous ;
			++numberOfNodes;
			Node toAdd = new Node(item);
			toAdd.previous = pred;
			toAdd.next = succ;
			pred.next = toAdd;
			succ.previous = toAdd;
		}
		public void remove(String item){
			Node temp = head, prev = null;
			if (temp != null && temp.value == item) {
				head = temp.next;
				return;
			}

			while (temp != null && temp.value != item) {
				prev = temp;
				temp = temp.next;
			}

			if (temp == null)
				return;

			prev.next = temp.next;
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			toString(sb, head);
			return sb.toString();

		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}

		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			System.out.println(list);
			list.addLast("Crol");
			System.out.println(list);
			list.remove("Bob");
			System.out.println(list);
		}
}
