package test0822;

public class BoardVo { // board 게시판, Vo(value object) 같은 의미로 DTO (Data transfer object)
	
	private String subject; // 게시판 제목을 담는 멤버변수 (멤버 변수는 초기화하지 않아도 자동초기화 된다.)
	private String contents; // 게시판의 내용을 담는 멤버변수
	private int bidx; // 게시판 자동생성 고유번호
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getBidx() {
		return bidx;
	}
	public void setBidx(int bidx) {
		this.bidx = bidx;
	}
	
	
	
	
	

}
