package com.example

import groovy.transform.CompileStatic
import spock.lang.Specification

class WrongResolutionSpec extends Specification {

    @CompileStatic
    def "groovy - compile static - should not error"() {
        when:
        new StepBuilder().chunk().listener(new MyListener())

        then:
        noExceptionThrown()
    }

    def "groovy - dynamic - should not error"() {
        when:
        new StepBuilder().chunk().listener(new MyListener())

        then:
        noExceptionThrown()
    }

    def "java - implementing type"() {
        when:
        new JavaResolution().testWithImplementingType()

        then:
        noExceptionThrown()
    }

    def "java - interface type"() {
        when:
        new JavaResolution().testWithInterfaceType()

        then:
        noExceptionThrown()
    }
}
