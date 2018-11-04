package com.surprisebox.intothewild.repository

import com.surprisebox.intothewild.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long> {

    fun findByTitle(title: String): Iterable<Note>
}