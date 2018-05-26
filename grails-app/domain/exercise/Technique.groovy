package exercise

class Technique {
    static label = "Technik"
    enum TechniqueType {
        NageWaza,
        KatameWaza,
        ShimeWaza,
        KansetsuWaza,
    }

    String name;
    TechniqueType techniqueType;
    String ytLink;
    static hasMany = [techniqueTags:TechniqueTag]

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
