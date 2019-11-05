package com.glqdlt.hellogroovy

class Main {
    static void main(String[] args) {
        PersonImmutable jhun = new PersonImmutable("jhun")
        println(jhun)
        println jhun
        println "jhun"
        println "$jhun.name"
        println "${jhun}.name"
        println "$jhun"
        println """
            Nice To Meet
                    You $jhun.name
        This is loooong
    Text~~
~~~
"""
        PersonJavaClass aClass = new PersonJavaClass();
        aClass.name = "aClass"
        println "$aClass.name"

        PersonJavaClass bClass = new PersonJavaClass();
        bClass.setName "bClass"
        println bClass.getName()
        println(bClass.getName())

        Person person = new Person()
        person.name = "aa"
        person.gender = 1
        println person.name
        println person.gender

    }
}
