import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] arr) {
        
        Stack<Integer> st = new Stack<>();
        int[] nsel = new int[arr.length];
        nsel[0] = -1;
        st.push(0);
        
        for(int i=0; i<arr.length; i++){
            
            while(st.size()!=0 && arr[i]<=arr[st.peek()])
                st.pop();
            
            if(st.size()==0)
                nsel[i] = -1;
            
            else
                nsel[i] = st.peek();
            
            st.push(i);
        }
        
        st = new Stack<>();
        int[] nser = new int[arr.length];
        nser[arr.length-1] = arr.length;
        st.push(arr.length-1);
        
        for(int i=arr.length-2; i>=0; i--){
            
            while(st.size()!=0 && arr[i]<=arr[st.peek()])
                st.pop();
            
            if(st.size()==0)
                nser[i] = arr.length;
            
            else
                nser[i] = st.peek();
            
            st.push(i);
        }
        
        int max_area = -1;
        
        for(int i=0; i<arr.length; i++){
            
            int width = nser[i] - nsel[i] - 1;
            int area = arr[i] * width;
            
            max_area = Math.max(max_area,area);
        }
        
        return max_area;
    }
}