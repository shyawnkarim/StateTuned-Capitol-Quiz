package com.example.statetunedcapitolquiz;

public class State {
	private String _name;
	private String _capitol;
	private String _city1;
	private String _city2;
	private String _image; //file name of the state image

    private static State[] states = null;
	
	public State(String name, String capitol, String city1, String city2, String image)
	{
		_name = name;
		_capitol = capitol;
		_city1 = city1;
		_city2 = city2;
		_image = image;
	}
	

	public String getName() {
		   return _name;
		 }
	 
	 public String getCapitol() {
		   return _capitol;
		 }
	 
	 public String getCity1() {
		   return _city1;
		 }
	 
	 public String getCity2() {
		   return _city2;
		 }
	 
	 public String getImage() {
		   return _image;
		 }
	 
	 public static State[] getStateArray()
	 {
         if(states !=null)
             return states;
         states = new State[50];
		 states[0] = new State("Alabama", "Montgomery", "Birmingham", "Mobile", "AL.png");
		 states[1] = new State("Alaska", "Juneau", "Anchorage", "Fairbanks", "AK.png");
		 states[2] = new State ("Arizona", "Phoenix", "Tucson", "Mesa", "AZ.png");
		 states[3] = new State ("Arkansas", "Little Rock", "Fort Smith", "Fayetteville", "AR.png");
		 states[4] = new State ("California", "Sacramento", "Los Angeles", "San Diego", "CA.png");
		 states[5] = new State ("Colorado", "Denver", "Colorado Springs", "Aurora", "CO.png");
		 states[6] = new State ("Connecticut", "Hartford", "Bridgeport", "New Haven","CT.png");
		 states[7] = new State ("Delaware", "Dover", "Wilmington", "Neward", "DE.png");
		 states[8] = new State ("Florida", "Tallahassee", "Jacksonville", "Miami", "FL.png");
		 states[9] = new State ("Georgia", "Atlanta", "Augusta", "Columbus", "GA.png");
		 states[10] = new State ("Hawaii", "Honolulu", "Hilo", "Kailua", "HI.png");
		 states[11] = new State ("Idaho", "Boise", "Nampa", "Meridian", "ID.png");
		 states[12] = new State ("Illinois", "Springfield", "Chicago", "Aurora", "IL.png");
		 states[13] = new State ("Indiana", "Indianapolis", "Fort Wayne", "Evansville", "IN.png");
		 states[14] = new State ("Iowa", "Des Moines", "Cedar Rapids", "Davenport", "IA.png");
		 states[15] = new State ("Kansas", "Topeka", "Wichita", "Overland Park", "KS.png");
		 states[16] = new State ("Kentucky", "Frankfort", "Louisville", "Lexington", "KY.png");
		 states[17] = new State ("Louisiana", "Baton Rouge", "New Orleans", "Shreveport", "LA.png");
		 states[18] = new State ("Maine", "Augusta", "Portland", "Lewiston", "ME.png");
		 states[19] = new State ("Maryland", "Annapolis", "Baltimore", "Columbia", "MD.png");
		 states[20] = new State ("Massachusetts", "Boston", "Worcester", "Springfield", "MA.png");
		 states[21] = new State ("Michigan", "Lansing", "Detroit", "Grand Rapids", "MI.png");
		 states[22] = new State ("Minnesota", "St. Paul", "Minneapolis", "Rochester", "MN.png");
		 states[23] = new State ("Mississippi", "Jackson", "Gulfport", "Hattiesburg", "MS.png");
		 states[24] = new State ("Missouri", "Jefferson City", "Kansas City", "Saint Louis", "MO.png");
		 states[25] = new State ("Montana", "Helena", "Billings", "Missoula", "MT.png");
		 states[26] = new State ("Nebraska", "Lincoln", "Omaha", "Bellevue", "NE.png");
		 states[27] = new State ("Nevada", "Carson City", "Las Vegas", "Henderson", "NV.png");
		 states[28] = new State ("New Hampshire", "Concord", "Manchester", "Nashua", "NH.png");
		 states[29] = new State ("New Jersey", "Trenton", "Newark", "Jersey City", "NJ.png");
		 states[30] = new State ("New Mexico", "Santa Fe", "Albuquerque", "Las Cruces", "NM.png");
		 states[31] = new State ("New York", "Albany", "New York City", "Buffalo", "NY.png");
		 states[32] = new State ("North Carolina", "Raleigh", "Charlotte", "Greensboro", "NC.png");
		 states[33] = new State ("North Dakota", "Bismark", "Fargo", "Grand Forks", "ND.png");
		 states[34] = new State ("Ohio", "Columbus", "Cleveland", "Cincinnati", "OH.png");
		 states[35] = new State ("Oklahoma", "Oklahoma City", "Tulsa", "Norman", "OK.png");
		 states[36] = new State ("Oregon", "Salem", "Portland", "Eugene", "OR.png");
		 states[37] = new State ("Pennsylvania", "Harrisburg", "Philadelphia", "Pittsburg", "PA.png");
		 states[38] = new State ("Rhode Island", "Providence", "Warwick", "Cranston", "RI.png");
		 states[39] = new State ("South Carolina", "Columbia", "Charleston", "North Charleston", "SC.png");
		 states[40] = new State ("South Dakota", "Pierre", "Sioux Falls", "Rapid City", "SD.png");
		 states[41] = new State ("Tennesee", "Nashville", "Memphis", "Knoxville", "TN.png");
		 states[42] = new State ("Texas", "Austin", "Houston", "San Antonio", "TX.png");
		 states[43] = new State ("Utah", "Salt Lake City", "West Valley City", "Provo", "UT.png");
		 states[44] = new State ("Vermont", "Montpelier", "Burlington", "Essex", "VT.png");
		 states[45] = new State ("Virginia", "Richmond", "Virginia Beach", "Norfolk", "VA.png");
		 states[46] = new State ("Washington", "Olympia", "Seattle", "Spokane", "WA.png");
		 states[47] = new State ("West Virginia", "Charleston", "Huntington", "Parkersburg", "WV.png");
		 states[48] = new State ("Wisconsin", "Madison", "Milwaukee", "Green Bay", "WI.png");
		 states[49] = new State ("Wyoming", "Cheyenne", "Casper", "Laramie", "WY.png");
         return states;
	 }
}