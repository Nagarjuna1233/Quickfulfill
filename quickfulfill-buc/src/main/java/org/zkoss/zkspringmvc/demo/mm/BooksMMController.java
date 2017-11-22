/* BooksController.java

	Purpose:
		
	Description:
		
	History:
		5:53 PM 11/9/15, Created by jumperchen

Copyright (C) 2015 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zkspringmvc.demo.mm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This class only for initial demo .
 * 
 * @author 1194-Techouts
 * @since 14-12-2016
 */
@Controller
@RequestMapping("/mm/books")
public class BooksMMController {

	@RequestMapping(value ="/demo", method = RequestMethod.GET)
    private String demo(){
    	return "mvvm/demo.zul";
    }
}

