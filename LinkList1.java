package Link;

public class LinkList1 {
	private Link1 first;
	public LinkList1(){
		first=null;
	}
	public Link1 getFirst(){
		return first;
	}
	public void setFirst(Link1 f){
		first =f;
	}
	public boolean isEmpyt(){
		return first==null;
	}
	public void displayList(){
		Link1 current = first;
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println();
	}
	public ListIterator getIterator(){
		return new ListIterator(this);
	}
}
class ListIterator{
	private Link1 current;
	private Link1 previous;
	private LinkList1 ourList;
	public ListIterator(LinkList1 list){
		ourList= list;
	}
	public void reset(){
		current= ourList.getFirst();
		previous =null;
	}
	public boolean atEnd(){
		return current.next==null;
	}
	public void nextLink(){
		previous= current;
		current= current.next;
	}

	public Link1 getCurrent(){
		return current;
	}
	public void insertAfter(long dd){
		Link1 newLink = new Link1(dd);
		if(ourList.isEmpyt()){  //如果为空，就放到第一个
			ourList.setFirst(newLink);
			current=newLink;//指针移向newlink
		}else{
			newLink.next=current.next;
			current.next=newLink;
		}
	}
	public void insertBefore(long dd){
		Link1 newLink = new Link1(dd);
		if(previous==null){
			newLink.next=ourList.getFirst();	//如果前一个为零，那么newlink的下一个是原来的第一个
			ourList.setFirst(newLink);
			reset();
		}else{
			newLink.next= previous.next; //新的下一个是前一个的下一个（新的节点取代前一个的位置）  
			previous.next=newLink;
			current= newLink;
		}
	}
	public long deleteCurrent(){
		long value=  current.dData; //当前指针所指节点的数据
		if(previous==null){
			ourList.setFirst(current.next);//把当前指针的下一个定义为first
			reset();
		}else{
			previous.next= current.next;
			if(atEnd()) reset(); //如果current.next为null，那么把当前设为first
			else
				current= current.next;
		}
		return value;
	}
}
