/*
 * Copyright (C) 2017 Worldline, Inc.
 *
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * https://github.com/SimplyUb/MultiChainJavaAPI/blob/master/LICENSE
 *
 */
package com.vcollaborate.multichain.client.object.formatters;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vcollaborate.multichain.client.MultichainException;
import com.vcollaborate.multichain.client.object.queryobjects.CustomParamString;

/**
 * @author Ub - H. MARTEAU
 * @version 1.1
 */
public class CustomParamFormatter extends GsonFormatters {
	public final static Map<String, String> formatCustomParamString(List<CustomParamString> customParam)
			throws MultichainException {
		Map<String, String> mapFormat = new HashMap<String, String>();

		if (customParam != null) {
			for (CustomParamString param : customParam) {
				if (param.isFilled()) {
					mapFormat.put(formatJson(param.getName()), formatJson(param.getValue()));
				}
			}
		}

		return mapFormat;
	}
}
