public class ReadTheTime {
    private int hours;
    private int minutes;

    public void setTime(String timeStr) {
        String[] timeParts = timeStr.split(":");

        this.hours = Integer.parseInt(timeParts[0]);
        if (this.hours > 12) { this.hours = this.hours - 12; }
        this.minutes = Integer.parseInt(timeParts[1]);
    }

    public String convert() {
        String hrs = numberToWord(this.hours);
        String mins = numberToWord(this.minutes);
        String minStr = "minutes";

        if (this.hours == 0 && this.minutes == 0) {
            return hrs;
        } else if (this.minutes == 0) {
            return hrs + " o'clock";
        } else if (this.minutes > 0 && this.minutes < 30){
            if (this.minutes == 1) { minStr = "minute"; }
           return mins + " " + minStr + " past " + hrs;
        } else if (this.minutes == 30) {
            return "Half past " + hrs;
        } else {
            String minsLeft = numberToWord(60 - this.minutes);
            if (60 - this.minutes == 1) { minStr = "minute"; }
            return minsLeft + " " + minStr +" to " + hrs;
        }
    }

    private String numberToWord(int num) {
        String[] units = {"midnight", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                          "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};

        if (num < 20) {
            return units[num];
        } else {
            int tensPart = num / 10;
            int unitsPart = num - (tensPart * 10);

            return tens[tensPart] + " " + units[unitsPart];
        }
    }
}
