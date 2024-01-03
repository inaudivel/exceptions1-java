package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
	
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;
	
	public Reservation() {
	}
	
	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}
	
	public Integer duration() {
		return checkout.getDayOfMonth() - checkin.getDayOfMonth();
	}
	
	public void updateDates(LocalDate checkin, LocalDate checkout) {
		this.checkin = checkin; 
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ checkin.format(fmt1)
				+ ", check-out: "
				+ checkout.format(fmt1)
				+ ", "
				+ duration()
				+ " nights";
	}
	

}
