package com.conamobile.pdpgridtorecycleview.model

class Member(var profile:Int, var fullname:String) {

    override fun toString(): String {
        return "$profile : $fullname"
    }
}