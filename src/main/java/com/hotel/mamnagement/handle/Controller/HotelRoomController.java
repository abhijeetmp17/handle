package com.hotel.mamnagement.handle.Controller;
import com.hotel.mamnagement.handle.Enitiy.HotelRoom;
import com.hotel.mamnagement.handle.Service.HotelRoomSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hotel-room-data")
public class HotelRoomController
{
    @Autowired
    private HotelRoomSevice hotelRoomSevice;

    @PostMapping("/add")
    public ResponseEntity<HotelRoom> addHotelRoom(@RequestBody HotelRoom hotelRoom){

        HotelRoom room = hotelRoomSevice.addHotelRoom(hotelRoom);

        return new ResponseEntity<HotelRoom>(room , HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<HotelRoom>> getAllEmployee(){

        List<HotelRoom> hotelRooms =  hotelRoomSevice.fetchAllRoom();

        return  new ResponseEntity<List<HotelRoom>>(hotelRooms, HttpStatus.OK);
    }

    @GetMapping("/get/{roomNum}")
    public ResponseEntity<HotelRoom> getEmployeeById(@PathVariable Integer roomNum){

        HotelRoom room =  hotelRoomSevice.fetchRoomByNumber(roomNum);

        return  new ResponseEntity<HotelRoom>(room, HttpStatus.OK);
    }
}
