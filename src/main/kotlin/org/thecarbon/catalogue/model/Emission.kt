@file:Suppress("JpaObjectClassSignatureInspection")

package org.thecarbon.catalogue.model

import javax.persistence.Embeddable
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "emissions")
data class Emission(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Enumerated(EnumType.STRING)
    val type: Type,

    @Embedded
    val amount: Amount
)

@Embeddable
data class Amount(
    @Enumerated(EnumType.STRING)
    val unit: Units,

    val value: Double
)

enum class Type {
    CO2
}

enum class Units {
    KG
}
