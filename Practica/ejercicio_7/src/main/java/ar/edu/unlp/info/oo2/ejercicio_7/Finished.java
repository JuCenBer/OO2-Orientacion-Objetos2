package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;

public class Finished extends ToDoItemState{

	public Finished(ToDoItem task) {
		super(task);
	}
	
	@Override
	public void start() {		
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("ERROR: The task must be Paused or In-Progress");				
	}

	@Override
	public void finish() {		
	}
	
	@Override
	public void addComment(String comment) {
	}

}
