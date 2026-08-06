class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for(int  i= 0;i<arr2.length;i++){
            int temp = arr2[i];
            int digits =0;
            while(temp >0){
                temp = temp/10;
                digits++;
            }
            int divisor = (int)Math.pow(10,digits-1);
            while(divisor >0){
                set.add(arr2[i]/divisor);
                divisor /=10;
            }
        }
        int count =0;
        int max =0;
        for(int i =0;i<arr1.length;i++){
            int temp = arr1[i];
            int digits =0;
            while(temp >0){
                temp = temp/10;
                digits++;
            }
            int divisor = (int)Math.pow(10,digits-1);
            int len =1;
            while(divisor >0){
                if(set.contains(arr1[i]/divisor))
                    max = Math.max(max,len);
                divisor /=10;
                len++;
            }
        }
        return max ;
    }
}