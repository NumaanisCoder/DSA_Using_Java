public class t2 {
    public static void main(String[] args) {
        Student s1 = new Student("Shavezz Ghodi", "Sambhal",25521212,21,"Others");
        s1.setCourse("Btech CSE");
        s1.getDetails();

        s1.getSensitiveDetails();

    }
}

class Student extends Person{
Student(String name,String address, long adhaarCard, int age, String gender){
    super(adhaarCard,age,gender);
    this.name = name;
    this.address = address;
}
String name;
String address;
long phoneNumber;
String course;

void setCourse(String Course){
    this.course = Course;
}

public void getDetails(){
    System.out.println(name + " From "+ address + " Doing "+course);
}

}
class Person
{
    Person(long adhaarCard, int age, String gender){
        this.adhaarCard = adhaarCard;
        this.age = age;
        this.gender = gender;
    }
    long adhaarCard;
    int age;
    String gender;

    void getSensitiveDetails(){
        System.out.println("AdhaarCard :"+adhaarCard+"\n"+"Age : "+age+"\nGender : "+gender);
    }
}