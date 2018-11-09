package com.surprisebox.intothewild.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Place(@Id
            @GeneratedValue
            val id: Long = 0L,
            val name: String,
            val tours: Collection<Tour>? = null,
            val accommodations: Collection<Accommodation>? = null){




}