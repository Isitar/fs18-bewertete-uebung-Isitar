package exercise

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class WarmupSpec extends Specification implements DomainUnitTest<Warmup> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
