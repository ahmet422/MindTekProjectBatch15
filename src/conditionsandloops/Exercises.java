package conditionsandloops;

import java.util.Scanner;

public class Exercises {

    public String findNameOfDay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number in range 1 to 7");
        int day = input.nextInt();

//        if(day ==1) return  "Monday";
//        else if(day == 2) return  "Tuesday";
//        else if(day == 3) return  "Wednesday";
//        else if(day == 4) return  "Thursday";
//        else if(day == 5) return  "Friday";
//        else if(day == 6) return  "Saturday";
//        else if(day == 7) return  "Sunday";
//        else return  "not valid week day";
        String res= "";
        switch(day){
            case 1:
                res= "Monday";
                break;
            case 2:
                res= "Tuesday";
                break;
            case 3:
                res= "Wednesday";
                break;
            case 4:
                res= "Thursday";
                break;
            case 5:
                res= "Friday";
                break;
            case 6:
                res= "Saturday";
                break;
            case 7:
                res= "Sunday";
                break;
            default:
                res= "invalid day";
                break;
        }
        return res;
    }
    public String findNameOfSeason(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month = input.next().toLowerCase();
        if(month.equals("january") || month.equals("december") || month.equals("february")) return "winter";
        else if(month.equals("march") || month.equals("april") || month.equals("may")) return "spring";
        else if(month.equals("june") || month.equals("july") || month.equals("august")) return "summer";
        else if(month.equals("september") || month.equals("october") || month.equals("november")) return "autumn";
        else return "invalid month!";
    }

}
