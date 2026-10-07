class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int sum =0;
        for(String row : bank){
            int count =0;
            for(int i =0;i<row.length();i++){
                if(row.charAt(i) == '1')
                    count++;
            }
            if(count !=0){
                sum = sum + prev*count;
                prev = count;
            }
        }
        return sum;
    }
}