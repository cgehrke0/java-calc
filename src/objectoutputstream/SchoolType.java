package objectoutputstream;

public class SchoolType {
	
	private String type;
	private String duration;
	
	public SchoolType() {
		
	}
	
	public SchoolType(SchoolType schoolType) {
		this.type = schoolType.getType();
		this.duration = schoolType.getDuration();
	}

	@Override
	public String toString() {
		return "SchoolType [type=" + type + ", duration=" + duration + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
