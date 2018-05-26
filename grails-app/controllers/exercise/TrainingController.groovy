package exercise

import java.util.stream.*;

class TrainingController {

    static allowedMethods = [warmups: "POST"]

    def index() {

        def  techniques  = Technique.findAll([sort: "name"]);
        return [techniques: techniques]
    }

    def warmups() {
        def techniqueIds = request.JSON
        def techniques = new ArrayList<Technique>();

        for( techniqueId in techniqueIds) {
            techniques.add(Technique.findById(techniqueId));
        }

        // find warmups for posted techniques
        def warmups = techniques
                .stream()
                .flatMap({t->t.techniqueTags.stream()})
                .map({techniqueTag -> techniqueTag.tag})
                .distinct()
                .flatMap({tag->tag.warmupTags.stream()})
                .map({warmupTag -> warmupTag.warmup})
                .distinct()
                .collect(Collectors.toList());

        return [techniques: techniques, warmups: warmups]
    }
}
