package com.surprisebox.intothewild.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Accommodation(@Id
                    @GeneratedValue
                    val id: Long = 0L){

}