package exercise

import org.springframework.context.MessageSourceResolvable

class Technique {
    static label = "Technik"
    enum TechniqueType implements MessageSourceResolvable {
        NageWaza,
        KatameWaza,
        ShimeWaza,
        KansetsuWaza

        //EXTERNAL https://tedvinke.wordpress.com/2012/08/22/grails-scaffolding-enums-and-i18n/
        public Object[] getArguments() { [] as Object[] }
        public String[] getCodes() { [ name() ] }
        public String getDefaultMessage() {  name() }
    }

    String name;
    TechniqueType techniqueType;
    String ytLink;
    static hasMany = [techniqueTags: TechniqueTag]

    static constraints = {
        id unique: true
        name()
        techniqueType ordinal: true
        ytLink url: true
    }

    @Override
    String toString() {
        return this.name;
    }
}
