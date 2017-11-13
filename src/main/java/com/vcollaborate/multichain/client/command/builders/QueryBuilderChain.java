/*
< * Copyright (C) 2017 Worldline, Inc.
 *
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * https://github.com/SimplyUb/MultiChainJavaAPI/blob/master/LICENSE
 *
 */
package com.vcollaborate.multichain.client.command.builders;

import com.vcollaborate.multichain.client.MultichainException;

/**
 * @author Ub - H. MARTEAU
 * @version 3.0
 */
public class QueryBuilderChain extends QueryBuilderCommon {

	protected Object executeGetInfo() throws MultichainException {
		return execute(CommandEnum.GETINFO);
	}

}
