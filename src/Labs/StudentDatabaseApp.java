package Labs;

public class StudentDatabaseApp {

    public static void main(String[] args) {
          Student student01 = new Student("Hank","Kansas", "774108549");
          student01.setPhoneNbr("775 555-1212");
          student01.setHomeAddr("123 Main St");
          student01.setCity("Carson City");
          student01.setState("Nevada");
//*          System.out.println("Phone: " + student01.getPhoneNbr());
          System.out.println("Home Address" + "\n" + student01.getHomeAddr());
          System.out.println(student01.getCity() + ", " + student01.getState());

        Student student02 = new Student("laura","Contigo", "820519683");
        student02.setPhoneNbr("775 555-4444");
        student02.setHomeAddr("987 South St");
        student02.setCity("Carmel Valley");
        student02.setState("California");
//*        System.out.println("Phone: " + student02.getPhoneNbr());
        System.out.println("Home Address" + "\n" + student02.getHomeAddr());
        System.out.println(student02.getCity() + ", " + student02.getState());

    }
}

//Primary class implementing interface

class Student {
    private String fname;
    private String lname;
    private String SSN;
    private String emailAddr;
    private String userID;
    private static int privateID = 1000;
    private String phoneNbr;
    private String homeAddr;
    private String city;
    private String state;
    private double due;


    public Student(String fname, String lname, String SSN) {
        this.fname = fname;
        this.lname = lname;
        this.SSN = SSN;
        setUserID();
        setemailID();
        System.out.println("***************** Next Student *******************");
        System.out.println("Your User ID is: " + userID);
        System.out.println("Name: " + fname + " " + lname);
        System.out.println("Your Private ID is: " + privateID);
        System.out.println("Your email address is: " + emailAddr);
        System.out.println("Phone from Student Method: " + this.phoneNbr);
    }
    private void setUserID() {
        int random = (int) (Math.random() * 1000);
        if (random < 9000) {
            userID = privateID + random + SSN.substring(6, 9);


            //System.out.println(random);
            //System.out.println(privateID);
            privateID++;
        }
    }
    private void setemailID() {
        emailAddr = fname.substring(0,1) + lname.substring(0,(lname.length())) + "@duck.com";

    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }
/*    public String getPhoneNbr() {
        return phoneNbr;
    }
*/
    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }
    public String getHomeAddr() {
        return homeAddr;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void enroll() {
    }
    public void pay() {
    }
    public void checkBalance() {
    }
    public void showCourses() {
        }

}
