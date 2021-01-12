package fr.airpure.main.exceptions;

public class FavorisNotFoundException extends Exception {
	private String message;
	public FavorisNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
