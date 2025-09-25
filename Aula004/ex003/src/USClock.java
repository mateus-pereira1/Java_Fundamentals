public class USClock extends Clock{

    private String periodIndicator;

    public void setAfterMidDay(){
        this.periodIndicator = "PM";
    }

    public void setBeforeMidDay(){
        this.periodIndicator = "AM";
    }

    public void setHour(int hour){
        setBeforeMidDay();
        if((hour >= 12) && (hour <= 23)){
            setAfterMidDay();
            this.hour = hour - 12;
        } else if (hour >= 24){
               this.hour = 0;
           } else{
            this.hour = hour;
        }
    }
    @Override
    Clock convert(final Clock clock){
        return null;
    }
}
