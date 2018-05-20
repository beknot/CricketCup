import java.util.*;
public class Cricketcup {
	private int run;
	private int six;
	private int four;
	Random ran=new Random();
	public Cricketcup (int run,int six,int four) {
		this.run = run;
		this.six = six;
		this.four = four;
		this.ran = ran;
	}
	public void finalScore() {
		int out = ran.nextInt(10);
		System.out.println("Players out: "+out);

	}
}