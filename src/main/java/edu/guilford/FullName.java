package edu.guilford;

// FullName is a class that implements the Comparable interface so that
// any FullName object can compare itself to another FullName object.
// If we're implementing an interface, we need to implement all of the
// abstract methods in the interface
public class FullName implements Comparable<FullName> {

    // attributes
    private String firstName;
    private String middleName = "";
    private String lastName;

    enum SortOrder{FORWARD, REVERSE}
    public static SortOrder sortOrder = SortOrder.FORWARD;

    // constructors
    public FullName() {
        // Choose a random first name from a list of 20 possibilities
        String[] firstNames = {"Amanda", "Brenda", "Cindy", "Diane", "Erika",
            "Fiona", "Gina", "Heather", "Irene", "Julie", "Kathy", "Linda",
            "Mary", "Nancy", "Olivia", "Patty", "Quinn", "Rachel", "Samantha",
            "Tina"};
        int randomIndex = (int) (Math.random() * firstNames.length);
        firstName = firstNames[randomIndex];
        // Choose a random last name from a list of 20 possibilities
        String[] lastNames = {"Anderson", "Baker", "Carter", "Davis", "Edwards",
            "Fisher", "Garcia", "Harris", "Ingram", "Johnson", "Keller",
            "Lopez", "Miller", "Nelson", "Owens", "Perez", "Quinn", "Roberts",
            "Smith", "Taylor"};
        randomIndex = (int) (Math.random() * lastNames.length);
        lastName = lastNames[randomIndex];
        // Choose a random middle name from a list of 20 possibilities
        String[] middleNames = {"Anne", "Beth", "Catherine", "Diane", "Elizabeth",
            "Frances", "Grace", "Helen", "Irene", "Jane", "Katherine", "Louise",
            "Marie", "Nancy", "Olivia", "Patricia", "Quinn", "Rose", "Samantha",
            "Theresa"};
        randomIndex = (int) (Math.random() * middleNames.length);
        middleName = middleNames[randomIndex];

    }

    public FullName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        // We can do some validation here to make sure that the first name
        // is not null or empty
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        // We can do some validation here to make sure that the last name
        // is not null or empty
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        // We can do some validation here to make sure that the middle name
        // is not null or empty
        if (middleName != null && !middleName.isEmpty()) {
            this.middleName = middleName;
        }
    }

    public String toString() {
        return firstName + " " + middleName + " " +  lastName;
    }

    // This is the method that we need to implement from the Comparable
    // interface.  It compares this FullName object to another FullName
    // object.  If this FullName object is "less than" the other FullName
    // object, it returns a negative number.  If this FullName object is
    // "greater than" the other FullName object, it returns a positive
    // number.  If this FullName object is "equal to" the other FullName
    // object, it returns 0.
    @Override
    public int compareTo(FullName other) {
        // We can compare the last names first using the compareTo method of
        // the String class. String is Comparable, so it has a compareTo method
        int result = lastName.compareTo(other.lastName);
        // If the last names are the same, we can compare the first names
        if (result == 0) {
            result = firstName.compareTo(other.firstName);
            if (result == 0) {
                result = middleName.compareTo(other.middleName);
            }
        }
        if (sortOrder == SortOrder.REVERSE) {
            result = -result;
        }
        return result;
    }
    
}
