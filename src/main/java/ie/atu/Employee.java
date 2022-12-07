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
            throw new IllegalArgumentException("Name must be at least 5 characters");
        }
    }

    public void setNumber(String number) {
        if(number.length() == 12){this.number = number;}
        else {
            throw new IllegalArgumentException("Number must be exactly 12 numbers long");
        }

    }

    public String getName() {
        return name;
    }
}
