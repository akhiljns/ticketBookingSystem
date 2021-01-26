package com.assignment.ticketbooking.model;

public class Seat {
    private int rowNo;
    private int seatno;

    /**
     * @return int return the rowNo
     */
    public int getRowNo() {
        return rowNo;
    }

    /**
     * @param rowNo the rowNo to set
     */
    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
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

    public Seat(int rowNo, int seatno) {
        this.rowNo = rowNo;
        this.seatno = seatno;
    }

    public Seat() {
    }

}