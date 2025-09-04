package singletons;

public class SingletonTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DbConnection emp1 = new DbConnection();
		//DbConnection emp2 = new DbConnection();
		DbConnection con1 = DbConnection.getInstance();
		DbConnection con2 = DbConnection.getInstance();
		con1.getDbConnection();
		con2.getDbConnection();
	}

}