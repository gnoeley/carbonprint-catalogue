package org.thecarbon.catalogue.model

import javax.persistence.*

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
