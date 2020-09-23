import java.util.UUID;

public class UniqueIDs {
  public static String generateUniqueID() {
    String uniqueID = UUID.randomUUID().toString();
    return uniqueID; 
  }
}