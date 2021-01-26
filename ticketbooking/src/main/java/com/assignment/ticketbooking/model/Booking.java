package com.assignment.ticketbooking.model;

public class Booking {
    private int bookingId;
    private int userId;
    private int rowno;
    private int seatno;
    private int amount;
    private PaymentStatus status_of_payment;

    public Booking(int bookingId, int userId, int rowno, int seatno, int amount, PaymentStatus status_of_payment) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.rowno = rowno;
        this.seatno = seatno;
        this.amount = amount;
        this.status_of_payment = status_of_payment;
    }

    public Booking() {
    }

    /**
     * @return int return the bookingId
     */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * @param bookingId the bookingId to set
     */
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    /**
     * @return int return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return int return the rowno
     */
    public int getRowno() {
        return rowno;
    }

    /**
     * @param rowno the rowno to set
     */
    public void setRowno(int rowno) {
        this.rowno = rowno;
    }

    /**
     * @return int return the seatno
     */
    public int getSeatno() {
        return seatno;
    }

    /**
     * @param seatno the seatno to set
     */
    public void setSeatno(int seatno) {
        this.seatno = seatno;
    }

    /**
     * @return int return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return PaymentStatus return the status_of_payment
     */
    public PaymentStatus getStatus_of_payment() {
        return status_of_payment;
    }

    /**
     * @param status_of_payment the status_of_payment to set
     */
    public void setStatus_of_payment(PaymentStatus status_of_payment) {
        this.status_of_payment = status_of_payment;
    }

}