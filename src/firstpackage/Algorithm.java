package firstpackage;

import java.util.ArrayList;

import uk.ac.shef.wit.simmetrics.similaritymetrics.Soundex;

public class Algorithm {
	
 public float getAccuray(String name, ArrayList <csvItem> csvArrayList, ArrayList <String> staedteArrayList){
	 float soundexFloat =0;
	 int count =0;
	 
	 for (int i=0; i<csvArrayList.size();i++){
		 for (int y=0; y< staedteArrayList.size();y++){
		
	 switch(name){
	 
	 case "Soundex":
		 Soundex soundex = new Soundex ();
		  soundexFloat = soundex.getSimilarity(csvArrayList.get(i).getLocation().toLowerCase(), staedteArrayList.get(y).substring(1, staedteArrayList.get(y).length()-1));
		  
		  if(soundexFloat == 1){
			  count ++;
				 System.out.println(count);
				 }
		 
		 break;
	 
	
	 }
	 } 
		 
		 
		 
		 
		 
	 }
	
	 
	 
		return 0;
	}
	
 public String getDescription (String name){
	 
	return "";  
 }
}
