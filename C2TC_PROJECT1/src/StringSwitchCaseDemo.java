/**
 * 
 */

/**
 * @author carol sanjana p
 *
 */
public class StringSwitchCaseDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name ="TEAM";
    switch(name.toLowerCase())
    {
    case "author" :
    	System.out.println("Vikas");
    	break;
    case "team":
    	System.out.println("Team Java Full Stack");
    	break;
    case "editor":
    	System.out.println("vishnu and krishna");
    	break;
    default: System.out.println("Invalid entry");
    break;
    }
	}

}
