package com.yourcompany.repository;

import com.yourcompany.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // Here, we can add custom database queries if needed
}
