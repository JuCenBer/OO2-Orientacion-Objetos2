package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;

public abstract class ToDoItemState {

	private ToDoItem task;
	
	public ToDoItemState(ToDoItem task) {
		this.task = task;
	}
	
	public ToDoItem getTask() {
		return task;
	}

	public void setTask(ToDoItem task) {
		this.task = task;
	}

	public abstract void start();
    
    public abstract void togglePause();

    public abstract void finish();

    public Duration workedTime() {
    	return Duration.between(this.getTask().getStart(), this.getTask().getEnd());
    }
    
    public abstract void addComment(String comment);
}
