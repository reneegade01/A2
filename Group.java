import java.util.HashSet;

public class Group implements Id{
	 
	private Admin admin;
	private static int numberOfInstances;
	private int groupId; 
	private int rootId;
	private long creationTime; 
	private HashSet<User> root;
	private HashSet<User> members; 
	
	private Group() {
        numberOfInstances += 1;
		if (numberOfInstances == 1) {
			this.rootId = 1;
		} else {
	        this.groupId = 1 + numberOfInstances;
		}
        this.creationTime = System.currentTimeMillis(); 
        System.out.println(creationTime); 
		admin.updateGroupCounter(); 
	}
	
	@Override
	public int getId() {
		return groupId; 
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
