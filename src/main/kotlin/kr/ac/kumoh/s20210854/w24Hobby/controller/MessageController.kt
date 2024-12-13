package kr.ac.kumoh.s20210854.w24Hobby.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/message")
class MessageController {
    @GetMapping
    @CrossOrigin(origins = ["http://localhost:3000"])
    fun getMessage() = mapOf("status" to "success")
}