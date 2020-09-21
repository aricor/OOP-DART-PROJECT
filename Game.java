public class Game {
    String ID;
    String title;
    String genre;
    double dailyRent;
    boolean rentStatus;

    public Game(String ID, String title, String genre, double dailyRent, boolean rentStatus) {
        this.ID = ID;
        this.title = title;
        this.genre = genre;
        this.dailyRent = dailyRent;
        this.rentStatus = rentStatus;

    }

    public boolean getRentStatus() {
        // Is game available? True or false
        return true; 
    }

}
