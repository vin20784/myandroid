package com.example.my3dsloginapp

import java.io.Serializable

data class loginobjxfer(val uname: String, val pwd: String, var authstatus: String="UnAuthorized"):Serializable {

}