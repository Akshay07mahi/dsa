public class Main
{
    static int top =-1 ; 
    static int arr[] = new int[10];
    public static void push(int data)
    {
        if( top == 9)
        {
            System.out.println(" the stack is full");
            return;
        }
        else{
            arr[++top] = data;
        }
    }
    
    public static void ShowAllElements()
    {
        if( top == -1 )
        {
            System.out.println(" there is no elements in Stack");
            return;
        }
        
        for( int i =top ; i >=0 ; i--)
        {
            System.out.println(" "+arr[i]);
        }
    }
    
    
    public static int pop()
    {
        if( top == -1)
        {
            System.out.println(" there is no element to pop");
            return 0;
        }
        int ele = arr[top--];
        return ele;
    }
    
    
    public static int peek()
    {
        if( top == -1)
        {
            System.out.println(" there is no element to pop");
            return 0;
        }
        int ele = arr[top];
        return ele;
        
    }
    
    
    public static boolean isEmpty()
    {
        if  (top == -1 )
        {
            return true;
        }
        
        return false;
    }
    
    public static int size()
    {
      return top + 1 ;
    }
    public static void main(String[] args) {
        System.out.println("Is Empty :"+isEmpty());
        System.out.println("Size of the Stack:"+size());

	    ShowAllElements(); 
	    push(5);
	    push(2);
	    push(4);
	    push(7);
        System.out.println("Is Empty :"+isEmpty());
        System.out.println("Size of the Stack:"+size());

	    ShowAllElements();
	    System.out.println(" peek element of the stack: "+peek());
	    System.out.println(" deleted top element : "+pop());
	    System.out.println(" peek element of the stack after deletion: "+peek());
        System.out.println("Size of the Stack:"+size());
        
        
	}
}
