package com.xcale.challenge.repository;

import com.xcale.challenge.repository.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContactsRepository extends JpaRepository<Contact, Long> {

    @Query("SELECT * FROM users usrs INNER JOIN groups grps ON grps.id = usrs.group_id WHERE group_id = id")
    List<Contact> findContactsByGroupId(String id);
}
