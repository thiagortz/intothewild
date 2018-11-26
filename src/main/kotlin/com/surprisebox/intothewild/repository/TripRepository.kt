package com.surprisebox.intothewild.repository

import com.surprisebox.intothewild.model.Trip
import org.springframework.data.repository.CrudRepository

interface TripRepository : CrudRepository<Trip, Long> {

    fun findByUsersId(usersId: Long): Collection<Trip>
}