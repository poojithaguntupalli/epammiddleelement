import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Integer middleNumber = 0; int result = 0;
        Scanner s = new Scanner(System.in);
        Integer numberOfElements = s.nextInt();                          // Reading input from STDIN
 
        LinkedList<Integer> Llist = new LinkedList<Integer>();
        for(int i=1;i<=numberOfElements;i++){
        Integer input = s.nextInt();
        Llist.add(input);
       
        }
        
        Collections.sort(Llist);
        if(numberOfElements%2==0)
        {
            middleNumber = (numberOfElements/2)+1;
            result = Llist.get(middleNumber-1);
        }
        else{
            
            middleNumber = (numberOfElements+1)/2 ;
            result = Llist.get(middleNumber-1);
        }
        System.out.println(result);
    }
}
