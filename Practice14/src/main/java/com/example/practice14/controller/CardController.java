package com.example.practice14.controller;

import com.example.practice14.entity.Card;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/card")
public class CardController {
    private ArrayList<Card> cards = new ArrayList<>();

    @PostMapping(value = "/")
    @ResponseBody
    public String add(@RequestBody Card card) {
        cards.add(card);
        return "successful added";
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public String delete(@PathVariable Long id) {
        return cards.removeIf((d) -> d.getCardNumber().equals(id))
                ? "successful delete"
                : "record not found";

    }

    @GetMapping(value = "/list")
    @ResponseBody
    public List<Card> all() {
        return cards;
    }
}
