/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Templates;

import Classes.Movie;
import Classes.REGEX;
import com.mycompany.cuevadeana.Mongo;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.bson.types.Binary;

/**
 *
 * @author Jose
 */
public class RegisterMovies extends javax.swing.JPanel {

    /**
     * Crea un nuevo formulario para el registro de peliculas.
     *
     * @param client El cliente de MongoDB.
     */
    private Mongo mongoDB;

    public RegisterMovies(Mongo client) {
        initComponents();
        this.mongoDB = client;
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
        Title = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Actors = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Comedia = new javax.swing.JCheckBox();
        Drama = new javax.swing.JCheckBox();
        Suspenso = new javax.swing.JCheckBox();
        Accion = new javax.swing.JCheckBox();
        Terror = new javax.swing.JCheckBox();
        Fantasia = new javax.swing.JCheckBox();
        Familia = new javax.swing.JCheckBox();
        Romance = new javax.swing.JCheckBox();
        Crimen = new javax.swing.JCheckBox();
        Misterio = new javax.swing.JCheckBox();
        Ciencia_f = new javax.swing.JCheckBox();
        Aventura = new javax.swing.JCheckBox();
        ClearGenres = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Classification = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Director = new javax.swing.JTextField();
        Duration = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Poster = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(910, 630));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 630));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setText("Titulo");

        Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setText("Actores");

        Clear.setBackground(new java.awt.Color(255, 102, 102));
        Clear.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\sources\\trash-solid.png"));
        Clear.setToolTipText("");
        Clear.setAlignmentX(0.5F);
        Clear.setBorder(null);
        Clear.setBorderPainted(false);
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Clear.setIconTextGap(20);
        Clear.setMargin(new java.awt.Insets(10, 14, 10, 14));
        Clear.setName(""); // NOI18N
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setText("Generos");

        Comedia.setText("Comedia");

        Drama.setText("Drama");

        Suspenso.setText("Suspenso");

        Accion.setText("Acción");

        Terror.setText("Terror");

        Fantasia.setText("Fantasia");

        Familia.setText("Familia");

        Romance.setText("Romance");

        Crimen.setText("Crimen");

        Misterio.setText("Misterio");

        Ciencia_f.setText("Ciencia ficción");

        Aventura.setText("Aventura");

        ClearGenres.setBackground(new java.awt.Color(255, 102, 102));
        ClearGenres.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        ClearGenres.setForeground(new java.awt.Color(255, 255, 255));
        ClearGenres.setText("Borrar generos");
        ClearGenres.setToolTipText("");
        ClearGenres.setAlignmentX(0.5F);
        ClearGenres.setBorder(null);
        ClearGenres.setBorderPainted(false);
        ClearGenres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearGenres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ClearGenres.setIconTextGap(5);
        ClearGenres.setMargin(new java.awt.Insets(10, 14, 10, 14));
        ClearGenres.setName(""); // NOI18N
        ClearGenres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearGenresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Accion)
                            .addComponent(Terror)
                            .addComponent(Fantasia))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Familia)
                            .addComponent(Romance)
                            .addComponent(Crimen)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Comedia)
                        .addGap(29, 29, 29)
                        .addComponent(Drama)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Suspenso)
                    .addComponent(Aventura)
                    .addComponent(Ciencia_f)
                    .addComponent(Misterio))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClearGenres, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Comedia)
                    .addComponent(Drama)
                    .addComponent(Suspenso))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accion)
                    .addComponent(Familia)
                    .addComponent(Misterio))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Terror)
                    .addComponent(Romance)
                    .addComponent(Ciencia_f))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fantasia)
                    .addComponent(Crimen)
                    .addComponent(Aventura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClearGenres)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setText("Clasificación");

        Classification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "T", "7", "12", "15", "18", "X", "Prohibido" }));

        jLabel7.setText("*Actores separados por comas ( , )");

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setText("Descripción");

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setText("Fecha");

        Description.setColumns(20);
        Description.setRows(5);
        jScrollPane1.setViewportView(Description);

        DateChooser.setDateFormatString("dd-MM-yyyy");

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setText("Director");

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setText("Duración");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Classification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(31, 31, 31)
                                .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)
                                .addComponent(Actors))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Director, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Duration, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Actors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Classification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        Poster.setBackground(new java.awt.Color(255, 255, 255));
        Poster.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        Poster.setForeground(new java.awt.Color(0, 102, 0));
        Poster.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Poster.setText("Añadir portada");
        Poster.setToolTipText("");
        Poster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Poster.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Poster.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Poster.setInheritsPopupMenu(false);
        Poster.setVerifyInputWhenFocusTarget(false);
        Poster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PosterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Poster, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Poster, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registro de pelicula");

        Save.setFont(new java.awt.Font("Ebrima", 1, 20)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 102, 102));
        Save.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\sources\\save.png"));
        Save.setText("Guardar");
        Save.setToolTipText("");
        Save.setAlignmentX(0.5F);
        Save.setBorder(null);
        Save.setBorderPainted(false);
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Save.setIconTextGap(20);
        Save.setMargin(new java.awt.Insets(10, 14, 10, 14));
        Save.setName(""); // NOI18N
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(52, 52, 52)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleActionPerformed

    private void PosterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PosterMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("png", "PNG", "jpg", "JPG", "webp", "WEBP", "JPEG", "jpeg");
        fileChooser.setFileFilter(extensionFilter);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            //a binaario
            imagenInBinary = imgBinary(fileChooser.getSelectedFile());
            //binario a byte
            byte[] imageData = imagenInBinary.getData();
            //introduccion de la imagen a jlabel
            ImageIcon ico = new ImageIcon(imageData);
            Image img = ico.getImage();
            ImageIcon scaledIcon = new ImageIcon(img.getScaledInstance(Poster.getWidth(), Poster.getHeight(), Image.SCALE_SMOOTH));
            switchPoster(false);
            Poster.setIcon(scaledIcon);
        } else {
            imagenInBinary = null;
        }
    }//GEN-LAST:event_PosterMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_ClearMouseClicked

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void ClearGenresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearGenresMouseClicked
        // TODO add your handling code here:
        clearGenres();
    }//GEN-LAST:event_ClearGenresMouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        // TODO add your handling code here:
        REGEX regex = new REGEX();
        boolean hasError = false;
        //registrar titulo
        String title = Title.getText().trim();
        if (!regex.validate(1, title)) {
            hasError = true;
            window.Message("warning", "The title is empty", "Null title");
        }
        //convertir texto de actores a una lista
        String actorsString = Actors.getText().trim();
        if (regex.validate(2, actorsString)) {
            if (actorsString.charAt(actorsString.length() - 1) == ',') {
                actorsString = actorsString.substring(0, actorsString.length() - 1);
            } else if (actorsString.charAt(0) == ',') {
                actorsString = actorsString.substring(1);
            }
        } else {
            hasError = true;
            window.Message("warning", "The actors is empty", "Null actors");
        }
        //Generos a lista
        String genresString = getListGenres();
        if (genresString.length() == 0) {
            hasError = true;
            window.Message("warning", "Genre or Genres not selected", "Null Genres");
        }
        //clasificacion
        if (Classification.getSelectedIndex() == 0) {
            hasError = true;
            window.Message("warning", "Classification is not selected", "Null Classification");
        }

        //Poster
        if (imagenInBinary == null) {
            hasError = true;
            window.Message("warning", "Poster not upload", "Poster");

        }
        //Description
        String description = Description.getText().trim();
        if (!regex.validate(0, description)) {
            hasError = true;
            window.Message("warning", "Description null", "Null description");
        }
        Date date = DateChooser.getDate();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = sdf.format(date);
        if (!regex.validate(3, dateString)) {
            hasError = true;
            window.Message("warning", "Date error", "Date error");
        }
        //Duration
        int duration = 0;
        try {
            duration = Integer.parseInt(Duration.getText().trim());
        } catch (NumberFormatException e) {
            hasError = true;
            System.out.println("" + e);
        }
        if (duration < 30 || duration > 900) {
            hasError = true;
            window.Message("danger", "duration lenght error", "Invalid duration");
        }
        //Director
        String director = Director.getText().trim();
        if (!regex.validate(1, director)) {
            hasError = true;
            window.Message("danger", "Director's name invalid", "Invalid director");
        }
        if (hasError == false) {
            //Create a class movie 
            Movie movie = new Movie();
            movie.setTitle(title);
            movie.setPoster(imagenInBinary);
            movie.setClassification(Classification.getSelectedItem().toString());
            movie.setGenres(stringToList(genresString));
            movie.setActors(stringToList(actorsString));
            movie.setDescription(description);
            movie.setDirector(director);
            movie.setDuration(duration);
            movie.setDate(dateString);
            //Conecction and insertion in database
            mongoDB.insert(movie);
            //Clear all fields
            clearForm();
        } else {
            window.Message("danger", "Error in new movie", "Error to register a movie");
            hasError = false;
        }
    }//GEN-LAST:event_SaveMouseClicked

    private void switchPoster(boolean t) {
        Poster.setIcon(null);
        Poster.setForeground(t ? new Color(0, 153, 0, 255) : new Color(50, 100, 0, 150));
        Poster.setText(t ? "Añadir portada" : "Cambiar portada");
    }

    private void clearGenres() {
        Comedia.setSelected(false);
        Accion.setSelected(false);
        Terror.setSelected(false);
        Fantasia.setSelected(false);
        Drama.setSelected(false);
        Familia.setSelected(false);
        Romance.setSelected(false);
        Crimen.setSelected(false);
        Suspenso.setSelected(false);
        Misterio.setSelected(false);
        Ciencia_f.setSelected(false);
        Aventura.setSelected(false);
    }
    Binary imagenInBinary = null;

    private void clearForm() {
        imagenInBinary = null;
        clearGenres();
        Title.setText("");
        Actors.setText("");
        Classification.setSelectedIndex(0);
        switchPoster(true);
        Description.setText("");
        Director.setText("");
        Duration.setText("");
        DateChooser.setDate(new Date());

    }
    DebugWindow window = new DebugWindow();

    //
    private List<String> stringToList(String text) {
        return Arrays.asList(text.split(","));
    }

    //Obtiene lista de generos
    private String getListGenres() {
        String list = "";
        if (Comedia.isSelected()) {
            list += ", " + Comedia.getText();
        }
        if (Accion.isSelected()) {
            list += ", " + Accion.getText();
        }
        if (Terror.isSelected()) {
            list += ", " + Terror.getText();
        }
        if (Fantasia.isSelected()) {
            list += ", " + Fantasia.getText();
        }
        if (Drama.isSelected()) {
            list += ", " + Drama.getText();
        }
        if (Familia.isSelected()) {
            list += ", " + Familia.getText();
        }
        if (Romance.isSelected()) {
            list += ", " + Romance.getText();
        }
        if (Crimen.isSelected()) {
            list += ", " + Crimen.getText();
        }
        if (Suspenso.isSelected()) {
            list += ", " + Suspenso.getText();
        }
        if (Misterio.isSelected()) {
            list += ", " + Misterio.getText();
        }
        if (Ciencia_f.isSelected()) {
            list += ", " + Ciencia_f.getText();
        }
        if (Aventura.isSelected()) {
            list += ", " + Aventura.getText();
        }
        if (list.length() == 0) {
            list = null;
        } else {
            list = list.substring(2, list.length());
        }
        return list;
    }

    private static Binary imgBinary(File file) {
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] data = inputStream.readAllBytes();
            return new Binary(data);
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Accion;
    private javax.swing.JTextField Actors;
    private javax.swing.JCheckBox Aventura;
    private javax.swing.JCheckBox Ciencia_f;
    private javax.swing.JComboBox<String> Classification;
    private javax.swing.JButton Clear;
    private javax.swing.JButton ClearGenres;
    private javax.swing.JCheckBox Comedia;
    private javax.swing.JCheckBox Crimen;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTextArea Description;
    private javax.swing.JTextField Director;
    private javax.swing.JCheckBox Drama;
    private javax.swing.JFormattedTextField Duration;
    private javax.swing.JCheckBox Familia;
    private javax.swing.JCheckBox Fantasia;
    private javax.swing.JCheckBox Misterio;
    private javax.swing.JLabel Poster;
    private javax.swing.JCheckBox Romance;
    private javax.swing.JButton Save;
    private javax.swing.JCheckBox Suspenso;
    private javax.swing.JCheckBox Terror;
    private javax.swing.JTextField Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
