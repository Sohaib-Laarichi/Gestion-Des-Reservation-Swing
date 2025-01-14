package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.IDAO;
import connexion.Connexion;
import entities.Client;

public class ClientService implements IDAO<Client> {

    @Override
    public boolean create(Client o) {
        String req = "INSERT INTO Client VALUES (null, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPrenom());
            ps.setString(3, o.getEmail());
            ps.setString(4, o.getTelephone());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de l'insertion du client", e);
        }
    }

    @Override
    public boolean delete(Client o) {
        String req = "DELETE FROM Client WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la suppression du client", e);
        }
    }

    @Override
    public boolean update(Client o) {
        String req = "UPDATE client SET nom = ?, prenom = ?, email = ?, telephone = ? WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPrenom());
            ps.setString(3, o.getEmail());
            ps.setString(4, o.getTelephone());
            ps.setInt(5, o.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la mise à jour du client", e);
        }
    }

    @Override
    public Client findById(int id) {
        String req = "SELECT * FROM Client WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Client(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("email"),
                    rs.getString("telephone")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la recherche du client", e);
        }
        return null;
    }

    @Override
    public List<Client> findAll() {
        String req = "SELECT * FROM Client";
        List<Client> clients = new ArrayList<>();
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                clients.add(new Client(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("email"),
                    rs.getString("telephone")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erreur lors de la récupération des clients", e);
        }
        return clients;
    }
}