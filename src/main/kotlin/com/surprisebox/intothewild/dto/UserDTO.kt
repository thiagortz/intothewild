package com.surprisebox.intothewild.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(value = ["password"], allowSetters = true)
data class UserDTO(val id: Long = 0L, val name: String, val email: String, val password: String)