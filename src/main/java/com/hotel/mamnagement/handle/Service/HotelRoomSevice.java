package com.hotel.mamnagement.handle.Service;

import com.hotel.mamnagement.handle.Enitiy.Employee;
import com.hotel.mamnagement.handle.Enitiy.HotelRoom;
import com.hotel.mamnagement.handle.Repository.HotelRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelRoomSevice
{
    @Autowired
    private HotelRoomRepository hotelRoomRepository;
    public HotelRoom addHotelRoom(HotelRoom hotelRoom)
    {
        HotelRoom room = hotelRoomRepository.save(hotelRoom);

        return room;

    }

    public List<HotelRoom> fetchAllRoom()
    {
        List<HotelRoom> allRooms = hotelRoomRepository.findAll();

        return allRooms;
    }

    public HotelRoom fetchRoomByNumber(Integer roomNum)
    {
        HotelRoom hotelRoom = hotelRoomRepository.findById(roomNum).get();

        return hotelRoom;
    }
}
