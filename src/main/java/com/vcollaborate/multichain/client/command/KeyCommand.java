/*
 * Copyright (C) 2017 Worldline, Inc.
 *
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * https://github.com/SimplyUb/MultiChainJavaAPI/blob/master/LICENSE
 *
 */
package com.vcollaborate.multichain.client.command;

import com.vcollaborate.multichain.client.MultichainException;
import com.vcollaborate.multichain.client.command.builders.QueryBuilderKey;

/**
 * @author Ub - H. MARTEAU
 * @version 3.0
 */
public class KeyCommand extends QueryBuilderKey {
	public KeyCommand(String ip, String port, String login, String password) {
		initialize(ip, port, login, password);
	}

	public Object getPrivkey(String privkey) throws MultichainException {
		return executeDumpPrivkey(privkey);
	}
	
	public Object importPrivkey(String privkey) throws MultichainException {
		return executeImportPrivkey(privkey);
	}

}
