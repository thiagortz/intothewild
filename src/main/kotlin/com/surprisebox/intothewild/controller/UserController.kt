package com.surprisebox.intothewild.controller

import com.surprisebox.intothewild.model.Trip
import com.surprisebox.intothewild.model.User
import com.surprisebox.intothewild.repository.TripRepository
import com.surprisebox.intothewild.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController{

    @Autowired
    lateinit var tripRepository: TripRepository

    @Autowired
    lateinit var userRepository: UserRepository

    @PostMapping
    fun add(@RequestBody user: User) : HttpEntity<User>{
        return HttpEntity(userRepository.save(user))
    }

    @PostMapping("/{id}/trips")
    fun addTrip(@PathVariable("id") id: Long, @RequestBody trip: Trip) : HttpEntity<Trip>{
        trip.users = listOf(User(id))
        return HttpEntity(tripRepository.save(trip))
    }
}