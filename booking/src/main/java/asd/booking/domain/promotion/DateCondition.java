package asd.booking.domain.promotion;

import asd.booking.domain.trip.Trip;

import java.time.LocalDate;

public class DateCondition implements Condition {

    private Integer id;
    private String name;
    private LocalDate bd;
    private LocalDate ed;

    public DateCondition(Integer id, String name, LocalDate bd, LocalDate ed) {
        this.id = id;
        this.name = name;
        this.bd = bd;
        this.ed = ed;
    }

    @Override
    public boolean match(Trip trip) {
        if (trip.getBookedDate().isAfter(bd) && trip.getBookedDate().isBefore(ed)) {
            return true;
        } else {
            return false;
        }
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBd() {
        return bd;
    }

    public LocalDate getEd() {
        return ed;
    }
}
