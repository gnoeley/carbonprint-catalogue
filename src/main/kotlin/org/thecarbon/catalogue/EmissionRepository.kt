package org.thecarbon.catalogue

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RestResource
import org.thecarbon.catalogue.model.Emission

@RestResource
interface EmissionRepository : CrudRepository<Emission, Long>
