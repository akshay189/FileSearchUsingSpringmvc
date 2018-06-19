package com.java.springPractice;

import com.wavemaker.filesearch.SearchEntry;
import com.wavemaker.filesearch.WordSearch;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


@Controller
public class ServletSpringExample {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ModelAndView get() {
        System.out.println("IN GET");
        return new ModelAndView("bigboss");
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ModelAndView post(@ModelAttribute("input") Input input) {
        ModelAndView modelAndView = new ModelAndView("show");
        modelAndView.addObject("message", "testing");
        if (validate(input)) {
            WordSearch wordSearch = new WordSearch();
            try {
                wordSearch.searchWord(input.getFolder_path(), input.getSearch_key(), Integer.parseInt(input.getThread_count()), Boolean.parseBoolean(input.getSequential()));
                Map<String, List<SearchEntry>> output = wordSearch.getResult();
                modelAndView.addObject("map", output);
            } catch (Exception ex) {
                throw new RuntimeException("Exception caused due to threads");
            }
        } else {
            ModelAndView errorView = new ModelAndView("errorView");
            errorView.addObject("message", "Invalid Inputs");
            return errorView;
        }
        return modelAndView;
    }

    private boolean validate(Input input) {
        if (input.getFolder_path() == null || input.getFolder_path().equals("") || input.getSearch_key().equals("") || input.getSearch_key() == null || input.getThread_count().equals("") || input.getThread_count() == null) {
            return false;
        }
        return true;
    }
}
