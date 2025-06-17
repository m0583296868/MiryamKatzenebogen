
public class Program {


	public static BinNode<Integer> createTree(int count)
	{

		BinNode<Integer> root=new BinNode<Integer>((int)Math.random()*100+10);
		BinNode<Integer> child=root;
		int x;
		for (int i = 0; i < count-1; i++)
		{
			Double d=Math.random();
			//System.out.println(d);
			x=(int)((d*100)%2);
			//System.out.println(x);
			if(x==0) 
			{
				child.setRight(new BinNode<Integer>((int)Math.random()*100+10));
				System.out.println("right");
			}			
			child.setLeft(new BinNode<Integer>((int)Math.random()*100+10));
			x=((int)Math.random()*10)%2;
			if(x==0) 
			{
				child=child.getLeft();
			}
			else
				child=child.getRight();
		}			
		return root;
	}

	
	public static BinNode<Integer> createTreeByLevel(int level)
	{
		BinNode<Integer> root=new BinNode<Integer>((int)(Math.random()*100)+10);
		if(level>0)
		{
			root.setLeft(createTreeByLevel(level-1));
			root.setRight(createTreeByLevel(level-1));
		}
		return root;
	}
	
	public static void printTreeInOrder(BinNode<Integer> root, int level)
	{
		if(root==null)
			return;
		// קריאה לביקור בן שמאלי
		printTreeInOrder(root.getLeft(), level+1);
		// ביקור בשורש
		for (int i = 0; i < level; i++) {
			System.out.print("_");
		}
		System.out.println(root.getValue());

		// ביקור בן ימני
		printTreeInOrder(root.getRight(), level+1);
	}

	public static void printTreePreOrder(BinNode<Integer> root, int level)
	{
		if(root==null)
			return;
		
		// ביקור בשורש
		for (int i = 0; i < level; i++) {
			System.out.print("_");
		}
		System.out.println(root.getValue());

		// קריאה לביקור בן שמאלי
		printTreePreOrder(root.getLeft(), level+1);
		
		// ביקור בן ימני
		printTreePreOrder(root.getRight(), level+1);
	}
	
	public static void printTreePostOrder(BinNode<Integer> root, int level)
	{
		if(root==null)
			return;
		// קריאה לביקור בן שמאלי
		printTreePostOrder(root.getLeft(), level+1);
		
		// ביקור בן ימני
		printTreePostOrder(root.getRight(), level+1);
		// ביקור בשורש
		for (int i = 0; i < level; i++) {
			System.out.print("_");
		}
		System.out.println(root.getValue());		
	}
	
	
	public static boolean isLeaf(BinNode<Integer> root)
	{
		if(!root.hasLeft() && ! root.hasRight())
			return true;
		return false;
	}
	
	public static int hight(BinNode<Integer> root)
	{
		if(root==null || isLeaf(root))
		{
			return 0;
		}
		int l= hight(root.getLeft());//גובה בן שמאלי
		int r= hight(root.getRight());// גובה בן ימני
		if(l>r)
			return l+1;
		return r+1;
	}
	
	public static boolean task5(BinNode<Integer> root,BinNode<Integer> tmp) 
	{
		if(root==null ||tmp==null)
		{
			return false;
		}
		 if(tmp.getValue()<=root.getValue())return false;		

			 task5(root,tmp.getLeft());
		 task5(root,tmp.getRight());
		 return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinNode<Integer> t=createTreeByLevel(3);//createTree(10);
		t.setValue(800);
		t.getLeft().setValue(2000);
		printTreeInOrder(t,0);
		System.out.println("task 5 : "+task5(t,t));
		
		
		
	}

}
