package com.example.JavaDHomework13.note;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/list")
    public ModelAndView notesList() {
        ModelAndView result = new ModelAndView("all-notes");
        result.addObject("notes", noteService.listAll());
        return result;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        return new ModelAndView("create");
    }

    @PostMapping("/create")
    public ModelAndView create(
            @RequestParam(value = "title") String title,
            @RequestParam(value = "content") String content) {
        Note newNote = new Note();
        newNote.setTitle(title);
        newNote.setContent(content);
        noteService.add(newNote);
        return notesList();
    }

    @GetMapping("/edit")
    public ModelAndView showEditForm(@RequestParam(value = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("note", noteService.getById(id));
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView editNote(
            @RequestParam(value = "id") Long id,
            @RequestParam(value = "title") String title,
            @RequestParam(value = "content") String content) {
        Note updatedNote = new Note();
        updatedNote.setId(id);
        updatedNote.setTitle(title);
        updatedNote.setContent(content);
        noteService.update(updatedNote);
        return notesList();
    }


    @PostMapping("/delete")
    public ModelAndView update(
            @RequestParam(value = "id") Long id) {
        noteService.deleteById(id);
        return notesList();
    }

}