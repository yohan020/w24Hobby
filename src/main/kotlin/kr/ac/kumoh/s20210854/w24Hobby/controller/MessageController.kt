package kr.ac.kumoh.s20210854.w24Hobby.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
@CrossOrigin(origins = ["https://hobby2024frontend.netlify.app/"])
class MessageController {
    @GetMapping
    fun getRoot() = mapOf("status" to "success")
    @GetMapping("/api/message")
    fun getMessage() = mapOf("status" to "success")
}