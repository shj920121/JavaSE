package vo;

import java.util.Objects;

// ctrl shift f 
public class StudentVO {
	//학번 이름 학과명 평점
	private String studentNo;
	private String studentName;
	private String major;
	private double score;
	//생성자, 전체필드 초기화
	public StudentVO(String studentNo, String studentName, String major, double score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.major = major;
		this.score = score;
	}
	//set/get
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	//toString --> 학번 이름 학과명 평점
	@Override
	
	//출력하는것을 문자열로 변환
	public String toString() {
		return String.format("%10s %10s %10s %.2f", studentNo,studentName,major,score);
	}
	//hashCode & equals --> 겹치면 안되는 학번으로 비교하기때문에 학번만
	@Override
	public int hashCode() {
		return Objects.hash(studentNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof StudentVO))
			return false;
		StudentVO other = (StudentVO) obj;
		return Objects.equals(studentNo, other.studentNo);
	}
	
	
	
	
}