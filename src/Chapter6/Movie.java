package Chapter6;

public class Movie implements Show {

	private String aTitle;
	private int aYear;
	private int aRunningTime;

	public Movie(String pTitle, int pYear, int pRunningTime) {
		aTitle = pTitle;
		aYear = pYear;
		aRunningTime = pRunningTime;
	}

	@Override
	public String description() {
		return aTitle + " (" + aYear + ")";
	}

	@Override
	public int runningTime() {
		return aRunningTime;
	}

	@Override
	public Show copy() {
		return new Movie(aTitle, aYear, aRunningTime);
	}
}
