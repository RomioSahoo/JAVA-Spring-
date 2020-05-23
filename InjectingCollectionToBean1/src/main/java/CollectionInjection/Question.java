package CollectionInjection;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<Answers> answers;

	public Question() {}
	public Question(int id, String name, List<Answers> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void display() {
	System.out.println(id+"\t"+name);
	System.out.println("answers are");
	Iterator<Answers> itr=answers.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
			
	}

}