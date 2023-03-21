package com.example.practice14.controller;

import com.example.practice14.entity.Bank;
import com.example.practice14.entity.Card;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/bank")
public class BankController {
    private ArrayList<Bank> banks = new ArrayList<>();

    @PostMapping(value = "/")
    @ResponseBody
    public String add(@RequestBody Bank bank) {
        banks.add(bank);
        return "successful added";
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public String delete(@PathVariable String id) {
        return banks.removeIf((d) -> d.getName().equals(id))
                ? "successful delete"
                : "record not found";

    }

    @GetMapping(value = "/list")
    @ResponseBody
    public List<Bank> all() {
        return banks;
    }
}
