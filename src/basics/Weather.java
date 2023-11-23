package basics;

public class Weather {
    public static void main(String[]args) {
        //This program gives suggestions on what to wear based on the weather (temperature)

        int temperature = 45;
        String sunCondition = "Overcast";

        if (temperature > 80) {
            System.out.println("Its pleasant.  Wear shorts and T-Shirt");
        } else if ((temperature > 60) && (sunCondition == "Sunny")) {
            System.out.println("Its a little cooler.  Perhaps wear a long sleeved shirt and jeans");
            System.out.println("Wear a hat to keep the sun out of your eyes.");
        }
        else if ((temperature > 50)  || (sunCondition == "Overcast")) {
            System.out.println("This is a cool day, make sure to wear warmer clothes");
        }
        else {
            System.out.println("Looks like a cold day.  Bring a sweater");
        }
        System.out.println("The program is ending");
    }
}
