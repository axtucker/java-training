package basics;

public class Cities {
    public static void main(String[] args) {

        // Declare and define an array
        String[] cities = {"New York", "San Francisco", "Miami", "Carson City"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);

        System.out.println("**************");
        //Declare array and number of items in the array
        String[] states = new String[5];
        states[0] = "California";
        states[1] = "Ohio";
        states[2] = "New Jersey";
        states[3] = "Texas";
        states[4] = "Nevada";

        int i =0;
        // Do loop: enters the loop THEN tests condition

        do {
            System.out.println("State: " + states[i]);
            i = i + 1;
        } while (i < 5);

        //While loop: Tests condition first, then enters loop
        int n = 0;
        boolean stateFound = true;
        while (!stateFound){
            String state = states[n];
            System.out.println(state);
            if (state == "Texas") {
                System.out.println("State found!");
                stateFound = true;
            }
            n++;
        }
        // for loop:  Best structure for iterating through an array
        for ( int x = 0; x < 5; ++x) {
            System.out.println("+++++++++++++++++++");
            System.out.println(states[x]);
        }
    }
}
