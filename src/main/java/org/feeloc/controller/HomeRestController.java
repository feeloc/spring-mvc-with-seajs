package org.feeloc.controller;

import org.feeloc.dao.ReferenceDataRepository;
import org.feeloc.vo.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/rest")
public class HomeRestController {

    @Autowired
	private ReferenceDataRepository referenceRepository;

    @RequestMapping(value = "/home",method=RequestMethod.GET, produces="application/json")
    public @ResponseBody List<State> listAllMembers()
    {
        return  referenceRepository.findAll();
    }

}
