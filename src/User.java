
public class User {

    private  String nickName;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String yourMale;
    private String whereareyoufrom;

    public  User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", yourMale='" + yourMale + '\'' +
                ", whereareyoufrom='" + whereareyoufrom + '\'' +
                '}';
    }

    public String getNickName() { return nickName; }

    public void setNickName(String nickname) {this.nickName = nickname;}

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstname) {this.firstName = firstName;}

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getYourMale() {return yourMale;}

    public void setWhereareyoufrom(String whereareyoufrom) {this.whereareyoufrom = whereareyoufrom;}

    public String getWhereareyoufrom() {return  whereareyoufrom;}


    public void setYourMale(String yourMale) {this.yourMale = yourMale;}

    public int getBirthYear() { return birthYear; }

    public void setBirthYear(int birthYear) {this.birthYear = birthYear; }






    }




