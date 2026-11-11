class Solution {
    public int countPrimes(int n) {
        if(n<2)
            return 0;
        boolean[] mark = new boolean[n];
        mark[0] = true;
        mark[1] = true;
        for(int i =2;i*i<n;i++){
            if(mark[i] == true)
                continue;
            for(int j = i+i;j<mark.length;j=j+i){
                    mark[j] = true;
            }
        }

        int count =0;
        for(int i =0;i<mark.length;i++)
            if(!mark[i])
                count++;
        return count;
    }
}