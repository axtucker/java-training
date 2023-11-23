package OOP;

public class Demo {

    public static void main(String[] args) {
          //Person

          // Attributes, variables, adjectives, descriptors
          String name = "Joe";
          String email = "joe@testemail.com";
          String phone = "7755551212";

          //Action, activity, behavior
          System.out.println(name + " is walking");
          System.out.println(name + " is eating");

          //What if we wanted to do this for another person
          String name2 = "Sarah";
          String email2 = "sarah@testemail.com";
          String phone2 = "7753331212";

          //Action, activity, behavior
          System.out.println(name2 + " is walking");
          System.out.println(name2 + " is eating");
    }
//Enhance by adding functions to minimize code
    public static void walking(String name) {
                System.out.println(name + " is walking as well");

          }

}
