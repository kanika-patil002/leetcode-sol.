class Solution {
    public double angleClock(int hour, int minutes) {
        hour %= 12;
        double minAngle = minutes * 6.0;
        double hrAngle = hour * 30.0 + minutes * 0.5;

        double diff = Math.abs(hrAngle - minAngle);

        return Math.min(diff , 360.0 - diff);
    }
}