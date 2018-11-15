package com.surprisebox.intothewild.model

import javax.persistence.*

@Entity
class Tour(@Id
           @GeneratedValue
           val id: Long = 0L,
           val name: String,
           val description: String = "",
           val amount: Number,
           @ManyToOne(fetch = FetchType.LAZY)
           val place: Place){

}