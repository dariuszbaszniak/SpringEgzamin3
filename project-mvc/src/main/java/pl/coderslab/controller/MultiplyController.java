package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MultiplyController {

    @GetMapping("/multiply/{size}")
    public String getMultiplySize(Model model, @PathVariable Integer size) {

        model.addAttribute("size", size);
        return "multiply";
    }

    @GetMapping("/multiply2/{sizeA}/{sizeB}")
    public String getMultiplySize(Model model, @PathVariable Integer sizeA, @PathVariable Integer sizeB) {

        model.addAttribute("sizeA", sizeA);
        model.addAttribute("sizeB", sizeB);
        return "multiply2";
    }

}
