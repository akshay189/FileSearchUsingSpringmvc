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
public class WordSearchController {


    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public ModelAndView accessDeniedMethod()
    {
        ModelAndView modelAndView = new ModelAndView("accessDenied");
        modelAndView.addObject("message","You cannot access this url 403 forbidden");
        return modelAndView;
    }
    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public ModelAndView testAdmin()
    {
        ModelAndView modelAndView = new ModelAndView("testAdmin");
        modelAndView.addObject("message","You are admin");
        return modelAndView;
    }
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ModelAndView post(@ModelAttribute("input") Input input) {
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("message", "Search Result: ");
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
        return input.getFolder_path() != null && !input.getFolder_path().equals("") && !input.getSearch_key().equals("") && input.getSearch_key() != null && !input.getThread_count().equals("") && input.getThread_count() != null;
    }
}
