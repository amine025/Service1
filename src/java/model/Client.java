package model;

public class Client {

    String firstName;
    String lastName;
    int birthDay;
    String username;
    String machineName;
    String timeStamp;

    public Client(String firstName, String lastName, int birthDay, String username, String machineName, String timeStamp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.username = username;
        this.machineName = machineName;
        this.timeStamp = timeStamp;
    }

    public Client() {

    }

    public Client(String firstName, String lastName, int birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getUsername() {
        return username;
    }

    public String getMachineName() {
        return machineName;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
