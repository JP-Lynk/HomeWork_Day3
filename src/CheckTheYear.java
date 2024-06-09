public class CheckTheYear{
    public void CheckLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("This is a leap year");
        }
        else if(year % 400 == 0){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }
}