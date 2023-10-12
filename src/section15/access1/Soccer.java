package section15.access1;

public class Soccer implements Cloneable {

	public String name; 		// 팀 이름
	public String location; 	// 지역
	public String since;		// 창단연도
	public String league;		// 리그
	
	public Soccer(
		String name,
		String location,
		String since,
		String leauge
		) 
	{
		this.name = name;
		this.location = location;
		this.since = since;
		this.league = league;
	}
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Object callClone() throws CloneNotSupportedException {
		return clone();
	}
}
