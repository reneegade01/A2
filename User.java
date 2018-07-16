import java.util.HashSet;

public class User {
	
	private Admin admin;
	private static int numberOfInstances;
	private int userId; 
	private HashSet<User> followers; 
	private HashSet<Integer> following;
	private HashSet<String> newsfeed;
	
	private User() {
        numberOfInstances += 1;
        this.userId = 1000000 + numberOfInstances;
        admin.updateUserCounter(); 
	}
	
	public int getUserId() {
		return userId;
	}
	
	public HashSet<String> getNewsfeed() {
		return newsfeed;
	}
	
	public HashSet<Integer> getFollowing() {
		return following;
	}
	
	public HashSet<User> getFollowers() {
		return followers;
	}
	
		
}
