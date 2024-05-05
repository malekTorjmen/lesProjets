package packJDBC;

public class classJDBC {
	  public static void biblioConnect() {
	        String url = "jdbc:mysql://localhost:3306/biblio"; 
	        String user = "votre_utilisateur"; 
	        String password = "votre_mot_de_passe";

	        try {
	      
	            Class.forName("com.mysql.cj.jdbc.Driver");

	  
	            Connection connection = DriverManager.getConnection(url, user, password);
	            
	       
	            System.out.println("Connexion à la base de données réussie.");

	         
	            connection.close();
	        } catch (ClassNotFoundException e) {
	            System.err.println("Erreur : Driver JDBC non trouvé !");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.err.println("Erreur : Impossible de se connecter à la base de données.");
	            e.printStackTrace();
	        }
	    }

	    public static void bookDisplay() {
	        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
	            String query = "SELECT * FROM Book";
	            PreparedStatement statement = connection.prepareStatement(query);
	            ResultSet resultSet = statement.executeQuery();
	            System.out.println("Liste des livres :");
	            while (resultSet.next()) {
	                int id = resultSet.getInt("book_id");
	                String title = resultSet.getString("Title");
	                String author = resultSet.getString("Author");
	                double price = resultSet.getDouble("Price");
	                System.out.println("ID: " + id + ", Titre: " + title + ", Auteur: " + author + ", Prix: " + price);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    public static void bookAdd(String title, String author, double price) {
	        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
	            String query = "INSERT INTO Book (Title, Author, Price) VALUES (?, ?, ?)";
	            PreparedStatement statement = connection.prepareStatement(query);
	            statement.setString(1, title);
	            statement.setString(2, author);
	            statement.setDouble(3, price);
	            statement.executeUpdate();
	            System.out.println("Nouveau livre ajouté avec succès !");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    public static void bookUpdate(String title, double newPrice) {
	        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
	            String query = "UPDATE Book SET Price = ? WHERE Title = ?";
	            PreparedStatement statement = connection.prepareStatement(query);
	            statement.setDouble(1, newPrice);
	            statement.setString(2, title);
	            int rowsAffected = statement.executeUpdate();
	            if (rowsAffected > 0) {
	                System.out.println("Prix du livre mis à jour avec succès !");
	            } else {
	                System.out.println("Aucun livre trouvé avec ce titre.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    public static void bookDelete(String title) {
	        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
	            String query = "DELETE FROM Book WHERE Title = ?";
	            PreparedStatement statement = connection.prepareStatement(query);
	            statement.setString(1, title);
	            int rowsAffected = statement.executeUpdate();
	            if (rowsAffected > 0) {
	                System.out.println("Livre supprimé avec succès !");
	            } else {
	                System.out.println("Aucun livre trouvé avec ce titre.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
	    
	    
	    
