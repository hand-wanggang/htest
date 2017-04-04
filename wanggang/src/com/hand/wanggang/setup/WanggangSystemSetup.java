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
package com.hand.wanggang.setup;

import static com.hand.wanggang.constants.WanggangConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.hand.wanggang.constants.WanggangConstants;
import com.hand.wanggang.service.WanggangService;


@SystemSetup(extension = WanggangConstants.EXTENSIONNAME)
public class WanggangSystemSetup
{
	private final WanggangService wanggangService;

	public WanggangSystemSetup(final WanggangService wanggangService)
	{
		this.wanggangService = wanggangService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		wanggangService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return WanggangSystemSetup.class.getResourceAsStream("/wanggang/sap-hybris-platform.png");
	}
}
