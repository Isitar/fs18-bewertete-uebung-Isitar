package exercise

class WarmupTag {

    static belongsTo = [warmup: Warmup, tag: Tag]
    static constraints = {
    }
}
