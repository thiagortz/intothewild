package com.surprisebox.intothewild.mapstruct

interface Mapper<D,  M> {

    fun toDTO(element : M) : D

    fun toModel(element : D) : M
}