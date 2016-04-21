import java.util.HashMap;

public class bank {

    private String name;
    HashMap<Integer, client> idClients = new HashMap<Integer, client>();

    public void addclient(client klient){
    	idClients.put(klient.getId(), klient);
    }
}