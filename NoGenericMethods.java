
public class NoGenericMethods<T> {

	
	private String name;
	private String surname;
	private String nickname;
	
	public NoGenericMethods(String name, String surname, String nickname) {
		this.name = name;
		this.surname = surname;
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getNickname() {
		return nickname;
	}


	
}
