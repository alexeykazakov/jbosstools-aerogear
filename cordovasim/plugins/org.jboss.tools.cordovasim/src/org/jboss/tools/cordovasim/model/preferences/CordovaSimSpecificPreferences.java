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
package org.jboss.tools.cordovasim.model.preferences;

import org.eclipse.swt.graphics.Point;
import org.jboss.tools.browsersim.ui.model.preferences.SpecificPreferences;

/**
 * @author Konstantin Marmalyukov (kmarmaliykov)
 */
public class CordovaSimSpecificPreferences extends SpecificPreferences{
	private Point cordovaBrowserSize;
	private Point cordovaBrowserLocation;
	private boolean showUnsupportedPluginsPopUp;
	private String ripplePreferences;
	
	public CordovaSimSpecificPreferences(String selectedDeviceId, boolean useSkins, boolean enableLiveReload, int liveReloadPort, boolean enableTouchEvents,
			int orientationAngle, Point location, Point cordovaBrowserLocation, Point cordovaBrowserSize, boolean isJavaFx, boolean showUnsupportedPluginsPopUp, String ripplePreferences) {
		super(selectedDeviceId, useSkins, enableLiveReload, liveReloadPort, enableTouchEvents, orientationAngle, location, isJavaFx);
		this.cordovaBrowserLocation = cordovaBrowserLocation;
		this.cordovaBrowserSize = cordovaBrowserSize;
		this.showUnsupportedPluginsPopUp = showUnsupportedPluginsPopUp;
		this.ripplePreferences = ripplePreferences;
	}

	public Point getCordovaBrowserLocation() {
		return cordovaBrowserLocation;
	}

	public void setCordovaBrowserLocation(Point cordovaBrowserLocation) {
		this.cordovaBrowserLocation = cordovaBrowserLocation;
	}

	public Point getCordovaBrowserSize() {
		return cordovaBrowserSize;
	}

	public void setCordovaBrowserSize(Point cordovaBrowserSize) {
		this.cordovaBrowserSize = cordovaBrowserSize;
	}
	
	public boolean showUnsupportedPluginsPopUp() {
		return showUnsupportedPluginsPopUp;
	}

	public void setShowUnsupportedPluginsPopUp(boolean showUnsupportedPluginsPopUp) {
		this.showUnsupportedPluginsPopUp = showUnsupportedPluginsPopUp;
	}
	
	@Override
	public void copyProperties(SpecificPreferences sp) {
		super.copyProperties(sp);
		if (sp instanceof CordovaSimSpecificPreferences) {
			setCordovaBrowserLocation(((CordovaSimSpecificPreferences) sp).getCordovaBrowserLocation());
			setCordovaBrowserSize(((CordovaSimSpecificPreferences) sp).getCordovaBrowserSize());
			setShowUnsupportedPluginsPopUp(((CordovaSimSpecificPreferences) sp).showUnsupportedPluginsPopUp());
			setRipplePreferences(((CordovaSimSpecificPreferences) sp).getRipplePreferences());
		}
	}

	public String getRipplePreferences() {
		return ripplePreferences;
	}

	public void setRipplePreferences(String ripplePreferences) {
		this.ripplePreferences = ripplePreferences;
	}

}
