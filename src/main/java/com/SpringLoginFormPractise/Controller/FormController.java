package com.SpringLoginFormPractise.Controller;

import com.SpringLoginFormPractise.VehiService.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    private Service service;

    @RequestMapping(value = "/addVehicle",method = RequestMethod.GET)
    public String getVehicles(){
        return "NumberOfVehicles";
    }

    @RequestMapping(value = "/num",method = RequestMethod.GET)
    public String numberOfVehicles(@RequestParam("name") String vehiName,
                                @RequestParam("numPlate")String numberPlate,
                                @RequestParam("number") int number, ModelMap modelMap){
        modelMap.put("name",vehiName);
        modelMap.put("numPlate",numberPlate);
        modelMap.put("number",number);
        return "Vehicles";
    }

}
