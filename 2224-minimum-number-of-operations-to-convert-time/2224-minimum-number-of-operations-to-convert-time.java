class Solution {
    public int convertTime(String current, String correct) {
        int h1 = Integer.parseInt(current.substring(0,2));
        int h2 = Integer.parseInt(correct.substring(0,2));
        int min1 = Integer.parseInt(current.substring(3,5));
        int min2 = Integer.parseInt(correct.substring(3,5));
        int diff = Math.abs((h1*60+min1) -(h2*60+min2));
        int count =0;
        if(diff >=60){
            count = count + diff/60;
            diff = diff%60;
        }
        if(diff >=15){
            count = count + diff/15;
            diff = diff%15;
        }
        if(diff >=5){
            count = count + diff/5;
            diff = diff%5;
        }
        if(diff >=1){
            count = count + diff;
        }
        return count;
    }
}