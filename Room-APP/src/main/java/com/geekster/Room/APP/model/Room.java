package com.geekster.Room.APP.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name  = "OYO")
public class Room {

    @Id
    private Integer roomId;


    private Integer roomNumber;

    private Type roomType;

    @Column(name = "available")
    private boolean roomAvailable;


    private double roomPrice;
}

// @Entity annotation from JPA is used to create and modify the tables in database
// @Id is used to define the primary key for the database
// @Column(name = "available") is used to maintain the casing bcz the jpa converts all of them into SNAKE_CASE here
// the column name will be changed into available
// to change the table name we use (@Table(name = "your_table_name"))

