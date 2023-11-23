package Solutions;

public class Lab3Solution {

    public static void main(String[] args) {
    //Create a student
        Student stu1 = new Student("Janelle", "3442984923");
        Student stu2 = new Student("Thomsas", "6435684923");
        Student stu3 = new Student("Elizabeth", "344245620");

        stu1.enroll("Math151");
        stu1.enroll("English155");
        stu1.enroll("His211");

        //stu1.showCourses();
        //stu1.checkBalance();
        stu1.payTuition(600);
        //stu1.checkBalance();
        System.out.println(stu1.toString());


    }
}

class Student {
    //Properties
    private static int iD=10;
    private String userId;
    private String name;
    private String ssn;
    private String email;


    private String phone;
    private String City;
    private String State;

    private String courses = "";
    private static final int costOfCourse = 800;
    private int balance = 0;


    //Constructor
    public Student(String name, String ssn){
        iD++;
        this.name = name;  //local variable referring to string name above in the class
        this.ssn = ssn;
        setUserId();
        setEmail();
    }
    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setState(String state) {
        State = state;
    }
    private void setEmail() {
        email = name.toLowerCase() + "." + iD + "@duck.com";
        System.out.println("Your email is: " + email);
    }

    public String getEmail() {
        return email;
    }

    private void setUserId() {
        int max = 9000;
        int min = 1000;
        int randNum = (int) (Math.random() * (max - min));
        randNum = randNum + min;
        // System.out.println(randNum);
        userId = iD + "" + randNum + ssn.substring(5);
        System.out.println("Your UserID is: " + userId);
    }
    public void enroll(String course) {
        this.courses = this.courses + " " + course + ",";
        //System.out.println(courses);
        balance = balance + costOfCourse;

    }
    public void payTuition(int amount) {
        System.out.println("Payment: " + amount);
        balance = balance - amount;

    }
    public void checkBalance() {
        System.out.println("Balance: $" + balance);

    }
    public void showCourses() {
        System.out.println(courses);

    }
    public String toString() {
        return "[Name: " + name + "]\n[Courses: " + courses + " ]\nBalance: " + balance + " ]";
    }
}
