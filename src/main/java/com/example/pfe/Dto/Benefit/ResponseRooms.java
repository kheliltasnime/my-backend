package com.example.pfe.Dto.Benefit;

import com.example.pfe.Entities.Rooms;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseRooms {
    Long id;
    String name;
    String type;
    String location;
    String maintenance_status;
    Integer capacity;
    Long benefitId;
    private Instant createdAt;
    private Instant updatedAt;
    private String state;
    private ResponseBenefit benefit;
    private String category="Rooms";
    private String Reservation_State;
    private  String occupied;
    private String  free;
    private String Description;
    public static ResponseRooms makeRooms(Rooms rooms){
        return ResponseRooms.builder()
                .id(rooms.getId())
                .name(rooms.getName())
                .type(rooms.getType())
                .location(rooms.getLocation())
                .maintenance_status(rooms.getMaintenance_status())
                .capacity(rooms.getCapacity())
                .category(rooms.getCategory())
                .state(rooms.getState())
                .free(rooms.getFree())
                .occupied(rooms.getOccupied())
                .Description(rooms.getDescription())
                .benefit(ResponseBenefit.makeBenefit(rooms.getBenefit()))
                .createdAt(rooms.getCreatedAt())
                .updatedAt(rooms.getUpdatedAt())
                .build();
    }

}
