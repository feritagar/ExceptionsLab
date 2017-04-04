package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException{
        String lastName = null;
        
        if(fullName == null || fullName.isEmpty()){
            throw new IllegalArgumentException("Please enter your name and last name");
        }
        // write your code here to extract the lastName and store in the
        // above local variable
        String[] parts = fullName.split(" ");
        
        if(parts.length == 1){
            throw new IllegalArgumentException("Please enter your first and last name");
        }
        lastName = parts[parts.length - 1];
        
        return lastName;
    }
    

    
    
}
