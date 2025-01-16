package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import DAO.IDAO;
import connexion.Connexion;
import entities.Categorie;

public class CategorieService implements IDAO<Categorie> {

    @Override
    public boolean create(Categorie o) {
        String req = "INSERT INTO Categorie VALUES (null, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getLibelle());
            ps.setString(2, o.getCode());
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Catégorie ajoutée avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout de la catégorie", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    @Override
    public boolean delete(Categorie o) {
        String req = "DELETE FROM Categorie WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, o.getId());
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Catégorie supprimée avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la suppression de la catégorie", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    @Override
    public boolean update(Categorie o) {
        String req = "UPDATE Categorie SET libelle = ?, code = ? WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getLibelle());
            ps.setString(2, o.getCode());
            ps.setInt(3, o.getId());
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Catégorie modifiée avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la modification de la catégorie", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    @Override
    public List<Categorie> findAll() {
        String req = "SELECT * FROM Categorie";
        List<Categorie> categories = new ArrayList<>();
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                categories.add(new Categorie(
                    rs.getInt("id"),
                    rs.getString("libelle"),
                    rs.getString("code")
                ));
            }
            JOptionPane.showMessageDialog(null, "Liste des catégories récupérée avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la récupération de la liste des catégories", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return categories;
    }

    @Override
    public Categorie findById(int id) {
        String req = "SELECT * FROM Categorie WHERE id = ?";
        try {
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Categorie categorie = new Categorie(
                    rs.getString("libelle"),
                    rs.getString("code")
                );
                JOptionPane.showMessageDialog(null, "Catégorie trouvée :\nID: " + id + "\nLibelle: " + categorie.getLibelle() + "\nCode: " + categorie.getCode(), "Succès", JOptionPane.INFORMATION_MESSAGE);
                return categorie;
            } else {
                JOptionPane.showMessageDialog(null, "Aucune catégorie trouvée avec l'ID: " + id, "Information", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la recherche de la catégorie", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    public int findIdByLibelle(String libelle) {
    String req = "SELECT id FROM Categorie WHERE libelle = ?";
    try {
        PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
        ps.setString(1, libelle);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt("id"); // Retourne l'ID de la catégorie
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur lors de la récupération de l'ID de la catégorie", "Erreur", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    return -1; // Retourne -1 si la catégorie n'est pas trouvée
}
}