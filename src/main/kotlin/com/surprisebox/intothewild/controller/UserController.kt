package com.surprisebox.intothewild.controller

import com.surprisebox.intothewild.dto.UserDTO
import com.surprisebox.intothewild.mapstruct.MapUser
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

    @Autowired
    lateinit var mapUser: MapUser

    @PostMapping
    fun add(@RequestBody userDTO: UserDTO) : HttpEntity<UserDTO>{
        val user = mapUser.toModel(userDTO)
        val newUser = mapUser.toDTO(serviceUser.save(user))

        return ResponseEntity(newUser, HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable( "id") id: Long) : HttpEntity<UserDTO> {
        val user = serviceUser.findById(id)
        return HttpEntity(mapUser.toDTO(user))
    }


    @PostMapping("/{id}/trips")
    fun addTrip(@PathVariable("id") id: Long, @RequestBody trip: Trip) : HttpEntity<Trip>{
        return ResponseEntity(serviceTrip.save(trip, User(id)), HttpStatus.CREATED)
    }
}