
public class MainTest {
	public static Queue<Integer> tmp(Queue<Integer> q)throws Exception {
		Stack<Integer> tmp=new Stack<Integer>();
		Queue<Integer> qnew=new Queue<Integer>();


		while (!q.IsEmpty()) {
			int x=q.remove();
			tmp.push(x);
		}
		
	while(!tmp.isEmpty()) {		
		q.insert(tmp.top());

		qnew.insert(tmp.pop());
	}
	return qnew;
	}
	
	
	public static boolean f3(Queue<Integer>q) throws Exception{
		while (!q.IsEmpty())
		{
			int x=q.remove();
			int y=0;
			if(!q.IsEmpty())
			{ y=q.head();
			if(x>=0&&y>=0||x<0&&y<0)
				return false;}
			
		}
		
		return true;
	}
	
	
	
	
	public static boolean f1(Queue<Integer>q,Queue<Integer>q1) throws Exception{
		Queue<Integer> tmp=tmp(q);

		Queue<Integer> tmp1=tmp(q1);


		while (!tmp.IsEmpty()&&!q.IsEmpty()) {

			if(tmp.remove()==tmp1.head()) {	
				
				tmp1.remove();
					if(tmp1.IsEmpty())
					return true;
			
			}
			else
				{tmp1=tmp(q1);
				q.remove();
				tmp=tmp(q);
				}	
			
		}
		return false;
	}
	public static void f2(Queue<Integer>q)throws Exception {
		Stack<Integer> s=new Stack<Integer>();
int m=0;
int i=0;
		while(!q.IsEmpty()) {
			i++;
			m+=q.head();
			s.push(q.remove());
			if(i%3==0) {
				s.push(m);m=0;}
			
			
		}
		while(!s.isEmpty())
		{
			q.insert(s.pop());
		}
	}
	
	
	
	public static void main(String[] args)throws Exception {
Queue<Integer> q=new Queue<Integer>();
q.insert(1);
q.insert(4);
q.insert(7);
q.insert(4);
q.insert(7);
q.insert(1);
q.insert(7);
q.insert(1);

Queue<Integer> q1=new Queue<Integer>();
q1.insert(-1);
q1.insert(5);
q1.insert(-1);
q1.insert(-5);

//f2(q);
//System.out.println(f1(q,q1));
System.out.println(f3(q1));

	}

}
