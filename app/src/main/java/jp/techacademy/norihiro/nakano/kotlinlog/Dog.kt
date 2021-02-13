package jp.techacademy.norihiro.nakano.kotlinlog

import android.util.Log

open class Dog: Animal, Moveable {

    constructor(name: String, age: Int): super(name, age){
    }

    override fun say(){
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った")
    }
}