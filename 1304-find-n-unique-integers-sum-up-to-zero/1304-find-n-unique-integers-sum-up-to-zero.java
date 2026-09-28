class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        if(n%2!=0){
            int end = n/2;
            int start = -n/2;
            for(int i =0;i<res.length;i++){
                res[i] = start++;
            }
        }
        else{
            int end = n/2;
            int start = -n/2;
            for(int i =0;i<res.length;i++){
                if(start == 0)
                    start++;
                res[i] = start++;
            }
        }
        return res;
    }
}