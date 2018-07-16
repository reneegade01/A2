
public class Admin {
	
	    private static volatile Admin instance;
	    private int counter;
	    private int positiveCounter;
	    private int groupCounter;
	    private int userCounter;
	    private Group root; 
	    private Admin()
	    {
	    	
	    }

	    public static Admin getInstance(String value) {
	        if (instance == null) {
	            synchronized (Admin.class) {
	                if (instance == null) {
	                    instance = new Admin();
	                }
	            }
	        }
	        return instance;
	    }
	    
	    public Group getRoot() {
	    	return root; 
	    }
	    
	    private int totalNumberOfUsers()
	    {
	    	return root.getAllUsers().size(); 
	    }
	    
	    private int totalNumberOfGroups() {
	    	return root.getAllUsers().size(); 
	    }
	    
	    private int totalNumberOfMessages() {
	    	return counter;
	    }
	    
	    private int totalNumberOfPositiveMessages() {
	    	return positiveCounter;
	    }
	    
	    protected void updateMessageCount(String s)
	    {
	    	if (s.equals("summer"))
	    	{
	    		positiveCounter++;
	    	}
	    	counter++;
	    }
	    
	    protected void updateGroupCounter() {
	    	groupCounter++;
	    }
	    
	    protected void updateUserCounter() {
	    	userCounter++; 
	    }
}
