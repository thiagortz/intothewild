package com.surprisebox.intothewild.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
class Trip(@Id
           @GeneratedValue
           val id: Long = 0L,
           val name: String,
           val description: String = "",
           @OneToMany(fetch = FetchType.LAZY, mappedBy = "trip")
           var plans: Collection<Plan>? = null,
           @ManyToMany(mappedBy = "trips")
           @JsonIgnore
           var users: Collection<User>? = null){

}