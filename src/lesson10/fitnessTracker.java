package lesson10;

public class fitnessTracker {
    private final String name;
    private String surname;
    private final int birthDay;
    private final int monthBirth;
    private final int yearBirth;
    private final String email;
    private final String phone;
    private String pressure;
    private int weight;
    private long steps;

    public fitnessTracker(String name, String surname, int birthday, int monthBirth, int yearBirth,
                          String email, String phone, String pressure, int weight, long steps) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthday;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.email = email;
        this.phone = phone;
        this.pressure = pressure;
        this.weight = weight;
        this.steps = steps;
    }

    //age restriction
    public String getAge(int year) {
        int age = year - yearBirth;
        String strAge = Integer.toString(age);
        if (age < 18) {
            return "You are not yet 18 years old";
        }
        return strAge;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSteps(long steps) {
        this.steps = steps;
    }





    public void printAccountInfo() {
        System.out.println(name + " " + surname +  ": E-mail:" + email + ". " + "Phone: " + phone  + "." + "Date of Birth " + birthDay + "." + monthBirth + "."+
                yearBirth  +" age of the user: " + getAge(2020) +" years old "  + " Pressure:" + pressure + ". " + "Weight:" +
                weight + "кг. " + "Number of steps per day:" + steps);
    }
}
