package ie.atu;

public class Employee {
    private String name;
    private String number;

    public Employee(String name, String number){
        setName(name);
        setNumber(number);
    }

    public void setName(String name) {
        if(name.length() >= 5){this.name = name;}
        else{
            throw new IllegalArgumentException("Name must be aat least 5 character");
        }
    }

    public void setNumber(String number) {
        if(number.length() == 12){this.number = number;}
        else {
            throw new IllegalArgumentException("Name must be aat least 5 character");
        }

    }
}
