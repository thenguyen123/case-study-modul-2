package services.impl;

import model.Booking;
import services.IBooking;

import java.util.ArrayList;
import java.util.List;

public class BookingServiceImpl implements IBooking {
    List<Booking> list = new ArrayList<>();

    @Override
    public List<Booking> disPlay() {
        return list;
    }

    @Override
    public void addBooking(Booking booking) {
        list.add(booking);
    }
}
