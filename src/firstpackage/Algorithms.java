package firstpackage;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import uk.ac.shef.wit.simmetrics.SimpleExample;
import uk.ac.shef.wit.simmetrics.similaritymetrics.ChapmanLengthDeviation;
import uk.ac.shef.wit.simmetrics.similaritymetrics.EuclideanDistance;
import uk.ac.shef.wit.simmetrics.similaritymetrics.JaccardSimilarityTest;
import uk.ac.shef.wit.simmetrics.similaritymetrics.JaroWinkler;   


public class Algorithms {
	public static void main (String args[]){
	
		ChapmanLengthDeviation chapmanLengthDeviation = new ChapmanLengthDeviation();
		
		System.out.println(chapmanLengthDeviation.getUnNormalisedSimilarity("fiken", "ficken"));
	
	
	
		
	
	}

}
