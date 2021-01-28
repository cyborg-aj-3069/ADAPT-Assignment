abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
       String P= "File Persistance invokes persist Method";
         return P;
        }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        String P= "Database Persistance invokes persist Method";
         return P; 
        
    }
}
class Client extends Persistence{
    @Override
    public String persist() {
        
        String P= "Client gains Persistance and invokes persist Method";
         return P; 
        
    }

}
public class Assignment2Q6 {
    public static void main(String[] args) {}
}