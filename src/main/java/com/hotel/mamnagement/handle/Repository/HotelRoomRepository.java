package com.hotel.mamnagement.handle.Repository;

import com.hotel.mamnagement.handle.Enitiy.HotelRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRoomRepository extends JpaRepository<HotelRoom, Integer> {
}
