package employeeApp;

public class Main
{
    private static void workWithData()
    {
        Healthplan h1 = new Healthplan("My Health 1");
        Healthplan h2 = new Healthplan("My Health 2");

        Company c1 = new Company("Company A", 100);
        Company c2 = new Company("Company B", 100);

        Employee emp1 = new Employee("Steve", "Green", 45000, Boolean.TRUE, c1.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 80000, Boolean.TRUE, c1.id, h2.getId());
        Employee emp3 = new Employee("Doug", "Jones", 75000, Boolean.TRUE, c2.id, h2.getId());
        Employee emp4 = new Employee("John", "Jones", 80000, Boolean.FALSE, c2.id, h1.getId());
        Employee emp5 = new Employee("My", "Name", 45000, Boolean.TRUE, c2.id, h2.getId());


    // start with practice here
    // First practice round
        System.out.println("*** Query Data");

        System.out.println(c1);
        System.out.println();
        System.out.println(emp1);

        emp1.setSalary(emp1.getSalary() + (emp1.getSalary() * 0.03));
        System.out.println(emp1.getSalary());
    }

    public static void main(String[] args)
    {
        //start
        workWithData();
    }
}