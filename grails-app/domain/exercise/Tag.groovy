package exercise

class Tag {
    String name;

    static hasMany = [techniqueTags: TechniqueTag, warmupTags: WarmupTag]

    static constraints = {
        name unique: true
    }

    @Override
    String toString() {
        return this.name;
    }
}
