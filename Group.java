import java.util.HashSet;

public class Group {
	 
	private Admin admin;
	private static int numberOfInstances;
	private int groupId; 
	private int rootId;
	private HashSet<User> root;
	private HashSet<User> members; 
	
	private Group() {
        numberOfInstances += 1;
		if (numberOfInstances == 1) {
			this.rootId = 1;
		} else {
	        this.groupId = 1 + numberOfInstances;
		}
		admin.updateGroupCounter(); 
	}
	
	public HashSet<User> getMembers() {
		
		return members; 
	}
	
	public HashSet<User> getAllUsers() {
		return root;
		
	}
	
	public void addUser(User u)
	{
		root.add(u);
	}
}
