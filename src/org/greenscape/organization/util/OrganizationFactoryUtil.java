package org.greenscape.organization.util;

import org.greenscape.organization.OrganizationModel;
import org.greenscape.organization.impl.OrganizationModelImpl;

public class OrganizationFactoryUtil {
	public static OrganizationModel createOrganisationModel() {
		OrganizationModelImpl model = new OrganizationModelImpl();
		return model;
	}
}
