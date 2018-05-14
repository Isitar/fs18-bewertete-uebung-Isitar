package exercise

class TechniqueTag {
    static belongsTo = [technique: Technique, tag: Tag]
    static constraints = {
    }
}
