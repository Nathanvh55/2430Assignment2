
/**
 * 2430 Assignement 2 Database class
 * @author Nathan von Hatten
 * @version 1.0
 */

public class DataBase {
	private String pwd;
	private String user;
	private MyConnection c;
	public DataBase(){
		pwd = DBDetails.password;
		user = DBDetails.username;
		connection();

	}

	public static void main (String[] args){
		DataBase p = new DataBase();
	}
	
	/**
     * New connection to database
     */
	public void connection(){
		//create new connection 
		c = new MyConnection(user, pwd);
		//reset tables
		boolean fullyResetTables = true; 
		PrepStudentScript initTables = new PrepStudentScript(fullyResetTables);
		//populate courses from txt file
		c.repopulateCourses();
	}

	/**
	 * Calls addCourse in MyConnection to add course to database
	 * @param code The Course code
	 * @param credit The number of credits for the course
	 * @param name The name of the course
	 * @param semester The semester the course is offered
	 * @param prereq The prerequesits of a course
	 */
	public void addCourse(String code, String credit, String name, String semester, String prereq){
		c.addCourse(code,credit,name,semester,prereq);
	}

	/**
	 * Deletes any courses matching a given course code from the database.
	 * 
	 * @param code The course code as a string 
	 */
	public void deleteCourse(String code){
		c.deleteCourse(code);
	}















	}