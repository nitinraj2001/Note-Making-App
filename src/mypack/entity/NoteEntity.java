package mypack.entity;

import java.util.Date;

public class NoteEntity {
	
	private int user_id;
	
	private String title;
	
	private String content;
	
	private Date addedDate;



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public NoteEntity(String title, String content, Date addedDate) {
		
		super();
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
		
	}

	public NoteEntity() {
	
		super();
		
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	
	
	
	
	

}
