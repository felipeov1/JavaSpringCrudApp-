package com.projectapi.api_crud.repositories;

import com.projectapi.api_crud.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
