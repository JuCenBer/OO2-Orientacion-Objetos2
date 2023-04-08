package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.LocalDate;

public class InProgress extends ToDoItemState{

	public InProgress(ToDoItem task) {
		super(task);
	}
	
	@Override
	public void start() {		
	}

	@Override
	public void togglePause() {
		this.getTask().setState(new Paused(this.getTask()));
	}

	@Override
	public void finish() {
		this.getTask().setState(new Finished(this.getTask()));
		this.getTask().setEnd(LocalDate.now());
	}

	@Override
	public void addComment(String comment) {
		this.getTask().getComments().add(comment);
	}

}
