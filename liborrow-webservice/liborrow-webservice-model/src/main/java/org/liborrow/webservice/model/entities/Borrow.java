package org.liborrow.webservice.model.entities;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

@Entity(name="Borrow")
public class Borrow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "borrow_id", updatable = false, nullable = false)
	private long id;
	
	@Column(name="startdate")
	private Date startDate;
	
	private Date endDate;
	
	@Column(name="getbackdate")
	private Date getBackDate;
	
	@Column(name="extended")
	private Boolean extended;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
	private UserLight borrower;
	
//	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "item_id")
	private Item item;
	
	public Borrow() {}
	
	public Borrow(Date startDate, Date getBackDate, Boolean extended, UserAccount borrower)
	{
		this.startDate=startDate;
		this.getBackDate=getBackDate;
		this.extended=extended;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		if(this.extended)
		{
			calendar.set(Calendar.MONTH, (calendar.get(Calendar.MONTH+1)));
		}else {
			calendar.set(Calendar.MONTH, (calendar.get(Calendar.MONTH+2)));
		}
		this.endDate = calendar.getTime();
		//this.borrower=borrower;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getGetBackDate() {
		return getBackDate;
	}

	public void setGetBackDate(Date getBackDate) {
		this.getBackDate = getBackDate;
	}

	public Boolean getExtended() {
		return extended;
	}

	public void setExtended(Boolean extended) {
		this.extended = extended;
	}

	public UserLight getBorrower() {
		return borrower;
	}

	public void setBorrower(UserLight borrower) {
		this.borrower = borrower;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
