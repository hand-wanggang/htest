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
package com.hand.wanggangfrontend.setup;

import static com.hand.wanggangfrontend.constants.WanggangfrontendConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.hand.wanggangfrontend.constants.WanggangfrontendConstants;
import com.hand.wanggangfrontend.service.WanggangfrontendService;


@SystemSetup(extension = WanggangfrontendConstants.EXTENSIONNAME)
public class WanggangfrontendSystemSetup
{
	private final WanggangfrontendService wanggangfrontendService;

	public WanggangfrontendSystemSetup(final WanggangfrontendService wanggangfrontendService)
	{
		this.wanggangfrontendService = wanggangfrontendService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		wanggangfrontendService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return WanggangfrontendSystemSetup.class.getResourceAsStream("/wanggangfrontend/sap-hybris-platform.png");
	}
}
