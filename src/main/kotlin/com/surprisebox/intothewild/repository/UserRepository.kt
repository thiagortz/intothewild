package com.surprisebox.intothewild.repository

import com.surprisebox.intothewild.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {
}