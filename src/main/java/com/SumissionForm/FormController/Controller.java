package com.SumissionForm.FormController;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public String customerData(){
        System.out.println();
        return "Customer";
    }

    //method puts data to ViewCustomer.jsp and displays it
    @RequestMapping(value = "/addCustomers",method = RequestMethod.POST)
    public String viewDetails(@RequestParam("cid") String cid,
                              @RequestParam("cname") String cname,
                              @RequestParam("cemail") String cemail, ModelMap modelMap){
        modelMap.put("cid",cid);
        modelMap.put("cname",cname);
        modelMap.put("cemail",cemail);

        return "ViewCustomer";
    }
}
