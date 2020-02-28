package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String skills(){

        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm(){

        return "<html>" +
                "<body>" +
                "<form action='response' method='post'>" +

                "<label for='name'>Name:</label>" +
                "<input type='text' name='name'><br><br>" +

                "<label for='favLanguage1'>My Favorite Language:</label>" +
                "<select name='favLang1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +

                "<label for='favLanguage2'>My Second Favorite Language:</label>" +
                "<select name='favLang2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +

                "<label for='favLanguage3'>My Third Favorite Language:</label>" +
                "<select name='favLang3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br><br>" +

                "<input type='submit' value='Submit'>" +

                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("response")
    public String responseToFormSubmit(@RequestParam String name, String favLang1, String favLang2, String favLang3){

        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favLang1 + "</li>" +
                "<li>" + favLang2 + "</li>" +
                "<li>" + favLang3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
