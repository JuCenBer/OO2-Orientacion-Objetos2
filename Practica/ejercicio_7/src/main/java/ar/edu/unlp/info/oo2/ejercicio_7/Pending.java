package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;
import java.time.LocalDate;

public class Pending extends ToDoItemState{

	public Pending(ToDoItem task) {
		super(task);
	}
	
	@Override
	public void start() {
		this.getTask().setState(new InProgress(this.getTask()));
		this.getTask().setStart(LocalDate.now());
		}

	@Override
	public void togglePause() {
		throw new RuntimeException("ERROR: The task must be Paused or In-Progress");				
	}

	@Override
	public void finish() {
	}

	@Override
	public Duration workedTime() {
		throw new RuntimeException("ERROR: The task never started");
	}

	@Override
	public void addComment(String comment) {
		this.getTask().getComments().add(comment);		
	}

}
