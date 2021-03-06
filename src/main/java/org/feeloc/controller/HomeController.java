package org.feeloc.controller;

import org.feeloc.dao.ReferenceDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Inject
	private ReferenceDataRepository referenceRepository;
	
	/**
	 * Prepares the Model with some metadata and the list of States retrieved
	 * from the DB. Then, selects the home view to render by returning its name.
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
		model.addAttribute("dbinfo", referenceRepository.getDbInfo());
		model.addAttribute("states", referenceRepository.findAll());
		return "home";
	}

    @RequestMapping(value="/user", method=RequestMethod.GET)
    public String user(Model model) {
        logger.info("Welcome user!");
        return "user";
    }

    @RequestMapping(value = "/404",method=RequestMethod.GET)
    public String noFound(){
        return "404";
    }

    @RequestMapping(value = "/javascriptmvc",method=RequestMethod.GET)
    public String goJavascript(){
        logger.info("Welcome javascript!");
        return "javascriptmvc";
    }
}
