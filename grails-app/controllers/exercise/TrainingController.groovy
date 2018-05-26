package exercise

class TrainingController {

    def index() {

        def  techniques  = Technique.findAll();
        return [techniques: techniques]
    }

    def warmups() {

    }
}
