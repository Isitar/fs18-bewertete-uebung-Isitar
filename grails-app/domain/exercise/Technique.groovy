package exercise

class Technique {
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
        techniqueType ordinal: true
        ytLink url: true
    }

    @Override
    String toString() {
        return this.name;
    }
}
