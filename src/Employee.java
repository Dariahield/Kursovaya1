public class Employee {
    private String name;
   private int department;
    private float salary;

    private static int counter = 1;
    private int id;

    public Employee(String N, int D, float S) {
        name = N;
        department = D;
        salary = S;
        id = counter++;
    }
    public String getName () {

        return name;
    }

    public int getDepartment () {
        return department;
    }
    public float getSalary () {
        return salary;
    }

    public int getIdd () {
        return id;
    }


     public void setDepartment ( int D) {
        this.department = D;
     }
     public void setSalary ( float S) {

        this.salary = S;
     }

    @Override
    public String toString() {
        return " Id " + this.id + " name " + name + " department " + department + " salary " + salary;
    }
}
