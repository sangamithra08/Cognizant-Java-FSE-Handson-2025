package com.cognizant.account;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AccountController {
    @GetMapping("/accounts/{number}")
    public Map<String, Object> getDetails(@PathVariable String number) {
        return Map.of("number", number, "type", "savings", "balance", 234343);
    }
}
