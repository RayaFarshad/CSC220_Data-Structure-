import java.awt.image.*;

/**
 * A profile on a simple social network.
 */
public class Profile {

    private BufferedImage profilePicture;
    private Name profileName;
    private String status;
    private AList<Profile> friends;

    /** 
     * DO NOT CHANGE
     * Constructor for an instance of a profile.
     */
    public Profile() {
        /** 
         * DO NOT CHANGE
         * Constructor for an instance of a profile.
         */
        profilePicture = new BufferedImage(150, 150, BufferedImage.TYPE_INT_RGB);
        profileName = new Name("", "");
        status = "";
        friends = new AList<>();
    }

    public BufferedImage getProfilePicture() {
        return this.profilePicture;
    } 

    public void setProfilePicture(BufferedImage newPicture) {
        this.profilePicture = newPicture;
    }

    public Name getName() {
        return this.profileName;
    }

    /**
     * Sets the name associated with the profile 
     * to the given first and last name.
     * @param first
     * @param last
     */
    public void setName(String first, String last) {
        profileName.setName(first, last);
       
    } 

    /**
     * Sets the name associated with the profile 
     * to the given name.
     * @param name
     */
    public void setName(Name name) {
        this.profileName = name;
    }

    /**
     * Sets the current status of the profile 
     * to the given string.
     * @param stat
     */
    public void setStatus(String stat) {
        this.status = stat;
    }

    /**
     * Returns the status associated with the profile.
     * @return 
     */
    public String getStatus() {
        return status;
    } 

    /**
     * Returns a list of all the profile's friends 
     */
    public AList<Profile> getFriends() {
        return friends;
    } 

    /**
     * Adds a friend to the profile's list of friends.
     */
    public void addFriend(Profile p) {
        if (!friends.contains(p))
        friends.add(p);
        
    } 

    /**
     * Removes a friend from the profile's list of friends.
     */
    public void removeFriend(Profile p) {
       
            for(int i = 1; i <= friends.getLength(); i++){
                 if (friends.contains(p)){
            friends.remove(i);
               }
        }
//        for(int i = 0; i < friends.getLength(); i++){
//            friends.getEntry(i).removeFriend(p);
//        }
    } 

    @Override
    public String toString() {
        return "name: " + getName() + "\n\tStatus: " + getStatus() + "\n\tPictures; " + getProfilePicture().toString().substring(0,20)
                + "\n\t#of friends: " + friends.getLength() + "\n";
    }

    /**
     * Displays the profile's information and friends.
     */
    public void display() {
        System.out.print(toString());
        System.out.println("Friends: ");
        
        for(int i = 1; i < friends.getLength()+1; i++){
            System.out.println("\t" + friends.getEntry(i).getName());
        }
    } 
} // end Profile
