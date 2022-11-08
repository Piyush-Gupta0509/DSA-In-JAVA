package Stack;
import java.util.*;
public class StockSpanner {
    Stack<Integer> st;
    ArrayList<Integer> List;

    public StockSpanner() {
        st=new Stack<Integer>();
        List=new ArrayList<Integer>();     
    }
    
    public int next(int price) {
        List.add(price);
        int n=List.size()-1;
        if(st.size()==0){
            st.push(0);
            return 1;
        }

        if(List.get(st.peek()) <= price){
            while(st.size()>0 && List.get(st.peek()) <= price){
                st.pop();
            }
            if(st.size()==0){
                st.push(n);
                return n+1;
            }
            int ans=n-st.peek();
            st.push(n);
            return ans;
        }
        int ans=n-st.peek();
        st.push(n);
        return ans;


    }
    public static void main(String[] args) {
        StockSpanner obj = new StockSpanner();
        System.out.println(obj.next(100));
        System.out.println(obj.next(80));
        System.out.println(obj.next(60));
        System.out.println(obj.next(70));
        System.out.println(obj.next(60));
        System.out.println(obj.next(75));
        System.out.println(obj.next(85));
    }

}
