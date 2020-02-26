package ConsumerLab;
import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		
		//test sentval
		System.out.print("Sentiment Value Tests:");
		System.out.println(Review.sentimentVal("mellow"));
		System.out.println(Review.sentimentVal("joyful"));
		System.out.println(Review.sentimentVal("bizarre"));
		System.out.println(Review.sentimentVal("catastrophic"));
		System.out.println();
		//test totalSentiment
		System.out.println("Total Simple Sentiment Value: " + Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
		System.out.println("Total 26 West Sentiment Value: " + Review.totalSentiment("src/ConsumerLab/26WestReview.txt"));
		System.out.println();
		
		//stars
		System.out.println("Simple Star Rating: " + Review.starRating("src/ConsumerLab/simpleReview.txt"));
		System.out.println("26 West Star Rating: " + Review.starRating("src/ConsumerLab/26WestReview.txt"));
		System.out.println();
		
		//fake
		System.out.println("Fake Simple Review: " + Review.fakeReview("src/ConsumerLab/simpleReview.txt", false));
		
	}	
}