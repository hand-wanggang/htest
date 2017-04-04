/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.hand.wanggangfrontend.controller;

import static com.hand.wanggangfrontend.constants.WanggangfrontendConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hand.wanggangfrontend.service.WanggangfrontendService;


@Controller
public class WanggangfrontendHelloController
{
	@Autowired
	private WanggangfrontendService wanggangfrontendService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", wanggangfrontendService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
