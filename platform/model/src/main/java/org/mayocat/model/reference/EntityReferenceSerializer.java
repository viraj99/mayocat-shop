package org.mayocat.model.reference;

import org.xwiki.component.annotation.Role;

/**
 * @version $Id$
 */
@Role
public interface EntityReferenceSerializer
{
    String serialize(EntityReference reference);
}