import java.util.ArrayList;

public class VoteList {
	
	private ArrayList<Vote> vlist = new ArrayList<>();
	private int count = 0;
	
	public void addVote(Vote vote) {
		if(!vlist.contains(vote)) {
			vlist.add(vote);
			count++;
			System.out.println(vote + " Successfully added!");
		}else {
			System.out.println("Vote " + vote.getID() + " is a duplicate!");
		}
	}
	
	public void printList() {
		for(Vote v : vlist) {
			System.out.println(v);
		}
	}
	
	public int numYesRecall() {
		int numYes = 0;
		for(Vote v : vlist) {
			if(v.getRecall()) {
				numYes++;
			}
		}
		return numYes;	
	}
	
	public int numNoRecall() {
		int numNo = 0;
		for(Vote v : vlist) {
			if(!v.getRecall()) {
				numNo++;
			}
		}
		return numNo;	
	}
	
	public String isGavinRecalled() {
		int numYes = numYesRecall();
		int numNo = numNoRecall();
		
		if(numYes > numNo) {
			return "Yes.";
		}else {
			return "No.";
		}
	}
	
	public String tallyCandidates() {
		int numLarry = 0;
		int numKevinp = 0;
		int numKevinf = 0;
		int numJohn = 0;
		int none = 0;
		
		for(Vote v : vlist) {
			String test = v.getCandidate();
			switch(test) {
				case("Larry Elder"):
					numLarry++;
					break;
				case("Kevin Paffrath"):
					numKevinp++;
					break;
				case("John Cox"):
					numJohn++;
					break;
				case("Kevin Faulconer"):
					numKevinf++;
					break;
				case("no replacement"):
					none++;
					break;		
			}	
		}
		return "\n Votes for Larry Elder: " + numLarry + ".\n Votes for Kevin Paffrath: " + numKevinp + 
				".\n Votes for Kevin Faulconer: " + numKevinf + ".\n Votes for John Cox: " + numJohn +
				".\n Votes for no replacement: " + none + ".";
		}
		
		
		
	}
	


