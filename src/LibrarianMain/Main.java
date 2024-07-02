
package LibrarianMain;
import view.EmployeeView;
import Controler.EmployeeController;
import Moled.EmployeeModel;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<EmployeeModel> employee = new ArrayList<>();
    EmployeeController Controler = new EmployeeController();
    EmployeeView menu = new EmployeeView(Controler, scanner);
    menu.choice(scanner, employee, 0);
    }
    
}
