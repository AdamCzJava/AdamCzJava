package Lab9;

public class CD extends LibraryItem implements LoanItem{
	//Variables
	private  String band;
	private String title;
	private int numTracks;

	//Constructor
	public CD (String type, String ID,String band, String title, int numTrack) 
	{
		super(type, ID);
		this.band = band;
		this.title = title;
		this.numTracks = numTrack;
	}
	//Getters and setters
	public String getBand() 
	{
		return band;
	}
	public void setBand(String band) 
	{
		this.band = band;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public int getNumTracks() 
	{
		return numTracks;
	}
	public void setNumTracks(int numTracks) 
	{
		this.numTracks = numTracks;
	}
	//toString method
	public String toString() {
		return "CD [band=" + band + ", title=" + title + ", numTracks=" + numTracks + "]";
	}
	//calculatePrice method
	public double calculatePrice() 
	{
		return 23.33;   
	}

}