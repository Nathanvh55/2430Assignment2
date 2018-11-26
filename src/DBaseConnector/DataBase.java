import java.util.ArrayList;

public class DataBase {
	private String pwd;
	private String user;
	
	public DataBase(){
		pwd = DBDetails.password;
		user = DBDetails.username;
		connection();

	}

	public static void main (String[] args){
		DataBase p = new DataBase();
	}
	
	public void connection(){
		//create new connection 
		MyConnection c = new MyConnection(user, pwd);
		//reset tables
		boolean fullyResetTables = true; 
		PrepStudentScript initTables = new PrepStudentScript(fullyResetTables);
		//populate courses from txt file
		c.repopulateCourses();


		
	}

	}