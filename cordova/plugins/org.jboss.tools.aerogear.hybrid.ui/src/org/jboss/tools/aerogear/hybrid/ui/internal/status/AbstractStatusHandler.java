/*******************************************************************************
 * Copyright (c) 2013,2014 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.aerogear.hybrid.ui.internal.status;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;

public abstract class AbstractStatusHandler {
	
	public abstract void handle(IStatus status);
	
	public abstract void handle(CoreException e);

}
