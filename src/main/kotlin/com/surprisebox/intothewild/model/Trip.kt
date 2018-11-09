package com.surprisebox.intothewild.model

import javax.persistence.*

@Entity
class Trip(@Id
           @GeneratedValue
           val id: Long = 0L, val name: String,
           val description: String = "",
           @OneToMany(fetch = FetchType.LAZY, mappedBy = "trip")
           @JoinColumn(nullable = true)
           val plans: Collection<Plan>? = null){

}