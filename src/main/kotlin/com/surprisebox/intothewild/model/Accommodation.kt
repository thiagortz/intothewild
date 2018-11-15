package com.surprisebox.intothewild.model

import javax.persistence.*

@Entity
class Accommodation(@Id
                    @GeneratedValue
                    val id: Long = 0L,
                    val price: Number,
                    val daily: Int,
                    @ManyToOne(fetch = FetchType.LAZY)
                    val place: Place){

}