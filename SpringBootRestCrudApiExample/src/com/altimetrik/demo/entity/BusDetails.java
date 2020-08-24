package com.altimetrik.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bus_details")
@JsonIgnoreProperties(
        value = {"created_date", "updated_date"},
        allowGetters = true
)
public class BusDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "id", unique = true, nullable = false)
	private long id;

	@Column(name="bus_no")
	private String busNo;
	
	@Column(name="travels_name")
	private String travelsName;
	
	@Column(name="price")
	private float price;
	
	@Column(name="arrival_time")
	private String arrivalTime;
	
	@Column(name="departure_time")
	private String departureTime;
	
	@Column(name="duration")
	private String duration;

	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;

	@Column(name = "seats")
	private int seats;
	
    @Column(name="created_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdDate;

    @Column(name="updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedDate;
    
	public long getID() {
		return this.id;
	}

	public void setID(long id) {
		this.id = id;
	}

	public String getBusNo() {
		return this.busNo;
	}

	public void setBusNo(String num) {
		this.busNo = num;
	}

	public String getTravelsName() {
		return this.travelsName;
	}

	public void setTravelsName(String name) {
		this.travelsName = name;
	}

	public String getArrivalTime() {
		return this.arrivalTime;
	}

	public void setArrivalTime(String time) {
		this.arrivalTime = time;
	}
	
	public String getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(String time) {
		this.departureTime = time;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public int getSeats() {
		return this.seats;
	}

	public void setSeats(int num) {
		this.seats = num;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}	

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedAt(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

	@Override
	public String toString() {
		return "BusDetails [id=" + this.id + ", busNo=" + this.busNo + ", TravelsName=" + this.travelsName + ", Seats="
				+ this.seats + ", source=" + this.source + ", destination=" + this.destination + ", departureTime=" + departureTime
				+ ", arrivalTime=" + this.arrivalTime + ", duration=" + this.duration + ", createdDate=" + this.createdDate + ", updatedDate=" + this.updatedDate + "]";
	}

	
}