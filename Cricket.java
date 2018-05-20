import java.util.*;
public class Cricket {
	public static void main(String[] args) {
		int ball, totalRun1=0,totalRun2=0,over,i=1,k=1,run=2,six=1,four=3,toss;
		Random ran=new Random();
		String j="JRE",jre="JRE",coin="TAIL"; 
		Scanner sc = new Scanner(System.in);
		System.out.println(" ---------------------------------- ");
		System.out.println("| Welcome to Java Cricket Cup 2018 |");
		System.out.println(" ---------------------------------- ");
		System.out.println(" Team JRE vs Team JAR");
		toss = ran.nextInt(10);
		if(toss%2==0) { j="JAR"; coin="HEAD"; }
		System.out.println("Coin toss result: "+coin+". Opener team: " + j);
		System.out.println("\nHow many over you want to play");
		over = sc.nextInt();
			System.out.println("____________");
		System.out.println("Batting: "+j);
			System.out.println("_____________");
		while(i<=over){
			System.out.println("__________________________");
			System.out.println("Result of over "+i);
			i++;
			Cricketcup cc = new Cricketcup(run,six,four);
			cc.finalScore();
			System.out.println(" "+run+" runs -- "+six++ +" sixes -- "+four+" fours");
			totalRun1+=run+(six*6)+(four*4);
			System.out.println("Total run: "+totalRun1);
			System.out.println("__________________________");
		}
		System.out.println("____________");
		if(j=="JAR") {
		System.out.println("Batting: "+jre);
		}
		else {System.out.println("Batting: JAR");}
			System.out.println("____________");
		while(k<=over){
			System.out.println("______________________________");
			System.out.println("Result of over "+k);
			k++;
			Cricketcup cc = new Cricketcup(run,six,four);
			cc.finalScore();
			System.out.println(" "+run+" runs -- "+six++ +" sixes -- "+four+" fours");
			totalRun2+=run+(six*6)+(four*4);
			System.out.println("Total run: "+totalRun2);
			System.out.println("______________________________");

		}
			if(totalRun2>totalRun1)
				System.out.println("Team JRE won by "+(totalRun2-totalRun1)+" runs.");
			else
				System.out.println("Team JAR won by "+(totalRun1-totalRun2)+" runs.");
	}
}