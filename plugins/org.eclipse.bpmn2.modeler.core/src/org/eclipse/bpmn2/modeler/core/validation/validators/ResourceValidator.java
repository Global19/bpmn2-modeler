/*******************************************************************************
 * Copyright (c) 2011, 2012, 2013, 2014 Red Hat, Inc.
 *  All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 *
 * @author Bob Brodt
 ******************************************************************************/

package org.eclipse.bpmn2.modeler.core.validation.validators;

import org.eclipse.bpmn2.Resource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.IValidationContext;

/**
 *
 */
public class ResourceValidator extends AbstractBpmn2ElementValidator<Resource> {

	/**
	 * Construct a BPMN2 Element Validator from a Validation Context.
	 *
	 * @param ctx
	 */
	public ResourceValidator(IValidationContext ctx) {
		super(ctx);
	}

	/**
	 * Construct a BPMN2 Element Validator with the given Validator as the parent.
	 * The parent is responsible for collecting all of the validation Status objects
	 * and reporting them back to the Validation Constraint.
	 *
	 * @param parent a parent Validator class
	 */
	@SuppressWarnings("rawtypes")
	public ResourceValidator(AbstractBpmn2ElementValidator parent) {
		super(parent);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.bpmn2.modeler.core.validation.validators.AbstractBpmn2ElementValidator#validate(org.eclipse.bpmn2.BaseElement)
	 */
	@Override
	public IStatus validate(Resource object) {
		if (isEmpty(object.getName()))
			addMissingFeatureStatus(object,"name",Status.ERROR);
		return getResult();
	}

}

