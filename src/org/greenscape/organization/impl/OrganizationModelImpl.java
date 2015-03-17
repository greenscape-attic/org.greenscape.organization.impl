package org.greenscape.organization.impl;

import javax.persistence.Entity;

import org.greenscape.organization.OrganizationModel;
import org.greenscape.persistence.PersistedModelBase;

@Entity(name = OrganizationModel.MODEL_NAME)
public class OrganizationModelImpl extends PersistedModelBase implements
		OrganizationModel {
	private static final long serialVersionUID = -2392049292137025175L;

	public OrganizationModelImpl() {
	}

	public OrganizationModelImpl(OrganizationModelImpl model) {
		setActive(model.isActive());
		setHomeURL(model.getHomeURL());
		setLogoId(model.getLogoId());
		setMaxUsers(model.getMaxUsers());
		setCreatedDate(model.getCreatedDate());
		setModifiedDate(model.getModifiedDate());
		setName(model.getName());
		setOrganizationId(model.getOrganizationId());
	}

	@Override
	public String getName() {
		return (String) getProperty(NAME);
	}

	@Override
	public OrganizationModel setName(String name) {
		setProperty(NAME, name);
		return this;
	}

	@Override
	public String getHomeURL() {
		return (String) getProperty(HOME_URL);
	}

	@Override
	public OrganizationModel setHomeURL(String homeURL) {
		setProperty(HOME_URL, homeURL);
		return this;
	}

	@Override
	public Long getLogoId() {
		return (Long) getProperty(LOGO_ID);
	}

	@Override
	public OrganizationModel setLogoId(Long logoId) {
		setProperty(LOGO_ID, logoId);
		return this;
	}

	@Override
	public Integer getMaxUsers() {
		return (Integer) getProperty(MAX_USERS);
	}

	@Override
	public OrganizationModel setMaxUsers(Integer maxUsers) {
		setProperty(MAX_USERS, maxUsers);
		return this;
	}

	@Override
	public Boolean isActive() {
		return (Boolean) getProperty(ACTIVE);
	}

	@Override
	public OrganizationModel setActive(Boolean active) {
		setProperty(ACTIVE, active);
		return this;
	}

}
