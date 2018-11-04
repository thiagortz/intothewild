package com.surprisebox.intothewild.controller

import com.surprisebox.intothewild.model.Note
import com.surprisebox.intothewild.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("notes")
class NoteController {

    @Autowired
    lateinit var repoNote: NoteRepository

    @GetMapping
    fun list(): HttpEntity<List<Note>> = HttpEntity(repoNote.findAll().toList())

    @PostMapping
    fun add(@RequestBody note: Note): Note {
        return repoNote.save(note)

    }

}