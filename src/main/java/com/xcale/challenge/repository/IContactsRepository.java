package com.xcale.challenge.repository;

import com.xcale.challenge.repository.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IContactsRepository extends JpaRepository<Contact, Long> {

    // In here Spring get contacts from "UserGroup" table and get all UserID that have GroupID as parameter
    // We also can create our own query to get same information
    @Query("SELECT * FROM users WHERE user_id = (SELECT user_id FROM usersGroups WHERE group_id = :id)")
    List<Contact> findContactsByGroupId(String id);
}
