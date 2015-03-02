/*******************************************************************************
 * Copyright (c) 2007-2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.cordovasim;

import org.jboss.tools.browsersim.ui.util.NLS;

/**
 * @author Ilya Buziuk (ibuziuk)
 */
public class Messages {
	private static final String BUNDLE_NAME = Messages.class.getName().toString().toLowerCase();

	public static String CordovaSim_CORDOVA_SIM;
	public static String CordovaSimManageDevicesDialog_UNSUPPORTED_PLUGINS;
	public static String CordovaSimManageDevicesDialog_UNSUPPORTED_PLUGINS_CHECKBOX;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}