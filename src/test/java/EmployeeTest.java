import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void canRaiseSalary(){
        employee = new Manager("Bob", "AB558685685", 50000, "Accounts");
        assertEquals(50100, employee.raiseSalary(100), 0.1);
    }

    @Test
    public void canPayBonus(){
        employee = new Manager("Bob", "AB558685685", 50000, "Accounts");
        assertEquals(500, employee.payBonus(), 0.1);
    }
}
