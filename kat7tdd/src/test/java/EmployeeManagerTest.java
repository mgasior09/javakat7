import com.klb.empservice.Employee;
import com.klb.empservice.EmployeeManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * To jest klasa testu jestow jednostkowych
 *
 * Zasada:
 * - dla kazdej metody (publicznej) z klasy com.klb.empservice.EmployeeManager
 *   piszemy metode testowa
 */
public class EmployeeManagerTest {

    @Test   //informacja ze jest to metoda testujaca
    public void testAddEmployee() {
        //dodajemy dwoch pracownikow
        //sprawdzamile jest pracownikow w managerze
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(1L, "Kasia", 2000000);
        employeeManager.addEmployee(2L, "Asia", 2000);

        //zaliczamy ten przypadek testowy gdy liczba pracownikow == 2
        assertEquals(2, employeeManager.empsNumber());

        //dodac pracownika o id ktory juz istnieje w managerze
        //sprawdzamile jest pracownikow w managerze
        employeeManager.addEmployee(2L, "Asia", 2000);
        assertEquals(2, employeeManager.empsNumber());

    }

   // @Ignore
    @Test
    public void testIncreaseSalary() {
     //   fail();  //to zostanie zawsze niezaliczone
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(1L, "Kasia", 2000000);
        employeeManager.addEmployee(2L, "Asia", 2000);
        boolean result = employeeManager.increaseSalary(2L, 1000);
        assertTrue(result);   //zalicamy test gdy metoda ssertTrue otrzyma true
        Employee employee = employeeManager.getEmp(2L);
        assertEquals(3000.0, employee.getSalary(), 0);


    }
}











