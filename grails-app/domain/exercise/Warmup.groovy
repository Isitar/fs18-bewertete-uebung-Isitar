package exercise

class Warmup {

    String name;
    String description;
    String ytLink;
    static hasMany = [warmupTags:WarmupTag]

    static constraints = {
        name nullable: false
        description nullable: false
        ytLink url: true, nullable: true
    }
    @Override
    String toString() {
        return this.name;
    }
}
