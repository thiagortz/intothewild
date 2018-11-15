package com.surprisebox.intothewild.model

import javax.persistence.*

@Entity
class Plan(@Id
           @GeneratedValue
           val id: Long = 0L,
           val name: String, val description: String = "",
           val days: Int,
           @OneToMany(fetch = FetchType.LAZY, mappedBy = "plan")
           val places: Collection<Place>? = null,
           @ManyToOne(fetch = FetchType.LAZY)
           val trip: Trip){

}