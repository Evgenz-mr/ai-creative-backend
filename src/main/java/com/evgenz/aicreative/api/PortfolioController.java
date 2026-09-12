package com.evgenz.aicreative.api;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PortfolioController {

    @GetMapping("/profile")
    public Map<String, Object> profile() {
        return Map.of(
            "name", "Inga",
            "role", "AI Creative Director",
            "tagline", "Creative direction, AI visuals and cinematic stories."
        );
    }

    @GetMapping("/projects")
    public List<Map<String, Object>> projects() {
        return List.of(
            Map.of("slug", "cinematic-automotive", "title", "Cinematic Automotive", "type", "AI Film"),
            Map.of("slug", "editorial-worlds", "title", "Editorial Worlds", "type", "AI Visuals")
        );
    }
}
