package packJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class baseDeDonee {
	 // Méthode pour se connecter à la base de données "biblio"
    public static void biblioConnect() {
        // Informations de connexion
        String url = "jdbc:mysql://localhost:3306/biblio"; // URL de la base de données
        String user = "votre_utilisateur"; // Utilisateur de la base de données
        String password = "votre_mot_de_passe"; // Mot de passe de la base de données

        // Tentative de connexion
        try {
            // Chargement du driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Établissement de la connexion
            Connection connection = DriverManager.getConnection(url, user, password);
            // Affichage d'un message de succès
            System.out.println("Connexion à la base de données réussie.");
            // Fermeture de la connexion
            connection.close();
        } catch (ClassNotFoundException e) {
            // Gestion de l'erreur si le driver JDBC n'est pas trouvé
            System.out.println("Erreur : Driver JDBC non trouvé.");
            e.printStackTrace();
        } catch (SQLException e) {
            // Gestion de l'erreur de connexion à la base de données
            System.out.println("Erreur lors de la connexion à la base de données.");
            e.printStackTrace();
        }
    }

    // Méthode main pour tester la connexion
    public static void main(String[] args) {
        biblioConnect();
    }
}
