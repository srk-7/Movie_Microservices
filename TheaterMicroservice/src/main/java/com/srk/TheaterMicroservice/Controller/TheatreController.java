package com.srk.TheaterMicroservice.Controller;

import com.srk.TheaterMicroservice.Model.Theater;
import com.srk.TheaterMicroservice.Service.TheaterService;
import com.srk.TheaterMicroservice.feign.TheaterResponse;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theatres")
public class TheatreController {

    @Autowired
    private TheaterService theaterService;

    @PostMapping("/add-theaters")
    public List<Theater> addTheaters(@RequestBody List<Theater> theaters){
        return theaterService.addTheaters(theaters);
    }

    @GetMapping("/user/{uid}")
    public List<TheaterResponse> getTheatrebyUid(@PathVariable int uid)
    {
        return theaterService.getTheatrebyUid(uid);
    }

}
