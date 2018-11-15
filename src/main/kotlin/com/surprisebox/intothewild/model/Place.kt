package com.surprisebox.intothewild.model

import javax.persistence.*

@Entity
class Place(@Id
            @GeneratedValue
            val id: Long = 0L,
            val name: String,
            @ManyToOne(fetch = FetchType.LAZY)
            val plan: Plan,
            @OneToMany(fetch = FetchType.LAZY, mappedBy = "place")
            val tours: Collection<Tour>? = null,
            @OneToMany(fetch = FetchType.LAZY, mappedBy = "place")
            val accommodations: Collection<Accommodation>? = null){


}