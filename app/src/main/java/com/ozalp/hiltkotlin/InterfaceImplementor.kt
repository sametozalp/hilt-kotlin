package com.ozalp.hiltkotlin

import javax.inject.Inject

class InterfaceImplementor
@Inject constructor() : MyInterface {

    override fun printFunc(): String {
        return "My Interface"
    }
}