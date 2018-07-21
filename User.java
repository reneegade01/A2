import java.util.HashSet;

public class User implements Id {
	
	private Admin admin;
	private static int numberOfInstances;
	private int userId; 
	private long creationTime; 
	private long lastUpdateTime; 
	private HashSet<User> followers; 
	private HashSet<Integer> following;
	private HashSet<String> newsfeed;
	
	private User() {
        numberOfInstances += 1;
        this.userId = 1000000 + numberOfInstances;
        admin.updateUserCounter(); 
        this.creationTime = System.currentTimeMillis(); 
        System.out.println(creationTime); 
	}
	
	@Override
	public int getId() {
		return userId;
	}
	
	public void updateLastUpdateTime() {
		this.lastUpdateTime = System.currentTimeMillis(); 
		
	}
	
	public long getLastUpdateTime() {
		return lastUpdateTime;
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
