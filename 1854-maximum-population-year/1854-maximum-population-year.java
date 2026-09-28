class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        for(int i =0;i<logs.length;i++){
            years[logs[i][0]-1950] +=1;
            years[logs[i][1]-1950] -=1;
        }
        int count =0;
        int maxcount = 0;
        int index = 0;
        for(int i =0;i<years.length;i++){
            count = count+years[i];
            if(maxcount<count){
                maxcount = count;
                index = i;
            }
        }
        return 1950+index;
    }
}