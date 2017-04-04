package lab0;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid.
 * <p>
 * For example, String arguments may be null or empty; other objects may be
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all arguments
 * are valid. The only exception is when any argument is acceptable based on
 * requirements. Fix the code below using if logic to validate method arguments
 * and throw IllegalArgumentException if the validation fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    /**
     * Convenience constructor to set all properties.
     *
     * @param firstName - cannot be null or empty
     * @param lastName - cannot be null or empty
     * @param ssn
     * @param daysVacation
     * @throws IllegalArgumentException if parameters are not valid
     */
    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }

    public final int getDaysVacation() {
        return daysVacation;
    }

    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation < 0 || daysVacation > 28) {
            throw new IllegalArgumentException("vacation days cannot be greater than 28 or less than 0");
        }
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }

    /**
     * Mutates the first name.
     *
     * @param firstName - cannot be null or empty
     * @throws IllegalArgumentException if firstName is null or empty
     */
    public final void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Sorry, first name is mandatory. Please try again");
        }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    /**
     * Mutates the lastName.
     *
     * @param lastName - cannot be null or empty
     * @throws IllegalArgumentException if lastName is null or empty
     */
    public final void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Sorry, last name is mandatory. Please try again");
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        String ssnPart1, ssnPart2, ssnPart3 = null;

        if (ssn == null || ssn.isEmpty()) {
            throw new IllegalArgumentException("SSN is mandotory. Please enter your SSN");
        }
        if (ssn.length() != 11) {
            throw new IllegalArgumentException("SSN must be 11 characters with dash. XXX-XX-XXXX");
        }
        //split SSN with dash(-)
        String[] ssnParts = ssn.split("-");

        if (ssnParts.length != 3) {
            throw new IllegalArgumentException("SSN must be 11 characters with dash. XXX-XX-XXXX");
        }
        //first 3 digits validation
        ssnPart1 = ssnParts[ssnParts.length - 3];
        if (ssnPart1.equals("000") || ssnPart1.equals("666")) {
            throw new IllegalArgumentException("SSN first part cannot be 000 or 666");
        }
        if (Integer.parseInt(ssnPart1) > 899 || Integer.parseInt(ssnPart1) < 1000) {
            throw new IllegalArgumentException("SSN first part cannot be greater than 899 and less than 1000");
        }

        //second 2 digits validation
        ssnPart2 = ssnParts[ssnParts.length - 2];
        if (ssnPart2.equals("00")) {
            throw new IllegalArgumentException("SSN second  part cannot be 00");
        }
        if (Integer.parseInt(ssnPart2) < 1 || Integer.parseInt(ssnPart2) > 99) {
            throw new IllegalArgumentException("SSN second part cannot be less than 01 or greater than 99");
        }

        //last 4 digits validation
        ssnPart3 = ssnParts[ssnParts.length - 1];
        if (ssnPart3.equals("0000")) {
            throw new IllegalArgumentException("SSN third part cannot be 0000");
        }
        if (Integer.parseInt(ssnPart3) < 1 || Integer.parseInt(ssnPart3) > 9999) {
            throw new IllegalArgumentException("SSN last 4 digits cannot be less than 0001 or greater than 9999");
        }

        this.ssn = ssn;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
