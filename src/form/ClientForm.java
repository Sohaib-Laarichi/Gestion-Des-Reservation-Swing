/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package form;

import entities.Client;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.ClientService;

/**
 *
 * @author Dark
 */
public class ClientForm extends javax.swing.JInternalFrame {
     ClientService cs ;
    private DefaultTableModel model ;
    public static int id ;
    /**
     * Creates new form Client
     */
    public ClientForm() {
        initComponents();
       
        model=(DefaultTableModel) listeclient.getModel();
        cs = new ClientService();
        load();
    }
    
    public void load (){
        model.setRowCount(0);
        for (Client c : cs.findAll()){
            model.addRow(new Object[]{
                c.getId(),
                c.getNom(),
                c.getPrenom(),
                c.getEmail(),
                c.getTelephone(),
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomtxt = new javax.swing.JTextField();
        prenomtxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        teletxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addclient = new javax.swing.JButton();
        deleteclient = new javax.swing.JButton();
        updateclient = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rechercheClient = new javax.swing.JTextField();
        RechercheBtnClient = new javax.swing.JButton();
        AnulerLaRecherche = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeclient = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Gestion Clinet ");

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(153, 255, 153));

        jLabel1.setText("Nom :");

        jLabel2.setText("Prenom :");

        jLabel3.setText("Email :");

        jLabel4.setText("Telephone :");

        prenomtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomtxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Clinet gestion ");

        addclient.setBackground(new java.awt.Color(158, 140, 35));
        addclient.setText("Ajouter");
        addclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclientActionPerformed(evt);
            }
        });

