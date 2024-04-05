package Templates;

import Classes.Movie;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Jose
 */
public class ViewMovie extends javax.swing.JPanel implements Resolution {

    Movie movie = new Movie();

    public ViewMovie(Movie movie) {
        this.movie = movie;
        initComponents();
        setData();
    }

    /**
     * Conversor de String a HTML
     *
     * @param text Texto sin etiquetas HTML
     * @return Texto con formato HTML
     */
    private String toHTML(String text) {
        return "<html><p>" + text + "</p></html>";
    }

    private void setData() {
        //Establecer poster
        ImageIcon ico = new ImageIcon(movie.getPoster());
        Image img = ico.getImage();
        ImageIcon scaledIcon = new ImageIcon(img.getScaledInstance(300, 441, Image.SCALE_SMOOTH));
        Poster.setIcon(scaledIcon);
        //Datos textuales
        Title.setText(movie.getTitle());
        DateOfMovie.setText("Fecha: " + movie.getDate());
        Classification.setText("Clasificación: " + movie.getClassification());
        Description.setText(toHTML("Descripción: " + movie.getDescription()));
        Director.setText("Director: " + movie.getDirector());
        String listOfActors = movie.getActorsList().toString();
        //Elimiar [] de la lista
        listOfActors = listOfActors.substring(1, listOfActors.length() - 1);
        Actors.setText(toHTML("Actores: " + listOfActors));
        String listOfGenres = movie.getGenresList().toString();
        listOfGenres = listOfGenres.substring(1, listOfGenres.length() - 1);
        Genres.setText(toHTML("Generos: " + listOfGenres));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Poster = new javax.swing.JLabel();
        DateOfMovie = new javax.swing.JLabel();
        Classification = new javax.swing.JLabel();
        Duration = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        Director = new javax.swing.JLabel();
        Actors = new javax.swing.JLabel();
        Genres = new javax.swing.JLabel();

        setMinimumSize(DEF_RESOLUTION);
        setPreferredSize(DEF_RESOLUTION);

        Title.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        Title.setText("Title");

        Poster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DateOfMovie.setText("Fecha: ");

        Classification.setText("Clasificación: ");

        Duration.setText("Duración: ");

        Description.setText("[Descripcion]");
        Description.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Director.setText("Director/a: ");

        Actors.setText("Actores:");
        Actors.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Genres.setText("Generos:");
        Genres.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Poster, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DateOfMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(Classification, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(Duration, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Description, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                            .addComponent(Director, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Actors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Genres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Title)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateOfMovie)
                            .addComponent(Classification)
                            .addComponent(Duration))
                        .addGap(27, 27, 27)
                        .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Director)
                        .addGap(18, 18, 18)
                        .addComponent(Actors, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Genres, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Poster, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actors;
    private javax.swing.JLabel Classification;
    private javax.swing.JLabel DateOfMovie;
    private javax.swing.JLabel Description;
    private javax.swing.JLabel Director;
    private javax.swing.JLabel Duration;
    private javax.swing.JLabel Genres;
    private javax.swing.JLabel Poster;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}