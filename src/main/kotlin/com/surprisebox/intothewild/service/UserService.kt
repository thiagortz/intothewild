package com.surprisebox.intothewild.service

import com.surprisebox.intothewild.dto.UserDTO
import com.surprisebox.intothewild.mapstruct.MapUser
import com.surprisebox.intothewild.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService{

    @Autowired
    lateinit var repository: UserRepository

    @Autowired
    lateinit var mapper: MapUser

    fun save(user: UserDTO): UserDTO{
        return mapper.toDTO(repository.save(mapper.toModel(user)))
    }

    fun findById(id: Long): UserDTO {
        return mapper.toDTO(repository.findById(id).get())
    }

}