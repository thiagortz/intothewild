package com.surprisebox.intothewild.mapstruct

import com.surprisebox.intothewild.dto.UserDTO
import com.surprisebox.intothewild.model.User
import org.springframework.stereotype.Component

@Component
class MapUser : Mapper<UserDTO, User>{

    override fun toModel(element: UserDTO): User =
            User(name = element.name,
                    email = element.email,
                    password = element.password)

    override fun toDTO(element: User): UserDTO =
            UserDTO(id = element.id,
                    name = element.name,
                    email = element.email,
                    password = element.password)

}