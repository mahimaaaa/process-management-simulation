/*
  	Midterm Project
  	Name: Mahima Shukla
   
*/
public class Process {
	private Integer id, priority, timeRemaining, timeTotal = 0, timeInitiallyWaiting = 0, timeWaiting = 0,
			requestedTime;

	public Process(Integer id, Integer timeRemaining, Integer priority) {
		this.id = id;
		this.timeRemaining = timeRemaining;
		this.timeTotal = timeRemaining;
		this.priority = priority;
	}

	public Process(Integer id, Integer timeRemaining, Integer priority, Integer requestedTime) {
		this.id = id;
		this.timeRemaining = timeRemaining;
		this.timeTotal = timeRemaining;
		this.priority = priority;
		this.requestedTime = requestedTime;
	}

	public Process(Process rhs) {
		this.id = rhs.getId();
		this.timeRemaining = rhs.getTimeRemaining();
		this.timeTotal = rhs.getTimeTotal();
		this.timeInitiallyWaiting = rhs.getTimeInitiallyWaiting();
		this.timeWaiting = rhs.getTimeWaiting();
		this.priority = rhs.getPriority();
		this.requestedTime = rhs.getRequestedTime();
	}

	public Integer getTimeRemaining() {
		return timeRemaining;
	}

	public Integer getTimeWaiting() {
		return timeWaiting;
	}

	public Integer getTimeInitiallyWaiting() {
		return timeInitiallyWaiting;
	}

	public Integer getTimeTotal() {
		return timeTotal;
	}

	public Integer getId() {
		return id;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public Integer getRequestedTime() {
		return this.requestedTime;
	}

	public void run() {
		if (timeRemaining == timeTotal) {
			// The process just started
			timeInitiallyWaiting = timeWaiting;
		}
		timeRemaining--;
	}

	public void pause() {
		timeWaiting++;
	}

	public void reset() {
		timeRemaining = timeTotal;
		timeWaiting = 0;
		timeInitiallyWaiting = 0;
	}

	public void setTimeTotal() {
		timeTotal += timeWaiting;
	}
}
