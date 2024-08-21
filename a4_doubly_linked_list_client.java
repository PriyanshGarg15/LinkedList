public class a4_doubly_linked_list_client {
	public static void main(String[] args) throws Exception {
		a3_doubly_linked_list_class ll = new a3_doubly_linked_list_class();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddLast(40);
		ll.AddatIndex(-20, 2);
		ll.AddLast(42);
		ll.AddLast(67);
		ll.AddLast(90);
		ll.Display();

	}
}

