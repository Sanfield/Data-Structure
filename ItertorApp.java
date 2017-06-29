package Link;

public class ItertorApp {
	public static void main(String[] args) {
		LinkList1 thelist= new LinkList1();
		ListIterator iter= new ListIterator(thelist);
		long value;
		iter.insertAfter(20);
		iter.insertAfter(40);
		iter.insertBefore(60);
	}

}
