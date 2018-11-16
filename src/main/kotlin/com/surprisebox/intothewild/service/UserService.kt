package com.surprisebox.intothewild.service

import com.surprisebox.intothewild.model.User
import com.surprisebox.intothewild.repository.TripRepository
import com.surprisebox.intothewild.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService{

    @Autowired
    lateinit var repository: UserRepository


    fun save(user: User): User{
        return repository.save(user)
    }

    fun findById(id: Long): User {
        return repository.findById(id).get()
    }

}