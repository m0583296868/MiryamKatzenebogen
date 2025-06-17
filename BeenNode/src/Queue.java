
class Queue<T>	{
   private Node<T> first;
   private Node<T> last;
   public Queue(){
	this.first = null;
	this.last = null;
  }
   public void insert(T x){
	Node<T> temp = new Node<T>(x);
	if (first == null)
		first = temp;
	else
		last.setNext(temp);
	last = temp;
 }
   public T remove() throws Exception
   {
	   if	(first==null)
			  throw new Exception("The queue is empty");
	   T x = first.getValue();
	   first = first.getNext();
	   if (first == null)		   
		   last = null;
	   return x;
   }
  public T head() throws Exception
  {
	  if	(first==null)// IsEmpty()
		  throw new Exception("The queue is empty");
	return first.getValue();
   }
  public boolean IsEmpty(){
	return first == null;
  }
public String toString(){
	String s = "[";
	Node<T> p = this.first;
	if(p==null)
		return null;
	while (p .hasNext()){
		s = s + p.getValue().toString()+ ",";
		p = p.getNext();
	}
	s = s + p.getValue().toString()+ "]";
	return s;
  }
}
