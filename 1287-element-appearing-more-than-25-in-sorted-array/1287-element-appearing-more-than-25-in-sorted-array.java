class Solution {
    public int findSpecialInteger(int[] arr) {
        int occur = arr.length/4;
        int can =0;
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!= can){
                can = arr[i];
                count =1;
            }
            else
                count++;
            if(count>occur)
                break;
        }
        return can;
    }
}