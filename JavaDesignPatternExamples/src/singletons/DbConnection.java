package singletons;

public class DbConnection {
	private DbConnection() {
		// TODO Auto-generated constructor stub
		System.out.println("object created..");
	}
	
	// factory method which is responsible to create the object.
	private static DbConnection DB_INSTANCE;
	
	public synchronized  static DbConnection getInstance() {
		 //DbConnection DB_INSTANCE = new DbConnection();
		
			if(DB_INSTANCE==null) {
				
				DB_INSTANCE=new DbConnection();
			
			}
		
		return DB_INSTANCE;
	} 
	public void getDbConnection() {
		System.out.println("Load the Driver and conntected");
	}
}