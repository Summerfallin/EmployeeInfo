package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 16003749 on 16/7/2018.
 */

public class EmployeeItem {
    private  String empName;
    private String empDesc;
    private float empSalary;

    public EmployeeItem(String empName,String empDesc, float empSalary){
        this.empDesc = empDesc;
        this.empName = empName;
        this.empSalary=empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesc() {
        return empDesc;
    }

    public void setEmpDesc(String empDesc) {
        this.empDesc = empDesc;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "CustomAdapter{" +
                "empName='" + empName + '\'' +
                ", empDesc='" + empDesc + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
