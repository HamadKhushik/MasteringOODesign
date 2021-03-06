package builderPatternExample;

/**
 * @author Hammad: 19-Feb-2022
 */
public class User {
	private String userName; // mandatory
	private String emailAddress; // mandatory

	private String firstName; // optional
	private String lastName; // optional
	private int phoneNumber; // optional
	private String address; // optional

	private User(Builder builder) {
		this.userName = builder.userName;
		this.emailAddress = builder.emailAddress;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
	}

	@Override
	public String toString() {
		return "User [userName= " + userName + ", emailAddress= " + emailAddress + ", firstName= " + firstName
				+ ", lastName= " + lastName + ", phoneNumber= " + phoneNumber + ", address= " + address;
	}

	public static class Builder {

		private String userName; // mandatory
		private String emailAddress; // mandatory

		private String firstName; // optional
		private String lastName; // optional
		private int phoneNumber; // optional
		private String address; // optional

		public Builder(String userName, String emailAddress) {
			this.userName = userName;
			this.emailAddress = emailAddress;
		}

		public Builder firstName(String value) {
			this.firstName = value;
			return this;
		}

		public Builder lastName(String value) {
			this.lastName = value;
			return this;
		}

		public Builder phoneNumber(int value) {
			this.phoneNumber = value;
			return this;
		}

		public Builder address(String value) {
			this.address = value;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}
}
