PROJECT TITLE:              ROSADO-heater-exercise
PURPOSE OF PROJECT:         Represents a heater with temperature a user can manipulate
VERSION or DATE:            2/15/22
HOW TO START THIS PROJECT:  Heater
AUTHORS:                    Antonio Rosado
USER INSTRUCTIONS:          

The heater class            The heater class represents a heater's temperature and allows 
                            the user to increase or decrease said temperature. The class 
                            contains fields named temperature, max, min, and increment which 
                            are later initialized in the constructor to allow for manipulation 
                            of the heater's maximum/minimum temperature, and incrementing the 
                            temperature. Both the temperature and increment variables are given 
                            values that cannot be manipulated by the user. The temperature equals 
                            15.0 while increment equals 5.0. This essentially means that the 
                            temperature will always begin at 15.0 and the increment will always be 
                            5.0. In the class are some methods that allow the execution of the actual 
                            increment of the temperature. There are four methods named getIncrement() 
                            which returns the value of the increment, getMaximum() which returns the 
                            value of the maximum temperature, getMinimum() which does the same except 
                            for the minimum value and the getTemperature() method which simply returns 
                            the value of the temperature at any given time it is called upon. Then there 
                            are two methods that allow the change of temperature, they are mutator methods. 
                            One is the warmer() method which allows the temperature to be risen through 
                            adding the increment, only if the temperature is less than the maximum value 
                            for the overall temperature. Then follows a cooler() method which follows the 
                            same premise, except it does the opposite and subtracts the increment from the 
                            temperature, making the overall tempertaure colder. Next is a method named 
                            setIncrement, which does as the name entails: sets the increment. However it is 
                            set only if the increment is greater than zero, because passing in zero would 
                            mean you're not changing the temperature at all, makingthe class pointless. 
                        
