package org.eclipse.store.storage.types;

/*-
 * #%L
 * EclipseStore Storage
 * %%
 * Copyright (C) 2023 MicroStream Software
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

public interface StorageHousekeepingExecutor
{

	public boolean performIssuedFileCleanupCheck(long nanoTimeBudget);
	
	public boolean performIssuedGarbageCollection(long nanoTimeBudget);
	
	public boolean performIssuedEntityCacheCheck(long nanoTimeBudget, StorageEntityCacheEvaluator evaluator);
	
	
	public boolean performFileCleanupCheck(long nanoTimeBudget);
	
	public boolean performGarbageCollection(long nanoTimeBudget);
	
	public boolean performEntityCacheCheck(long nanoTimeBudget);
	
}
