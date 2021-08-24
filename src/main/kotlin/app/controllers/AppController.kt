package app.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class AppController {

    @GetMapping("/onboard/user/last-update")
    fun mockGet(): ResponseEntity<Any> {
      return ResponseEntity("{\n" +
              "\"md5\":\"The API is mock of localhost:8080\"\n" +
              "}", HttpStatus.OK)

    }
}