/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;
    
    //private String fileName; 
    // ex 7.12
    
    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader(); 
    }
    
    /**
    
    public LogAnalyzer(String fileName) // ex 7.12 param
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader(fileName); // ex 7.12 param
    }
    */
   
    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
    
    /**
     * Return busiest hour of the day // ex. 7.15
     */
    public int busiestHour()
    {
	int busiestHour = 0;
	for(int hour = 1; hour < hourCounts.length; hour++) 
	{
		if(hourCounts[hour] > hourCounts[busiestHour]) 
		{
			busiestHour = hour;
		}
	}
	return busiestHour;
    }

    /**
     * Return quietst hour of the day // ex. 7.16
     */
    public int quitestHour()
    {
	int quitestHour = 0;
	for(int hour = 1; hour < hourCounts.length; hour++) 
	{
		if(hourCounts[hour] < hourCounts[quitestHour]) 
		{
			quitestHour = hour;
		}
	}
	return quitestHour;
    }
}
