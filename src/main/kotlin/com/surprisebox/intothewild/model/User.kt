package com.surprisebox.intothewild.model

import javax.persistence.*

@Entity
class User(@Id
           @GeneratedValue
           val id: Long = 0L,
           val name: String = "",
           val email: String = "",
           val password: String = "",
           @ManyToMany(fetch = FetchType.EAGER, mappedBy = "users")
           var trips: Collection<Trip>? = null){}