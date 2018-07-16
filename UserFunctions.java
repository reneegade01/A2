import java.util.HashSet;

public class UserFunctions {

	private Admin admin; 
	private HashSet<Integer> allUsers; 
	private User current;
	private HashSet<User> followers; 
	private HashSet<Integer> following;
	
	void follow(int u) {
		
		if (allUsers.contains(u)) {
			following.add(u);
			System.out.println("Followed!");
		}
		else {
			System.out.println("User could not be found.");
		}
	}
	
	void tweet(String s) {
		
		current.getNewsfeed().add(s);
		for (User follower: followers)
		{
			follower.getNewsfeed().add(s);
			admin.updateMessageCount(s);
		}
		
	}	

}
