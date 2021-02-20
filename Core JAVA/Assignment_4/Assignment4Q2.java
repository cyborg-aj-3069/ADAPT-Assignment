import java.util.ArrayList;
import java.util.Objects;

public class Assignment4Q2 {

    @Override
	public int hashCode() {
		return Objects.hash(status, total);
	}

	private int total;
    private String status;
    
    public Assignment4Q2(int total, String status) {
		this.total = total;
		this.status = status;
	}
    
	public int getTotalPrice() {
		return total;
	}
	public void setTotalPrice(int total) {
		this.total = total;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static ArrayList<Assignment4Q2> tList = new ArrayList<>();
	
	public static Order tListShow = () -> System.out.println(tList);

	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
		for(Assignment4Q2 a : orders) {
    		if(a.getTotalPrice() > 10000 && a.getStatus().matches("ACCEPTED") || a.getTotalPrice() > 10000 && a.getStatus().matches("COMPLETED")) {
    			tList.add(a);
    		}
    	}
    	return tList;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assignment4Q2 other = (Assignment4Q2) obj;
		return Objects.equals(status, other.status) && total == other.total;
	}
	
    public static void main(String[] args) {
    	
    	 Assignment4Q2 assign1 = new Assignment4Q2(10029, "ACCEPTED");
    	 Assignment4Q2 assign2 = new Assignment4Q2(9020, "COMPLETED");
    	 
    	 
    	 ArrayList<Assignment4Q2> mList = new ArrayList<>();
    	 mList.add(assign1);
    	 mList.add(assign2); 
    	
    	 
    	 listOfOrders(mList);
    	 tListShow.foo();
    	 
    }
}

interface Order{
	void foo();
}