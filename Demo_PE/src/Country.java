
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Country extends UnicastRemoteObject implements Menu {

	public Country() throws RemoteException {

	}

	@Override
	public HashMap<String, List<String>> getExportData(String continent) throws RemoteException {
           
		Connection cn=MyConnection.makeConnection();
		HashMap<String, List<String>> hash = new HashMap<>();
		if (cn != null) {
			try {
				String sql = "select c.countryName, Name\n" +
							 "from Countries c, Items i, Export e\n" +
							 "where belongTo like ? and c.countryName=e.countryName and i.Name=e.ItemName";
				PreparedStatement pst = cn.prepareStatement(sql);
//				pst.setString(1, continent);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					String key = rs.getString("countryName");
					String value = rs.getString("Name");

					System.out.println(key);
					System.out.println(value);

					if (hash.containsKey(key)) {
						List<String> list = hash.get(key);
                                                System.out.println(list);
						list.add(value);
						hash.put(key, list);
					} else {
						List<String> list = new ArrayList<>();
						list.add(value);
						hash.put(key, list);
					}
				}
				cn.close();
			} catch (SQLException ex) {
				Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		return hash;
	}

	public static void main(String[] args) {
		try {
			Country obj = new Country();
			LocateRegistry.createRegistry(8888);
			Runtime r = Runtime.getRuntime();
			r.exec("rmiregistry.exe");
			Naming.rebind("rmi://localhost:8888/now", obj);
			System.out.println("SEVER READY");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
