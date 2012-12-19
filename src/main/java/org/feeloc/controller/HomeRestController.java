package org.feeloc.controller;

import org.feeloc.dao.ReferenceDataRepository;
import org.feeloc.vo.State;
import org.feeloc.vo.StateList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/rest")
public class HomeRestController {

    @Autowired
    private ReferenceDataRepository referenceRepository;

    @RequestMapping(value = "/home", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public
    @ResponseBody
    StateList listAllMembers() {
        StateList stateList = new StateList();
        List<State> statelist = referenceRepository.findAll();
        stateList.setCount(statelist.size());
        stateList.setStateList(statelist);
        return stateList;
    }

}
