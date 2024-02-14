
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NoGenericMethods <String> person = new NoGenericMethods<String>("Pedro", "Gonzalez", "Pepe");
     NoGenericMethods<String> account = new NoGenericMethods<String>("1", "245", "678");
     NoGenericMethods<String> charity = new  NoGenericMethods<String>("0.1", "0.235", "0.678");
     
     System.out.println(person.getName() + " " + person.getSurname() + " " + person.getNickname());
     System.out.println(account.getName() + " " + account.getSurname() + " " + account.getNickname());
     System.out.println(charity.getName() + " " + charity.getSurname() + " " + charity.getNickname());
	}

}
