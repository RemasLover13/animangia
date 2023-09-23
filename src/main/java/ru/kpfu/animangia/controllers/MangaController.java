package ru.kpfu.animangia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.animangia.models.Manga;
import ru.kpfu.animangia.services.impl.MangaService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/manga")
public class MangaController {
    @Autowired
    private MangaService mangaService;
    private List<Manga> mangaList = new ArrayList<>();


    @GetMapping("new_main/manga")
    public String manga(Model model) {
        mangaList = mangaService.findAll();
        model.addAttribute("mangaList", mangaList);
        return "manga";
    }

    @PostMapping("new_main/manga/add")
    public String addManga(@ModelAttribute Manga manga) {
        mangaList.add(manga);
        return "redirect:/manga";
    }

    @GetMapping("/manga/delete/{index}")
    public String deleteManga(@PathVariable int index) {
        if (index >= 0 && index < mangaList.size()) {
            mangaList.remove(index);
        }
        return "redirect:/manga";
    }

}
