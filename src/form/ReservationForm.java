/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package form;
import entities.Chambre;
import entities.Client;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.ChamberService;
import service.ClientService;
import entities.Reservation;
import java.awt.Dimension;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import service.ReservationService;



import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Dark
 */
public class ReservationForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReservationForm
     */
    public ReservationForm() {
        initComponents();
        fillComboboxes();
        refreshChambreCombo();
        loadReservations();
    }
    private void fillComboboxes() {
    // Remplir le combobox des clients
    ClientService clientService = new ClientService();
    List<String> clients = clientService.findAllClientsForCombobox();
    for (String client : clients) {
        Clinetcombo.addItem(client);
    }

    // Remplir le combobox des chambres disponibles
    ChamberService chamberService = new ChamberService();
    List<String> chambres = chamberService.findAllAvailableChambresForCombobox(); // Utiliser la nouvelle méthode
    for (String chambre : chambres) {
        Chambercombo.addItem(chambre);
    }
}
   private void refreshChambreCombo() {
    Chambercombo.removeAllItems(); // Vider le combobox
    ChamberService chamberService = new ChamberService();
    List<String> chambres = chamberService.findAllAvailableChambresForCombobox(); // Récupérer les chambres disponibles

    // Vérifier si la liste des chambres est vide
    if (chambres.isEmpty()) {
        System.out.println("Aucune chambre disponible.");
        return;
    }

    // Remplir le combobox avec les chambres disponibles
    for (String chambre : chambres) {
        Chambercombo.addItem(chambre);
    }
}
   
    private void loadReservations() {
        ReservationService rs = new ReservationService();
        List<Reservation> reservations = rs.findAll();
        DefaultTableModel model = (DefaultTableModel) ListReservation.getModel();
        model.setRowCount(0); // Vider le tableau
        for (Reservation r : reservations) {
            model.addRow(new Object[]{
                r.getId(),
                r.getDateDebutAsString(),
                r.getDateFinAsString(),
                r.getChambre().getId(),
                r.getClient().getId()
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Chambercombo = new javax.swing.JComboBox<>();
        Clinetcombo = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        RechercheTxt = new javax.swing.JTextField();
        RecherchetbtnReservation = new javax.swing.JButton();
        AnulerbtnRecherche = new javax.swing.JButton();
        ExportTableInfo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListReservation = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Gestion de Reservation ");
        setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 165));

        jLabel1.setText("Gestion de Reservation ");

        jLabel2.setText("dateDebut :");

        jLabel3.setText("dateFin :");

        jLabel4.setText("Chambre :");

        jLabel5.setText("Client :");

        jButton1.setBackground(new java.awt.Color(0, 143, 168));
        jButton1.setText("Ajouter");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 143, 168));
        jButton2.setText("Modifier ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 143, 168));
        jButton3.setText("Supprimer ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Chambercombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChambercomboActionPerformed(evt);
            }
        });

        Clinetcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClinetcomboActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 143, 168));
        jButton4.setText("Export Clinet info ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Rechercher :");

        RechercheTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheTxtActionPerformed(evt);
            }
        });

        RecherchetbtnReservation.setBackground(new java.awt.Color(0, 143, 168));
        RecherchetbtnReservation.setText("Rechercher ");
        RecherchetbtnReservation.setDoubleBuffered(true);
        RecherchetbtnReservation.setFocusCycleRoot(true);
        RecherchetbtnReservation.setFocusTraversalPolicyProvider(true);
        RecherchetbtnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchetbtnReservationActionPerformed(evt);
            }
        });

        AnulerbtnRecherche.setBackground(new java.awt.Color(0, 143, 168));
        AnulerbtnRecherche.setText("Annuler");
        AnulerbtnRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnulerbtnRechercheActionPerformed(evt);
            }
        });

        ExportTableInfo.setBackground(new java.awt.Color(0, 143, 168));
        ExportTableInfo.setText("Imprimer");
        ExportTableInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportTableInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(Chambercombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(Clinetcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(RechercheTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(RecherchetbtnReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnulerbtnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(ExportTableInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Chambercombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(Clinetcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExportTableInfo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RechercheTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecherchetbtnReservation)
                    .addComponent(AnulerbtnRecherche))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 67, 78));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("List des reservation ");

        ListReservation.setBackground(new java.awt.Color(255, 255, 165));
        ListReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "DateDebut", "dateFin", "Chambre", "client"
            }
        ));
        ListReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListReservationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListReservation);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // Récupérer la date de début et de fin
    Date dateDebut = jDateChooser1.getDate();
    Date dateFin = jDateChooser2.getDate();

    // Récupérer l'ID du client sélectionné
    Object selectedClient = Clinetcombo.getSelectedItem();
    if (selectedClient == null) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner un client.");
        return;
    }
    int clientId = Integer.parseInt(selectedClient.toString().split(" - ")[0]); // Extraire l'ID du client

    // Récupérer l'ID de la chambre sélectionnée
    Object selectedChambre = Chambercombo.getSelectedItem();
    if (selectedChambre == null) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner une chambre.");
        return;
    }
    int chambreId = Integer.parseInt(selectedChambre.toString().split(" - ")[0]); // Extraire l'ID de la chambre

    // Vérifier si la chambre est disponible pour la période demandée
    ReservationService rs = new ReservationService();
    if (!rs.isChambreDisponible(chambreId, dateDebut, dateFin)) {
        JOptionPane.showMessageDialog(this, "La chambre n'est pas disponible pendant cette période.");
        return;
    }

    // Créer une nouvelle réservation
    Reservation reservation = new Reservation(dateDebut, dateFin, new Chambre(chambreId), new Client(clientId));

    // Ajouter la réservation via le service
    if (rs.create(reservation)) {
        JOptionPane.showMessageDialog(this, "Réservation créée avec succès");
        loadReservations(); // Recharger la liste des réservations
    } else {
        JOptionPane.showMessageDialog(this, "Échec de la création de la réservation");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Récupérer la ligne sélectionnée dans le tableau
    int selectedRow = ListReservation.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner une réservation à modifier.");
        return;
    }

    // Récupérer l'ID de la réservation sélectionnée
    int reservationId = (int) ListReservation.getValueAt(selectedRow, 0);

    // Récupérer les nouvelles informations du formulaire
    Date dateDebut = jDateChooser1.getDate();
    Date dateFin = jDateChooser2.getDate();
    String selectedClient = Clinetcombo.getSelectedItem().toString();
    int clientId = Integer.parseInt(selectedClient.split(" - ")[0]); // Extraire l'ID du client
    String selectedChambre = Chambercombo.getSelectedItem().toString();
    int chambreId = Integer.parseInt(selectedChambre.split(" - ")[0]); // Extraire l'ID de la chambre

    // Récupérer la réservation existante
    ReservationService rs = new ReservationService();
    Reservation reservation = rs.findById(reservationId);

    if (reservation == null) {
        JOptionPane.showMessageDialog(this, "Réservation introuvable.");
        return;
    }

    // Vérifier si la chambre est disponible pour la nouvelle période
    if (!rs.isChambreDisponible(chambreId, dateDebut, dateFin) && chambreId != reservation.getChambre().getId()) {
        JOptionPane.showMessageDialog(this, "La chambre n'est pas disponible pendant cette période.");
        return;
    }

    // Mettre à jour la réservation
    reservation.setDateDebut(dateDebut);
    reservation.setDateFin(dateFin);
    reservation.setChambre(new Chambre(chambreId));
    reservation.setClient(new Client(clientId));

    if (rs.update(reservation)) {
        JOptionPane.showMessageDialog(this, "Réservation modifiée avec succès.");
        loadReservations(); // Recharger la liste des réservations
    } else {
        JOptionPane.showMessageDialog(this, "Échec de la modification de la réservation.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // Récupérer la ligne sélectionnée dans le tableau
    int selectedRow = ListReservation.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner une réservation à supprimer.");
        return;
    }

    // Récupérer l'ID de la réservation sélectionnée
    int reservationId = (int) ListReservation.getValueAt(selectedRow, 0);

    // Demander une confirmation avant de supprimer
    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Êtes-vous sûr de vouloir supprimer cette réservation ?",
        "Confirmation",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        // Supprimer la réservation via le service
        ReservationService rs = new ReservationService();
        Reservation reservation = rs.findById(reservationId);

        if (reservation != null && rs.delete(reservation)) {
            JOptionPane.showMessageDialog(this, "Réservation supprimée avec succès.");
            loadReservations(); // Recharger la liste des réservations
        } else {
            JOptionPane.showMessageDialog(this, "Échec de la suppression de la réservation.");
        }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ClinetcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClinetcomboActionPerformed
        // Récupérer l'ID du client sélectionné
   String selectedItem = Clinetcombo.getSelectedItem().toString();
    
    // Extraire l'ID du client (le premier élément avant le séparateur "-")
    int clientId = Integer.parseInt(selectedItem.split(" - ")[0]);
    
    // Vous pouvez ajouter des actions supplémentaires ici, comme afficher les détails du client
    System.out.println("Client sélectionné : " + clientId);
    }//GEN-LAST:event_ClinetcomboActionPerformed

    private void ChambercomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChambercomboActionPerformed
         // Récupérer l'élément sélectionné dans le combobox
    Object selectedItem = Chambercombo.getSelectedItem();
    
    // Vérifier si l'élément sélectionné est null
    if (selectedItem == null) {
        System.out.println("Aucune chambre sélectionnée.");
        return;
    }

    // Extraire l'ID de la chambre (le premier élément avant le séparateur "-")
    String selectedChambre = selectedItem.toString();
    int chambreId = Integer.parseInt(selectedChambre.split(" - ")[0]);
    
    // Vous pouvez ajouter des actions supplémentaires ici, comme afficher les détails de la chambre
    System.out.println("Chambre sélectionnée : " + chambreId);
    }//GEN-LAST:event_ChambercomboActionPerformed

    private void ListReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListReservationMouseClicked
     int selectedRow = ListReservation.getSelectedRow();
    
    // Vérifier si une ligne est bien sélectionnée
    if (selectedRow >= 0) {
        // Récupérer les valeurs de la ligne sélectionnée
        int reservationId = (int) ListReservation.getValueAt(selectedRow, 0);
        String dateDebut = (String) ListReservation.getValueAt(selectedRow, 1);
        String dateFin = (String) ListReservation.getValueAt(selectedRow, 2);
        int chambreId = (int) ListReservation.getValueAt(selectedRow, 3);
        int clientId = (int) ListReservation.getValueAt(selectedRow, 4);

        // Remplir les champs du formulaire
        try {
            // Convertir les dates String en Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adaptez le format à celui utilisé dans votre tableau
            jDateChooser1.setDate(dateFormat.parse(dateDebut));
            jDateChooser2.setDate(dateFormat.parse(dateFin));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Erreur lors de la conversion des dates.");
            e.printStackTrace();
        }

        // Sélectionner la chambre correspondante dans le combobox
        for (int i = 0; i < Chambercombo.getItemCount(); i++) {
            String item = Chambercombo.getItemAt(i);
            if (item.startsWith(chambreId + " - ")) { // Vérifier si l'élément correspond à l'ID de la chambre
                Chambercombo.setSelectedIndex(i);
                break;
            }
        }

        // Sélectionner le client correspondant dans le combobox
        for (int i = 0; i < Clinetcombo.getItemCount(); i++) {
            String item = Clinetcombo.getItemAt(i);
            if (item.startsWith(clientId + " - ")) { // Vérifier si l'élément correspond à l'ID du client
                Clinetcombo.setSelectedIndex(i);
                break;
            }
        }
    }
    }//GEN-LAST:event_ListReservationMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Récupérer la ligne sélectionnée dans le tableau
    int selectedRow = ListReservation.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner une réservation à exporter.");
        return;
    }

    // Récupérer l'ID de la réservation sélectionnée
    int reservationId = (int) ListReservation.getValueAt(selectedRow, 0);

    // Récupérer les détails de la réservation
    ReservationService rs = new ReservationService();
    Reservation reservation = rs.findById(reservationId);

    if (reservation == null) {
        JOptionPane.showMessageDialog(this, "Réservation introuvable.");
        return;
    }

    // Récupérer les détails du client
    ClientService clientService = new ClientService();
    Client client = clientService.findById(reservation.getClient().getId());

    if (client == null) {
        JOptionPane.showMessageDialog(this, "Client introuvable.");
        return;
    }

    // Demander à l'utilisateur où enregistrer le fichier
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Enregistrer le fichier texte");
    fileChooser.setFileFilter(new FileNameExtensionFilter("Fichiers texte (*.txt)", "txt"));
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        String filePath = fileChooser.getSelectedFile().getAbsolutePath();

        // Ajouter l'extension .txt si elle n'est pas présente
        if (!filePath.toLowerCase().endsWith(".txt")) {
            filePath += ".txt";
        }

        // Écrire les détails de la réservation dans un fichier texte
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Détails de la réservation\n");
            writer.write("=========================\n");
            writer.write("ID de la réservation : " + reservation.getId() + "\n");
            writer.write("Date de début : " + reservation.getDateDebutAsString() + "\n");
            writer.write("Date de fin : " + reservation.getDateFinAsString() + "\n");
            writer.write("ID de la chambre : " + reservation.getChambre().getId() + "\n");
            writer.write("Nom du client : " + client.getNom() + " " + client.getPrenom() + "\n");

            JOptionPane.showMessageDialog(this, "Fichier texte exporté avec succès : " + filePath);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erreur lors de l'exportation du fichier texte : " + e.getMessage());
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void RecherchetbtnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchetbtnReservationActionPerformed
            // Récupérer l'ID saisi dans le champ de recherche
    String idText = RechercheTxt.getText().trim();

    // Vérifier si le champ est vide
    if (idText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Veuillez entrer un ID pour rechercher une réservation.", "Erreur", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Convertir l'ID en entier
        int id = Integer.parseInt(idText);

        // Rechercher la réservation par ID
        ReservationService rs = new ReservationService();
        Reservation reservation = rs.findById(id);

        // Vérifier si la réservation existe
        if (reservation == null) {
            JOptionPane.showMessageDialog(this, "Aucune réservation trouvée avec l'ID : " + id, "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Afficher les détails de la réservation dans le tableau
        DefaultTableModel model = (DefaultTableModel) ListReservation.getModel();
        model.setRowCount(0); // Vider le tableau
        model.addRow(new Object[]{
            reservation.getId(),
            reservation.getDateDebutAsString(),
            reservation.getDateFinAsString(),
            reservation.getChambre().getId(),
            reservation.getClient().getId()
        });

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "L'ID doit être un nombre entier.", "Erreur", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erreur lors de la recherche de la réservation : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_RecherchetbtnReservationActionPerformed

    private void AnulerbtnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnulerbtnRechercheActionPerformed
         // Réinitialiser le champ de recherche
    RechercheTxt.setText("");

    // Recharger toutes les réservations dans le tableau
    loadReservations();
    }//GEN-LAST:event_AnulerbtnRechercheActionPerformed

    private void RechercheTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheTxtActionPerformed
        RecherchetbtnReservationActionPerformed(evt);
    }//GEN-LAST:event_RechercheTxtActionPerformed

    private void ExportTableInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportTableInfoActionPerformed
        // Vérifier si la table des réservations est vide
    if (ListReservation.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "Aucune réservation à imprimer.", "Information", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // Créer un StringBuilder pour stocker les détails des réservations
    StringBuilder details = new StringBuilder();
    details.append("Détails des réservations\n");
    details.append("=======================\n\n");

    // Parcourir toutes les réservations dans la table
    for (int i = 0; i < ListReservation.getRowCount(); i++) {
        int id = (int) ListReservation.getValueAt(i, 0);
        String dateDebut = (String) ListReservation.getValueAt(i, 1);
        String dateFin = (String) ListReservation.getValueAt(i, 2);
        int chambreId = (int) ListReservation.getValueAt(i, 3);
        int clientId = (int) ListReservation.getValueAt(i, 4);

        // Ajouter les détails de la réservation
        details.append("ID de la réservation : ").append(id).append("\n");
        details.append("Date de début : ").append(dateDebut).append("\n");
        details.append("Date de fin : ").append(dateFin).append("\n");
        details.append("ID de la chambre : ").append(chambreId).append("\n");
        details.append("ID du client : ").append(clientId).append("\n");

        // Récupérer les détails du client (si nécessaire)
        ClientService clientService = new ClientService();
        Client client = clientService.findById(clientId);
        if (client != null) {
            details.append("Nom du client : ").append(client.getNom()).append(" ").append(client.getPrenom()).append("\n");
            details.append("Email du client : ").append(client.getEmail()).append("\n");
            details.append("Téléphone du client : ").append(client.getTelephone()).append("\n");
        }

        // Récupérer les détails de la chambre (si nécessaire)
        ChamberService chamberService = new ChamberService();
        Chambre chambre = chamberService.findById(chambreId);
        if (chambre != null) {
            details.append("Numéro de la chambre : ").append(chambre.getNumber()).append("\n");
            details.append("Type de la chambre : ").append(chambre.getType()).append("\n");
            details.append("Description de la chambre : ").append(chambre.getDescription()).append("\n");
        }

        details.append("\n"); // Séparateur entre les réservations
    }

    // Afficher les détails dans une boîte de dialogue avec un bouton d'impression
    JTextArea textArea = new JTextArea(details.toString());
    textArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(textArea);
    scrollPane.setPreferredSize(new Dimension(600, 400));

    // Bouton pour imprimer
    JButton printButton = new JButton("Imprimer");
    printButton.addActionListener(e -> {
        try {
            // Imprimer le contenu du JTextArea
            textArea.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors de l'impression : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    });

    // Boîte de dialogue pour afficher les détails
   Object[] options = { printButton }; // Options pour la boîte de dialogue (ici, un seul bouton)
JOptionPane.showOptionDialog(
    this, // Parent component
    scrollPane, // Message à afficher (ici, le JScrollPane)
    "Détails des réservations", // Titre de la boîte de dialogue
    JOptionPane.DEFAULT_OPTION, // Type d'option
    JOptionPane.INFORMATION_MESSAGE, // Type de message
    null, // Icône (null pour l'icône par défaut)
    options, // Options (boutons à afficher)
    options[0] // Option par défaut (ici, le premier bouton)
);
    }//GEN-LAST:event_ExportTableInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnulerbtnRecherche;
    private javax.swing.JComboBox<String> Chambercombo;
    private javax.swing.JComboBox<String> Clinetcombo;
    private javax.swing.JButton ExportTableInfo;
    private javax.swing.JTable ListReservation;
    private javax.swing.JTextField RechercheTxt;
    private javax.swing.JButton RecherchetbtnReservation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    // End of variables declaration//GEN-END:variables
}
