package com.surprisebox.intothewild.controller

import com.surprisebox.intothewild.dto.UserDTO
import com.surprisebox.intothewild.model.Trip
import com.surprisebox.intothewild.model.User
import com.surprisebox.intothewild.service.TripService
import com.surprisebox.intothewild.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController{

    @Autowired
    lateinit var serviceUser: UserService

    @Autowired
    lateinit var serviceTrip: TripService

    @PostMapping
    fun add(@RequestBody userDTO: UserDTO) : HttpEntity<UserDTO>{
        return ResponseEntity(serviceUser.save(userDTO), HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable( "id") id: Long) : HttpEntity<UserDTO> {
        return HttpEntity(serviceUser.findById(id))
    }


    @PostMapping("/{id}/trips")
    fun addTrip(@PathVariable("id") id: Long, @RequestBody trip: Trip) : HttpEntity<Trip>{
        return ResponseEntity(serviceTrip.save(trip, User(id)), HttpStatus.CREATED)
    }

}