import java.util.List;

import com.poecpoec.agence.dao.ClientDao;
import com.poecpoec.agence.model.Client;

public class Main
{

    public static void main(String[] args)
    {
        // TU#1.1 et 1.2 Tests Unitaires Bean Client
        System.out.println("---- TU#1.1 ----");
        ClientDao clientDao = new ClientDao();
        Client client = clientDao.findById(1);
        System.out.println(client);
        System.out.println("----------------");
        System.out.println("---- TU#1.2 ----");
        List<Client> listeClients = clientDao.findAll();
        System.out.println(listeClients);
        System.out.println("----------------");
    }

}
