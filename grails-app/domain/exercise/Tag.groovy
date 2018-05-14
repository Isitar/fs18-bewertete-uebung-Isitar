package exercise

class Tag {
    String name;

    static hasMany = [techniqueTags: TechniqueTag, warmupTags: WarmupTag]


    static constraints = {
    }
}
