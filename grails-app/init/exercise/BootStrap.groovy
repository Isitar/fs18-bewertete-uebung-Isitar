package exercise

class BootStrap {

    def init = { servletContext ->
        // Some basic tags

        def armeTag = new Tag(name: "Arme").save(failOnError: true);
        def beineTag = new Tag(name: "Beine").save(failOnError: true);
        def huefteTag = new Tag(name: "Hüfte").save(failOnError: true);
        def bauchTag = new Tag(name: "Bauch").save(failOnError: true);
        def rueckenTag = new Tag(name: "Rücken").save(failOnError: true);
        def drehenTag = new Tag(name: "Drehen").save(failOnError: true);
        def hebenTag = new Tag(name: "Heben").save(failOnError: true);
        def dehnenTag = new Tag(name: "Dehnen").save(failOnError: true);


        // Adding Group1 go-kyo techniques
        def deashibarai = new Technique(name: "De-ashi-barai", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"https://www.youtube.com/watch?v=I25HN3DE8hs").save(failOnError: true);
        def hizaguruma = new Technique(name: "Hiza-guruma", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=VDsiBURKj-s").save(failOnError: true);
        def sasaietsurikomiashi = new Technique(name: "Sasae-tsurikomi-ashi", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=nrmtaMeVQd4").save(failOnError: true);
        def ukigoshi = new Technique(name: "Uki-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=3Fklhya3iu4").save(failOnError: true);
        def osotogari = new Technique(name: "O-soto-gari", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=gus3kezcBcM").save(failOnError: true);
        def ogoshi = new Technique(name: "O-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=jn0WObPwTqg").save(failOnError: true);
        def ouchigari = new Technique(name: "O-uchi-gari", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=6OxoWzpwezo").save(failOnError: true);
        def ipponseoinage = new Technique(name: "Ippon-seoi-nage", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=dHrSqRMC04Q").save(failOnError: true);

        new TechniqueTag(technique: deashibarai, tag: beineTag).save(failOnError: true);
        new TechniqueTag(technique: deashibarai, tag: armeTag).save(failOnError: true);


        new TechniqueTag(technique: hizaguruma, tag: armeTag).save(failOnError: true);
        new TechniqueTag(technique: hizaguruma, tag: bauchTag).save(failOnError: true);

        new TechniqueTag(technique: sasaietsurikomiashi, tag: drehenTag).save(failOnError: true);
        new TechniqueTag(technique: sasaietsurikomiashi, tag: beineTag).save(failOnError: true);
        new TechniqueTag(technique: sasaietsurikomiashi, tag: armeTag).save(failOnError: true);

        new TechniqueTag(technique: ukigoshi, tag: huefteTag).save(failOnError: true);

        new TechniqueTag(technique: osotogari, tag: beineTag).save(failOnError: true);

        new TechniqueTag(technique: ogoshi, tag: huefteTag).save(failOnError: true);

        new TechniqueTag(technique: ouchigari, tag: beineTag).save(failOnError: true);

        new TechniqueTag(technique: ipponseoinage, tag: drehenTag).save(failOnError: true);
        new TechniqueTag(technique: ipponseoinage, tag: hebenTag).save(failOnError: true);


        // adding some basic warumps 1 per tag
        def liegestuetze = new Warmup(name: "Liegestütze", description: "Lorem ipsum dolor sit amet, consetetur sadipscing elitr").save(failOnError: true);
        def kniebeugen = new Warmup(name: "Kniebeugen", description: "Lorem ipsum dolor sit amet, consetetur sadipscing elitr", ytLink: 'https://www.youtube.com/watch?v=aclHkVaku9U').save(failOnError: true);
        def hueftekreisen = new Warmup(name: "Hüfte kreisen", description: "Lorem ipsum dolor sit amet, consetetur sadipscing elitr").save(failOnError: true);
        def rumpfbeugen = new Warmup(name: "Rumpfbeugen", description: "Lorem ipsum dolor sit amet, consetetur sadipscing elitr").save(failOnError: true);
        def verkehrterumpfbeugen = new Warmup(name: "Verkehrte Rumpfbeugen", description: "Lorem ipsum dolor sit amet, consetetur sadipscing elitr").save(failOnError: true);
        def halbeDrehung = new Warmup(name: "Halbe drehung", description: "Lorem ipsum dolor sit amet, consetetur sadipscing elitr").save(failOnError: true);
        def baerenringen = new Warmup(name: "Bärenringen", description: "Lorem ipsum dolor sit amet, consetetur sadipscing elitr").save(failOnError: true);
        def dehnen = new Warmup(name: "Dehnen XY", description: "Lorem ipsum dolor sit amet, consetetur sadipscing elitr").save(failOnError: true);


        new WarmupTag(warmup: liegestuetze, tag: armeTag).save(failOnError: true);
        new WarmupTag(warmup: kniebeugen, tag: beineTag).save(failOnError: true);
        new WarmupTag(warmup: hueftekreisen, tag: huefteTag).save(failOnError: true);
        new WarmupTag(warmup: rumpfbeugen, tag: bauchTag).save(failOnError: true);
        new WarmupTag(warmup: verkehrterumpfbeugen, tag: rueckenTag).save(failOnError: true);
        new WarmupTag(warmup: halbeDrehung, tag: drehenTag).save(failOnError: true);
        new WarmupTag(warmup: baerenringen, tag: hebenTag).save(failOnError: true);
        new WarmupTag(warmup: dehnen, tag: dehnenTag).save(failOnError: true);

        // gokyo group 2
        new Technique(name: "Kosoto-gari", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=FtLazfLYL6k").save(failOnError: true);
        new Technique(name: "Kouchi-gari", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=j9DnkH-2tGg").save(failOnError: true);
        new Technique(name: "Koshi-guruma", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=vharlgzgJlA").save(failOnError: true);
        new Technique(name: "Tsurikomi-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=73bThxi0q0s").save(failOnError: true);
        new Technique(name: "Okuri-ashi-harai", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=4ug0u9a_xyE").save(failOnError: true);
        new Technique(name: "Tai-otoshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=bweEltFImMA").save(failOnError: true);
        new Technique(name: "Harai-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=WbK9COV-GpY").save(failOnError: true);
        new Technique(name: "Uchi-mata", techniqueType: Technique.TechniqueType.NageWaza, ytLink:"http://www.youtube.com/watch?v=QQjMkHGU_Ic").save(failOnError: true);



    }
    def destroy = {
    }
}
