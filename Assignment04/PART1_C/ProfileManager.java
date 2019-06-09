/**
 * A profile manager on a simple social network.
 */

public class ProfileManager {

    private final AList<Profile> allProfiles;

    /**
     * DO NOT CHANGE
     * Constructor for an instance of a profile manager.
     */
    public ProfileManager() {
        /**
         * DO NOT CHANGE
         */
        allProfiles = new AList<>();
    }

    /**
     * Adds a profile onto the social network.
     */
    public void addProfile(Profile p) {
        allProfiles.add(p);
    } 

    /**
     * Removes a profile from the social network.
     */
    public void removeProfile(Profile p) {
        
      // p.removeFriend(p);
       // allProfiles.remove(1);
        for(int i = 1; i <= allProfiles.getLength(); i++){
            if(p.equals(allProfiles.getEntry(i))) {               
            allProfiles.remove(i);
            }
      //    p.removeFriend(allProfiles.getEntry(i));  
            if(allProfiles.getEntry(i).getFriends().contains(p)){
                allProfiles.getEntry(i).removeFriend(p);
            
            }
        }
        
    }
    

    /**
     * Created a friendship between two profiles on the social network.
     */

    /**
     * Created a friendship between two profiles on the social network.
     * @param a
     */
    public void createFriendship(Profile a, Profile b) {
        a.addFriend(b);
        b.addFriend(a);
    }

    /**
     * Ends a friendship between two profiles on the social network.
     */
    public void endFriendship(Profile a, Profile b) {
        a.removeFriend(b);
        b.removeFriend(a);
    } 

    /**
     * Displays each profile's information and friends.
     */
    public void display() {
        
        for(int i = 1; i < allProfiles.getLength()+1; i++){
            
            allProfiles.getEntry(i).display();

        }
    } 
}
