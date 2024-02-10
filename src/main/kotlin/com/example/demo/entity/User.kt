package com.example.demo.entity

import jakarta.persistence.*

@Entity
@Table(name = "TBUser")
data class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,

    @Column(name = "firstName")
    var firstName: String? = null,

    @Column(name = "lastName")
    var lastName: String? = null,
){
    constructor(firstName: String, lastName: String) : this(null, firstName, lastName) {
        this.firstName = firstName
        this.lastName = lastName
    }
}