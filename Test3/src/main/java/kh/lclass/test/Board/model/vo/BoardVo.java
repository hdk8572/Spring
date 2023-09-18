package kh.lclass.test.Board.model.vo;

public class BoardVo {

	private int idx; // ��ȣ
	private String title; // ����
	private String content; // ����
	private String writer; // �ۼ���
	private String indate; // �ۼ���
	private int count; // ��ȸ��
	
	public BoardVo(int idx, String title, String content, String writer, String indate, int count) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.indate = indate;
		this.count = count;
	}
	
	public BoardVo(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	public BoardVo() {
		super();
	}

	// setter, getter
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
