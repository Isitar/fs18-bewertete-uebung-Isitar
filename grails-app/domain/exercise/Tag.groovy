package exercise

class Tag {
    String name;

    static hasMany = [techniqueTags: TechniqueTag, warmupTags: WarmupTag]

    static constraints = {
        name unique: true, nullable: false
    }

    @Override
    String toString() {
        return this.name;
    }
}
