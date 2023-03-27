PROJECT TITLE:              ROSADO-month
PURPOSE OF PROJECT:         Represents a the choice between all the months based on 
                            numeric values.
VERSION or DATE:            2/15/22
HOW TO START THIS PROJECT:  Month
AUTHORS:                    Antonio Rosado
USER INSTRUCTIONS:          

The month class             The month class represents all 12 months by numeric values and
                            matches the month by name to its appropriate numeric value 
                            based on the user's input. The class contains fields named
                            monthNumber and monthName which are later initialized in the
                            constructor to allow for user input to perform the task of 
                            the class. The constructor also contains statements that 
                            restrict the input of a number less than or equal to zero,
                            and greater than twelve because there are only twelve
                            months in a year. In the class are a total of four methods.
                            The first two methods named getMonthNumber and getMonthName
                            simply return the values of the month number and name at the
                            time the methods are called. Then follows a method named 
                            setMonthName which contains all twelves cases the month can
                            be based upon their numeric values, and returns the month 
                            name if the corresponding number is correct. The final
                            method is named printMonth and prints "Month # is name" if
                            all steps are executed correctly. If the user inputs 3 then
                            the line "Month 3 is March" will print. 