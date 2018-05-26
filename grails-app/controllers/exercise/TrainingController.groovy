package exercise

class TrainingController {

    static allowedMethods = [warmups: "POST"]

    def index() {

        def  techniques  = Technique.findAll();
        return [techniques: techniques]
    }

    def warmups() {
        def techniqueIds = request.JSON
        render(techniqueIds);
    }
}
