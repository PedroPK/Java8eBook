package javalang;

public class ExperimentalObject implements Cloneable {
	
	private String attribute;
	
	public ExperimentalObject(String pAttribute) {
		this.attribute = pAttribute;
	}

	@Override
	public ExperimentalObject clone() throws CloneNotSupportedException {
		ExperimentalObject clonedObject = (ExperimentalObject) super.clone();
		
		return clonedObject;
	}

	public String getAttribute() {
		return this.attribute;
	}

	public void setAttribute(String pAttribute) {
		this.attribute = pAttribute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attribute == null) ? 0 : attribute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		ExperimentalObject other = (ExperimentalObject) obj;
		
		if (attribute == null) {
			if (other.attribute != null)
				return false;
		} else if (!attribute.equals(other.attribute))
			return false;
		
		return true;
	}
	
}