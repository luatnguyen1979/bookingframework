package usa.edu.mum.asd.labs.lab9.strategy;

import java.util.List;

public class Flight {

    private final List<Seat> seatList;
    private final int totalSeat;

    public Flight(List<Seat> seatList, int totalSeat) {
        this.seatList = seatList;
        this.totalSeat = totalSeat;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public int getTotalSeat() {
        return totalSeat;
    }
}
