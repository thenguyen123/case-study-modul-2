package services.impl;

import model.Booking;
import services.IService;

import java.util.ArrayList;
import java.util.List;

public class RoomServiceImpl implements IService {
    List<Booking> list = new ArrayList<>();

    @Override
    public List disPlay() {
        return list;

    }

    public void addBooking(Booking booking) {
        list.add(booking);
    }
}
