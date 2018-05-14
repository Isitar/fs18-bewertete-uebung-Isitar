package exercise

class Warmup {

    String name;
    String description;
    String ytLink;
    static hasMany = [warmupTags:WarmupTag]

    static constraints = {
        ytLink url: true
    }
}
