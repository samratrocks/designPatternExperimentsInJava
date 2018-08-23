
/**
 * Abstract class Subject - provides the structure for the Subject class
 * 
 * @author Sam
 * 
 */
public abstract class Subject
{
    public abstract void Attach(Observer observer);
    
    public abstract void Detach(Observer observer);
    
    public abstract void Notify();

}
