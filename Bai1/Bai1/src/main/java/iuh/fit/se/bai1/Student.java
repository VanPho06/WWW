package iuh.fit.se.bai1;

import java.util.Date;

public class Student {
    private String FirstName;
    private String LastName;
    private String birthday;
    private String Email;
    private String MobileNumber;
    private String Gender;
    private String Address;
    private String City;
    private String PinCode;
    private String State;
    private String Country;
    private String Hobbies;
    private String Course;

    public Student() {
    }

    public Student(String firstName, String lastName, String birthday, String email, String mobileNumber, String gender, String address, String city, String pinCode, String state, String country, String hobbies, String course) {
        FirstName = firstName;
        LastName = lastName;
        this.birthday = birthday;
        Email = email;
        MobileNumber = mobileNumber;
        Gender = gender;
        Address = address;
        City = city;
        PinCode = pinCode;
        State = state;
        Country = country;
        Hobbies = hobbies;
        Course = course;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPinCode() {
        return PinCode;
    }

    public void setPinCode(String pinCode) {
        PinCode = pinCode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getHobbies() {
        return Hobbies;
    }

    public void setHobbies(String hobbies) {
        Hobbies = hobbies;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }
}
