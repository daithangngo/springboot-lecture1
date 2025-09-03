package com.amigoscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//anything that exposes end points are Controlers/ requests
@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(1, "James", "js, node, react, tailwindcss"),
                new SoftwareEngineer(2, "Hanna", "java, spring, react, tailwindcss")

        );
    }
}
