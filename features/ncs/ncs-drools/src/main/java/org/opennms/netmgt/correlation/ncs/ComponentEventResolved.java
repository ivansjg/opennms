/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2012 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2012 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.correlation.ncs;

public class ComponentEventResolved {
	
	private ComponentDownEvent m_cause;
	private ComponentUpEvent m_resolution;
	
	public ComponentEventResolved(ComponentDownEvent cause, ComponentUpEvent resolution) {
		m_cause = cause;
		m_resolution = resolution;
	}

	public ComponentDownEvent getCause() {
		return m_cause;
	}

	public void setCause(ComponentDownEvent cause) {
		m_cause = cause;
	}

	public ComponentUpEvent getResolution() {
		return m_resolution;
	}

	public void setResolution(ComponentUpEvent resolution) {
		m_resolution = resolution;
	}

	@Override
	public String toString() {
		return "Resolved[ " +
				"cause=" + m_cause + 
				", resolution="
				+ m_resolution + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_cause == null) ? 0 : m_cause.hashCode());
		result = prime * result
				+ ((m_resolution == null) ? 0 : m_resolution.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComponentEventResolved other = (ComponentEventResolved) obj;
		if (m_cause == null) {
			if (other.m_cause != null)
				return false;
		} else if (!m_cause.equals(other.m_cause))
			return false;
		if (m_resolution == null) {
			if (other.m_resolution != null)
				return false;
		} else if (!m_resolution.equals(other.m_resolution))
			return false;
		return true;
	}
	
	


}