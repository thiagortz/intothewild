package com.surprisebox.intothewild.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import javax.persistence.*

@Entity
class Trip(@Id
           @GeneratedValue
           val id: Long = 0L,
           val name: String,
           val description: String = "",
           @JsonInclude(JsonInclude.Include.NON_NULL)
           @OneToMany(fetch = FetchType.LAZY, mappedBy = "trip")
           var plans: Collection<Plan>? = null,
           @ManyToMany
           @JsonIgnore
           var users: Collection<User>? = null){

}