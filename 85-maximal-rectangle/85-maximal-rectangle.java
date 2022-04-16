class Solution {
    
    public void display(int[] arr){
        
        for(int val : arr)
            System.out.print(val + " ");
        
        System.out.println();
    }
    
    public int maximalRectangle(char[][] arr) {
        
        int ans = 0;
        int[] temp = new int[arr[0].length];
        
        for(int i=0; i<arr[0].length; i++){
            
            temp[i] = arr[0][i]-'0';
        }
        
        display(temp);
        ans = calcArea(temp);
        
        for(int i=1; i<arr.length; i++){
            
            for(int j=0; j<arr[0].length; j++){
                
                if(arr[i][j]=='1')
                    temp[j] = ++temp[j];
                
                else
                    temp[j] = 0;
            }
            
            display(temp);
            int res = calcArea(temp);
            ans = Math.max(ans,res);
        }
        
        return ans;
    }
    
    public int calcArea(int[] arr){
        
        Stack<Integer> st = new Stack<>();
        int[] nsel = new int[arr.length];
        nsel[0] = -1;
        st.push(0);
        
        for(int i=1; i<arr.length; i++){
            
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
    
        
        int max_area = 0;
        
        for(int i=0; i<arr.length; i++){
            
            int width = nser[i] - nsel[i] - 1;
            int curr = arr[i]*width;
            
            max_area = Math.max(max_area,curr);
        }
        
        return max_area;
    }
}