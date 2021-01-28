import java.util.ArrayList;
class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
          int ta = salary + incentive;
         return ta;
        
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        int ta = salary + overtime;
        return ta;
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
        int s = salary;
        return s;
      
        
    }
    
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int ta=0;
        int size = employeeSalaries.size();
        for(int i=0; i<size ; i++)
        {
            ta= ta + employeeSalaries.get(i);
        }
        return ta;
    }
    public static void main(String[] args) {}
}