        deleteclient.setBackground(new java.awt.Color(176, 165, 42));
        deleteclient.setText("Supprimer");
        deleteclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteclientActionPerformed(evt);
            }
        });

        updateclient.setBackground(new java.awt.Color(197, 164, 60));
        updateclient.setText("Modifier");
        updateclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateclientActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(158, 140, 35));
        jButton1.setText("Vider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Rechercher :");

        rechercheClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheClientActionPerformed(evt);
            }
        });

        RechercheBtnClient.setBackground(new java.awt.Color(176, 165, 42));
        RechercheBtnClient.setText("Rechercher");
        RechercheBtnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheBtnClientActionPerformed(evt);
            }
        });

        AnulerLaRecherche.setBackground(new java.awt.Color(176, 165, 42));
        AnulerLaRecherche.setText("Annuler");
        AnulerLaRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnulerLaRechercheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel7)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(prenomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(updateclient, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addclient, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deleteclient)))
                                    .addComponent(teletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rechercheClient, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(RechercheBtnClient)
                                .addGap(18, 18, 18)
                                .addComponent(AnulerLaRecherche)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prenomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(addclient))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(updateclient))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(teletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteclient))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rechercheClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RechercheBtnClient)
                    .addComponent(AnulerLaRecherche))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(151, 69, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LIste Des clients ");

        listeclient.setBackground(new java.awt.Color(231, 215, 150));
        listeclient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nom", "Prenom", "Email", "Telephone"
            }
        ));
        listeclient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeclientMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listeclient);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Gestion Client ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclientActionPerformed
     // Vérification des champs vides
    if (nomtxt.getText().isEmpty() || prenomtxt.getText().isEmpty() || emailtxt.getText().isEmpty() || teletxt.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs !");
        return;
    }

    // Validation de l'email
    String email = emailtxt.getText();
    String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    if (!email.matches(emailPattern)) {
        JOptionPane.showMessageDialog(this, "Veuillez entrer une adresse email valide !");
        return;
    }

    // Validation du numéro de téléphone
    String telephone = teletxt.getText();
    String telephonePattern = "^\\d{10}$"; // Exemple : pour des numéros à 10 chiffres
    if (!telephone.matches(telephonePattern)) {
        JOptionPane.showMessageDialog(this, "Veuillez entrer un numéro de téléphone valide (10 chiffres) !");
        return;
    }

    // Création du client
    Client client = new Client(nomtxt.getText(), prenomtxt.getText(), email, telephone);

    try {
        if (cs.create(client)) {
            JOptionPane.showMessageDialog(this, "Client ajouté avec succès");
            load(); // Recharge la table avec les nouveaux clients

            // Nettoyage des champs après ajout
            nomtxt.setText("");
            prenomtxt.setText("");
            emailtxt.setText("");
            teletxt.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Échec de l'ajout du client");
        }
    } catch (HeadlessException e) {
        JOptionPane.showMessageDialog(this, "Une erreur s'est produite lors de l'ajout : " + e.getMessage());
    }
    }//GEN-LAST:event_addclientActionPerformed

    private void deleteclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteclientActionPerformed
        int reponse=JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer ce client");
        if(reponse==0){
            if(cs.delete(cs.findById(id))){
                JOptionPane.showMessageDialog(this, "Client bien supprimé");
                load();
            }
        }
    }//GEN-LAST:event_deleteclientActionPerformed

    private void updateclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateclientActionPerformed
         String nom=nomtxt.getText();
            String prenom=prenomtxt.getText();
            String tel=teletxt.getText();
            String mail=emailtxt.getText();
            Client cl=cs.findById(id);
            cl.setNom(nom);
            cl.setPrenom(prenom);
            cl.setTelephone(tel);
            cl.setEmail(mail);
            int rep=JOptionPane.showConfirmDialog(this, "Voulez vous vraiment modifier ce client");
                   if(rep==0){
                       
                       if(cs.update(cl)){
                         
                           JOptionPane.showMessageDialog(this, "Client bien modifié");
                           load();
                       }
                   }
    }//GEN-LAST:event_updateclientActionPerformed

    private void listeclientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeclientMouseClicked
       id=Integer.parseInt(model.getValueAt(listeclient.getSelectedRow(), 0).toString());
       nomtxt.setText((String) model.getValueAt(listeclient.getSelectedRow(), 1));
       prenomtxt.setText((String) model.getValueAt(listeclient.getSelectedRow(), 2));
      
       emailtxt.setText((String) model.getValueAt(listeclient.getSelectedRow(), 3));
        teletxt.setText((String) model.getValueAt(listeclient.getSelectedRow(), 4));
    }//GEN-LAST:event_listeclientMouseClicked

    private void prenomtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomtxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // Vider les champs du formulaire
    nomtxt.setText("");
    prenomtxt.setText("");
    emailtxt.setText("");
    teletxt.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RechercheBtnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheBtnClientActionPerformed
       // Récupérer l'ID saisi dans le champ de recherche
    String idText = rechercheClient.getText().trim();

    // Vérifier si le champ est vide
    if (idText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Veuillez entrer un ID pour rechercher un client.", "Erreur", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Convertir l'ID en entier
        int id = Integer.parseInt(idText);

        // Rechercher le client par ID
        ClientService clientService = new ClientService();
        Client client = clientService.findById(id);

        // Vérifier si le client existe
        if (client == null) {
            JOptionPane.showMessageDialog(this, "Aucun client trouvé avec l'ID : " + id, "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Afficher les détails du client dans le tableau
        DefaultTableModel model = (DefaultTableModel) listeclient.getModel();
        model.setRowCount(0); // Vider le tableau
        model.addRow(new Object[]{
            client.getId(),
            client.getNom(),
            client.getPrenom(),
            client.getEmail(),
            client.getTelephone()
        });

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "L'ID doit être un nombre entier.", "Erreur", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erreur lors de la recherche du client : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_RechercheBtnClientActionPerformed

    private void rechercheClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheClientActionPerformed
        // Appeler la méthode de recherche lorsque l'utilisateur appuie sur "Entrée"
    RechercheBtnClientActionPerformed(evt);
    }//GEN-LAST:event_rechercheClientActionPerformed

    private void AnulerLaRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnulerLaRechercheActionPerformed
        // TODO add your handling code here:
         rechercheClient.setText("");

    // Recharger tous les clients dans le tableau
    load();
    }//GEN-LAST:event_AnulerLaRechercheActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnulerLaRecherche;
    private javax.swing.JButton RechercheBtnClient;
    private javax.swing.JButton addclient;
    private javax.swing.JButton deleteclient;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable listeclient;
    private javax.swing.JTextField nomtxt;
    private javax.swing.JTextField prenomtxt;
    private javax.swing.JTextField rechercheClient;
    private javax.swing.JTextField teletxt;
    private javax.swing.JButton updateclient;
    // End of variables declaration//GEN-END:variables
}
