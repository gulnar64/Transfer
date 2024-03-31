package entities;

public class Employer extends User {
    private String profession;
    private double salary;

    public Employer(int id, String name) {
        super(id, name);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "profession='" + profession + '\'' +
                ", salary=" + salary +
                '}';
    }
}
