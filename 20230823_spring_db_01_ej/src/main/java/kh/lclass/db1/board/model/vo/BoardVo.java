package kh.lclass.db1.board.model.vo;

public class BoardVo {

	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriteDate;
	private String mid;
	private int bref;
	private int breLevel;
	private int breStep;
	
	@Override
	public String toString() {
		return "BoardVo [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriteDate=" + bwriteDate
				+ ", mid=" + mid + ", bref=" + bref + ", breLevel=" + breLevel + ", breStep=" + breStep + "]";
	}

	public BoardVo(int bno, String btitle, String bcontent, String bwriteDate, String mid, int bref, int breLevel,
			int breStep) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriteDate = bwriteDate;
		this.mid = mid;
		this.bref = bref;
		this.breLevel = breLevel;
		this.breStep = breStep;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBwriteDate() {
		return bwriteDate;
	}

	public void setBwriteDate(String bwriteDate) {
		this.bwriteDate = bwriteDate;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public int getBref() {
		return bref;
	}

	public void setBref(int bref) {
		this.bref = bref;
	}

	public int getBreLevel() {
		return breLevel;
	}

	public void setBreLevel(int breLevel) {
		this.breLevel = breLevel;
	}

	public int getBreStep() {
		return breStep;
	}

	public void setBreStep(int breStep) {
		this.breStep = breStep;
	}
}


