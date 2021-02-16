import java.util.HashMap;
import java.util.Map;

class DateClass {
    private int date;
    private int month;
    private int year;

    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString() {
        return "DateClass{" + "date=" + date + ", month=" + month + ", year=" + year +'}';
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> dob, String employeeName){
        for(Map.Entry e: dob.entrySet()){
            if(e.getValue() == employeeName){

            }
            System.out.println("Key :"+e.getKey().toString() + " Value "+ e.getValue() );
        }
    return "Null";
    }
    public static void main(String[] args) {
        Assignment3Q4 obj = new Assignment3Q4();


        DateClass dob = new DateClass(17,04,1998);
        DateClass dob1 = new DateClass(19,05,1999);
        DateClass dob2 = new DateClass(09,05,1994);
        
        HashMap<DateClass, String> map = new HashMap<>();
        map.put(dob, "Abhi1");
        map.put(dob1, "Abhi1");
        map.put(dob2, "Abhi2");
      
        System.out.println(obj.getEmployee(map, "Abhi1"));


    }
}