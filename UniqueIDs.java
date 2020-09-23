import java.util.UUID;

public class UniqueIDs {
  public static String generateUniqueID() {
    String uniqueID = UUID.randomUUID().toString();
    return uniqueID; 
  }
}

// public class UniqueIDs {
//   public static UUID generateUniqueID() {
//     UUID uniqueID = UUID.randomUUID();
//     return uniqueID; 
//   }
// }