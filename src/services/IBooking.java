package services;

import model.Booking;

import java.util.List;

public interface IBooking extends IService{
    @Override
    List<Booking> disPlay();
    void addBooking(Booking booking);
}
