package model.entities;

public class User {
	private Integer logCode;

	public User(Integer logCode) {
		this.logCode = logCode;
	}

	public Integer getLogCode() {
		return logCode;
	}

	public void setLogCode(Integer logCode) {
		this.logCode = logCode;
	}

	public Integer printUser() {
		return getLogCode();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((logCode == null) ? 0 : logCode.hashCode());
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
		User other = (User) obj;
		if (logCode == null) {
			if (other.logCode != null)
				return false;
		} else if (!logCode.equals(other.logCode))
			return false;
		return true;
	}

}
