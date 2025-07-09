import java.time.LocalTime;

public class Registrationtimeleft {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime registrationendtime = LocalTime.of(18, 59, 59);
        int hoursLeft=registrationendtime.getHour()- currentTime.getHour();
        int minutesLeft=registrationendtime.getMinute()- currentTime.getMinute();
        int secondsLeft=registrationendtime.getSecond()- currentTime.getSecond();
        System.out.println("you have" + hoursLeft + " hours, " + minutesLeft + " minutes, " + secondsLeft + " seconds");
        
    }
}
