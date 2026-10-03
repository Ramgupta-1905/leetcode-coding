class Solution {
    public int findSpecialInteger(int[] arr) {
        int occur = arr.length/4;
        int can =arr[0];
        int count =1;
        for(int i =1;i<arr.length;i++){
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