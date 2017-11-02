package example;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PersonBean {
	
	private List<Person> persons = new ArrayList<>();
	
	public PersonBean() {
		persons.add(new Person("Bryan","Fury","bfury@mail.com",36));
		persons.add(new Person("Paul","Phoenix","pphoenix@mail.com",45));
		persons.add(new Person("Nina","Williams","nwilliams@mail.com",32));
		persons.add(new Person("Claudio","Seraphino","cseraphino@mail.com",36));
		persons.add(new Person("Eddy","Gordo","egordo@mail.com",42));
		persons.add(new Person("Jin","Kazama","jkazama@mail.com",27));
		persons.add(new Person("Marshall","Law","mlaw@mail.com",45));
		persons.add(new Person("Lee","Chaolan","lchaolan@mail.com",39));
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
}
