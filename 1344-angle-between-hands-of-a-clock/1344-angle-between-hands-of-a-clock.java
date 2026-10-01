class Solution {
    public double angleClock(int hour, int minutes) {
        double first = Math.abs(30*hour - 5.5 * minutes);
        if(first >180)
            first = 360-first;
        return first;
    }
}