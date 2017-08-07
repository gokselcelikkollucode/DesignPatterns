package structural.composite;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestComposite
{
    private Employee CEO;

    @Before
    public void setUp()
    {
        CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Sarah", "Sales", 10000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);
    }

    @Test
    public void testComposite()
    {
        assertThat(CEO.toString()).isEqualTo("Employee: [name: " + CEO.getName() + ", dept: " + CEO.getDept() + ", salary: " + CEO.getSalary() + "]");
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates())
        {
            assertThat(headEmployee.toString()).isEqualTo("Employee: [name: " + headEmployee.getName() + ", dept: " + headEmployee.getDept() + ", salary: " + headEmployee.getSalary() + "]");
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates())
            {
                assertThat(employee.toString()).isEqualTo("Employee: [name: " + employee.getName() + ", dept: " + employee.getDept() + ", salary: " + employee.getSalary() + "]");
                System.out.println(employee);
            }
        }
    }
}
