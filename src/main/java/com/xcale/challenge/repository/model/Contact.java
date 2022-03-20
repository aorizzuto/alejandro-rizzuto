package com.xcale.challenge.repository.model;

import com.xcale.challenge.dto.ContactDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "prices")
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private Integer name;

    @Column(name = "phone_number")
    private String phoneNumber;

    public ContactDTO toDTO() {
        return new ContactDTO(id, name, phoneNumber);
    }
}