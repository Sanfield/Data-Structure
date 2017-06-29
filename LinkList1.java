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
		if(ourList.isEmpyt()){  //���Ϊ�գ��ͷŵ���һ��
			ourList.setFirst(newLink);
			current=newLink;//ָ������newlink
		}else{
			newLink.next=current.next;
			current.next=newLink;
		}
	}
	public void insertBefore(long dd){
		Link1 newLink = new Link1(dd);
		if(previous==null){
			newLink.next=ourList.getFirst();	//���ǰһ��Ϊ�㣬��ônewlink����һ����ԭ���ĵ�һ��
			ourList.setFirst(newLink);
			reset();
		}else{
			newLink.next= previous.next; //�µ���һ����ǰһ������һ�����µĽڵ�ȡ��ǰһ����λ�ã�  
			previous.next=newLink;
			current= newLink;
		}
	}
	public long deleteCurrent(){
		long value=  current.dData; //��ǰָ����ָ�ڵ������
		if(previous==null){
			ourList.setFirst(current.next);//�ѵ�ǰָ�����һ������Ϊfirst
			reset();
		}else{
			previous.next= current.next;
			if(atEnd()) reset(); //���current.nextΪnull����ô�ѵ�ǰ��Ϊfirst
			else
				current= current.next;
		}
		return value;
	}
}
