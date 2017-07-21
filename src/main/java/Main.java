import java.util.List;

import com.poecpoec.agence.dao.AeroportDao;
import com.poecpoec.agence.dao.ClientDao;
import com.poecpoec.agence.model.Aeroport;
import com.poecpoec.agence.model.Client;

public class Main
{

    public static void main(String[] args)
    {
        // TU#1.1 et 1.2 Tests Unitaires Bean Client

        ClientDao clientDao = new ClientDao();
        System.out.println("---- TU#1.1 ----");
        Client client = clientDao.findById(1);
        System.out.println(client);
        System.out.println("----------------");
        System.out.println("---- TU#1.2 ----");
        List<Client> listeClients = clientDao.findAll();
        System.out.println(listeClients);
        System.out.println("----------------");

        // TU#2.1 et 2.2 Tests Unitaires de la Dao aéroport
        AeroportDao aeroportDao = new AeroportDao();
        System.out.println("---- TU#2.1 ----");
        Aeroport aeroport = aeroportDao.findById(2);
        System.out.println(aeroport);
        System.out.println("----------------");
        System.out.println("---- TU#2.2 ----");
        List<Aeroport> aeroports = aeroportDao.findAll();
        System.out.println(aeroports);
        System.out.println("----------------");
    }

}
