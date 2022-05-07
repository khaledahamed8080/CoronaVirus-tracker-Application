package com.example.coronatracker.Controller;

import java.util.List;

import com.example.coronatracker.Models.LocationStats;
import com.example.coronatracker.Service.CoronaDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    CoronaDataService coronaDataService;
    

    @GetMapping("/")
    public String home( Model model){
        List<LocationStats> allStats=coronaDataService.getAllStats();
        int totalReportedCases= allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases=allStats.stream().mapToInt(stat->stat.getDifffromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return "home";
    }
}

