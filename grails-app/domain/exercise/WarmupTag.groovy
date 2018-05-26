package exercise

class WarmupTag {

    static belongsTo = [warmup: Warmup, tag: Tag]
    static constraints = {
    }

    @Override
    String toString() {
        return warmup.toString() + " | " + tag.toString();
    }
}
