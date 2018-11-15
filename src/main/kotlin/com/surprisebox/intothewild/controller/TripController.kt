package com.surprisebox.intothewild.controller

import com.surprisebox.intothewild.model.Trip
import com.surprisebox.intothewild.repository.TripRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("trips")
class TripController{

    @Autowired
    lateinit var repository: TripRepository

}