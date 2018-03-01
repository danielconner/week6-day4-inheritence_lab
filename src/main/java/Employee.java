public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public  Employee(String name, String niNumber, int salary){
        this.name =  name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public double raiseSalary(double raise){
            double newSalary = this.salary * raise;
            if(newSalary < 0 ){
                return 0;
        }
            return newSalary;
    }

    public int payBonus(){
        int bonus = this.salary / 100;
        return bonus;
    }
}