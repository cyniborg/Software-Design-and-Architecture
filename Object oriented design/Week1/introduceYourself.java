public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender ;
    private String countryOfResidence;
    private String nationality;
    private String profession;

    public Person(String firstName, String lastName, int age, String gender, String countryOfResidence, String nationality, String profession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.countryOfResidence = countryOfResidence;
        this.nationality = nationality;
        this.profession = profession;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }
    public void setCountryOfResidence (String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public int getAge() {
        return age;
    }
    public void setAge (int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender (String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality (String nationality) {
        this.nationality = nationality;
    }

    public String getProfession() {
        return profession;
    }
    public void setProfession (String profession) {
        this.profession = profession;
    }
    public String getName() {
        return firstName + " " + lastName;
    }

    public String getBio() {
        return "Hi! My name is " + this.getName() + ". I am a " + this.getAge() + " year old " + this.getGender() + " living in " + this.getCountryOfResidence() + ". I work as a " + this.getProfession() + "here. My nationality is " + this.getNationality();
    }

    public static void main (String[] args) {
        Person robin = new Person("Robin", "John", 35, "male", "Belgium", "Indian", "Developer");
        System.out.println(robin.getBio());
    }
}