package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeItem> alEmployeeList;
    CustomAdapter caEmployee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvEmployee = findViewById(R.id.listViewEmployee);
        alEmployeeList = new ArrayList<>();
        EmployeeItem emp1 = new EmployeeItem("John","Software Technical Leader",3400.0f);
        EmployeeItem emp2 = new EmployeeItem("May","Programmer",2200.0f);
        EmployeeItem emp3 = new EmployeeItem("qqq","Programmer",2200.0f);
        EmployeeItem emp4 = new EmployeeItem("Maaay","Programmer",2200.0f);
        EmployeeItem emp5 = new EmployeeItem("Madasdy","Programmer",2200.0f);
        EmployeeItem emp6 = new EmployeeItem("Mafasfy","Programmer",2200.0f);
        EmployeeItem emp7 = new EmployeeItem("qeqwe","Programmer",2200.0f);
        EmployeeItem emp8 = new EmployeeItem("awesg","Programmer",2200.0f);
        EmployeeItem emp9 = new EmployeeItem("asfgv","Programmer",2200.0f);
        EmployeeItem emp10 = new EmployeeItem("asfqtr","Programmer",2200.0f);
        EmployeeItem emp11= new EmployeeItem("asftew","Programmer",2200.0f);
        EmployeeItem emp12= new EmployeeItem("wqrqwr","Programmer",2200.0f);
        EmployeeItem emp13= new EmployeeItem("urthfg","Programmer",2200.0f);
        EmployeeItem emp14= new EmployeeItem("cvbgdrg","Programmer",2200.0f);
        EmployeeItem emp15= new EmployeeItem("ertww","Programmer",2200.0f);


        alEmployeeList.add(emp1);
        alEmployeeList.add(emp2);
        alEmployeeList.add(emp3);
        alEmployeeList.add(emp4);
        alEmployeeList.add(emp5);
        alEmployeeList.add(emp6);
        alEmployeeList.add(emp7);
        alEmployeeList.add(emp8);
        alEmployeeList.add(emp9);
        alEmployeeList.add(emp10);
        alEmployeeList.add(emp11);
        alEmployeeList.add(emp12);
        alEmployeeList.add(emp13);
        alEmployeeList.add(emp14);
        alEmployeeList.add(emp15);




        caEmployee = new CustomAdapter(this,R.layout.employee_item,alEmployeeList);
        lvEmployee.setAdapter(caEmployee);

    }
}
