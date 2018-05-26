package exercise

import java.util.stream.*;

class TrainingController {

    static allowedMethods = [warmups: "POST"]

    def index() {

        def  techniques  = Technique.findAll();
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
                .map({t -> t.techniqueTags})
                .collect(Collectors.toList())
                .flatten()
                .stream()
                .map({techniqueTag -> techniqueTag.tag})
                .distinct()
                .map({tag -> tag.warmupTags})
                .collect(Collectors.toList())
                .flatten()
                .stream()
                .map({warmupTag -> warmupTag.warmup})
                .distinct()
                .collect(Collectors.toList());

        return [techniques: techniques, warmups: warmups]
    }
}
