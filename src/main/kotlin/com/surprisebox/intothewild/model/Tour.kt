package com.surprisebox.intothewild.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Tour(@Id
           @GeneratedValue
           val id: Long = 0L,
           val name: String,
           val description: String = "",
           val amount: Number){

}