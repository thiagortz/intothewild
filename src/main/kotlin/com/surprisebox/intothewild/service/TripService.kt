package com.surprisebox.intothewild.service

import com.surprisebox.intothewild.model.Trip
import com.surprisebox.intothewild.model.User
import com.surprisebox.intothewild.repository.TripRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TripService{

    @Autowired
    lateinit var repository: TripRepository

    fun save(trip: Trip, user: User): Trip {
        trip.users = listOf(user)
        return repository.save(trip)
    }


}