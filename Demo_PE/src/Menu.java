import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;

public interface Menu extends Remote{
	
	public  HashMap<String, List<String>> getExportData(String continent) throws RemoteException;
}
