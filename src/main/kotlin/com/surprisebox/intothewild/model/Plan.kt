package com.surprisebox.intothewild.model

import javax.persistence.*

@Entity
class Plan(@Id
           @GeneratedValue
           val id: Long = 0L,
           val name: String, val description: String = "",
           val places: Collection<Place>? = null,
           val days: Int,
           @ManyToOne(fetch = FetchType.LAZY)
           @JoinColumn(name = "trip_id", nullable = false)
           val trip: Trip){

}