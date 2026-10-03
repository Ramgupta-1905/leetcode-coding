class Solution {
    int count =0;
    public int numberOfSteps(int n) {
        if(n == 0)
            return count;
        if(n%2== 0){
            count =  1+numberOfSteps(n/2);
        }
        else {
             count =  1+numberOfSteps(n-1);
        }       
        return count;
    }
}