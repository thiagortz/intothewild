package com.surprisebox.intothewild.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToMany

@Entity
class User(@Id
           @GeneratedValue
           val id: Long = 0L,
           val name: String = "",
           val email: String = "",
           @JsonIgnoreProperties(allowGetters = true)
           val password: String = "",
           @JsonInclude(JsonInclude.Include.NON_NULL)
           @ManyToMany
           var trips: Collection<Trip>? = null){}