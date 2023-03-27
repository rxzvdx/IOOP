PROJECT TITLE:              ROSADO-person
PURPOSE OF PROJECT:         To create a person with set first/middle name(s), age, 
                            and whether said person is a parent or not. 
VERSION or DATE:            2/22/22
HOW TO START THIS PROJECT:  Person
AUTHORS:                    Antonio Rosado
USER INSTRUCTIONS:          The person class represents an object "person" that has a 
                            first name, middle name, age, and whether said person is a
                            parent or not. The class contains fields named firstName,
                            middleName, isParent, and age. They are all later initialized
                            in the constructor to allow for user input to perform the task
                            of assigning real values to those fields. There are two 
                            constructors in the class with the first creating an adult
                            person with all of the attributes (first/middle name, whether 
                            they're a parent, and their age). In the constructor are two
                            .trim() and toUpperCase() methods that gets rid of any leading 
                            and trailing whitespace removed and converts all of the characters 
                            in the Strings to upper case. The second constructor follows the 
                            same premise as the first, except that it sets the age to 0 to
                            simulate a new born baby/child. In the class are a total of 7
                            methods. The first five methods are accessor methods named
                            getFirstName which returns the first name, getMiddleName which
                            returns the middle name, getAge which returns the age, 
                            getParentString which returns a String "parent" if the person
                            is a parent, and "child" if the person is a child, then 
                            getInitialsString which returns the initials of the person
                            created. The remaining two methods are mutator methods with 
                            the first being incrementAge which increments the age by 1, 
                            and the second being changeFirstName which allows the user
                            to change the first name of their already established person
                            if certain conditons are met. The family class relies solely
                            on the person class and contains nine methods. There are four
                            accessor methods named getSurname,getHusband, getWife, and
                            getChild which simply return the husband, wife, or child 
                            person objects created in the person class if they exist. 
                            The remaining methods are mutator methods named haveChild
                            which allows the user to add a child to the family, and 
                            another overloaded have child which allows the husband and
                            wife persons to procreate. Then follows haveFamilyBirthday
                            which gives all family members a birthday and prints their
                            new age, and printChild which prints the childs name(s) if
                            the child exists. Lastly is the familyInitials method which
                            returns the initials of each family member on a new line. 
