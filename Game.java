
public class Game {
  String ID;
  String title;
  String genre;
  double dailyRent;
  boolean rentStatus;
  double totalProfit; 

  public Game(String ID, String title, String genre, double dailyRent) {
      this.ID = ID;
      this.title = title;
      this.genre = genre;
      this.dailyRent = dailyRent;
      this.rentStatus = false;
      this.totalProfit = 0.0; 
  }

  public boolean getRentStatus() {
      // Is game available? True or false
      return this.rentStatus; 
  }

  public double getDailyRent() {

      return this.dailyRent;
  }
//gotta fix totalRent+= newRent 
  public double getTotalProfit() {

      return this.totalProfit;
  }

  public String getID() {

      return this.ID;
  }

  public String getTitle() {

      return this.title;
  }

  public String getGenre() {

      return this.genre;
  }
  
  public void setRentStatus(boolean rentStatus) {

      this.rentStatus = rentStatus;
  }
  
  public void setTotalProfit(int days){

      this.totalProfit += this.dailyRent * days;
  }
  
  public void printTotalProfit() {
      System.out.println("The total profit is " + this.totalProfit);
      // this.totalProfit = totalProfit*days; 
      // System.out.println(""); 
  }
  public void print () {

    if(this.rentStatus){
        System.out.println(this.ID + " : " + this.title + " " + this.dailyRent + " Not available");
      
    }else{
        System.out.println(this.ID + " : " + this.title + " " + this.dailyRent + " Available for rent");
    }
     
  }
}
