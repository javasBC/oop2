public class Employee {

    //DATA
    public String name;
    private double salary;

    public Employee(){}
    public Employee(Employee e){
        this.name=e.name;
        Employee err=new Employee();
        this.salary=e.getSalary();
    }
    public Employee(String name, double salary) {
        this.name = name;
        this.setSalary(salary);
    }

    //Getter
    public double getSalary(){
        return this.salary*0.87 ;
    }

    //Setter
    public void setSalary(double salary){
        if (salary<5000)
            this.salary=-1;
        else
            this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + this.getSalary() +
                '}';
    }
}
