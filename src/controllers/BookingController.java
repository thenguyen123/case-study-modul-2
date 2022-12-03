package controllers;

import model.Booking;
import services.impl.BookingServiceImpl;

import java.util.List;

public class BookingController {
BookingServiceImpl bookingService=new BookingServiceImpl();

    public List<Booking> disPlay() {
        return bookingService.disPlay();
    }


    public void addBooking(Booking booking) {
bookingService.addBooking(booking);
    }
}
