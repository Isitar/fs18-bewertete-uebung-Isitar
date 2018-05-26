package exercise

class TechniqueTag {
    static belongsTo = [technique: Technique, tag: Tag]
    static constraints = {
    }

    @Override
    String toString() {
        return technique.toString() + " | " + tag.toString();
    }
}
