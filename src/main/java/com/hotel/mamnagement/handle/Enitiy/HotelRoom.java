package com.hotel.mamnagement.handle.Enitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class HotelRoom
{
    @Id
    private Integer roomNumber;

    private Double area;

    @NotNull
    private Double ratePerHour;

    @NotBlank
    private String status;

    private Integer floorNumber;

    private Date date = new Date();




}
