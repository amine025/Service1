package model;

public class Client {

    int birthDay;
    String username;
    String machineName;
    String timeStamp;

    public Client(int birthDay, String username, String machineName, String timeStamp) {

        this.birthDay = birthDay;
        this.username = username;
        this.machineName = machineName;
        this.timeStamp = timeStamp;
    }

    public Client() {

    }

    public Client(int birthDay) {
        this.birthDay = birthDay;
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
