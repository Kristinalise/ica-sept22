public class Vote {
	
	private boolean recall;
	private String candidate;
	private int iD;
	
	public Vote(boolean theRecall, String theCandidate, int theID) {
		recall = theRecall;
		candidate = theCandidate;
		iD = theID;
	}
	
	public boolean getRecall() {
		return recall;
	}
	
	public String getCandidate() {
		return candidate;
	}
	
	public int getID() {
		return iD;
	}
	
	public String toString() {
		String yesno;
		if(recall) {
			yesno = "yes";
		}else {
			yesno = "no";
		}
		return "Voter #" + iD + " voted " + yesno + " on recalling Gavin Newsom and voted for " +  candidate + ".";
	}
	
	public boolean equals(Object other){
		boolean same = false;
        if (other != null && other instanceof Vote){
            same = iD == (((Vote) other).getID());
        }
        return same;
	}
	

}
