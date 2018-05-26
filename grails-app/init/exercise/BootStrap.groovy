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
        def fallenTag = new Tag(name: "Fallen").save(failOnError: true);

        // Adding Group1 go-kyo techniques
        def deashibarai = new Technique(name: "De-ashi-barai", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "https://www.youtube.com/watch?v=I25HN3DE8hs").save(failOnError: true);
        def hizaguruma = new Technique(name: "Hiza-guruma", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=VDsiBURKj-s").save(failOnError: true);
        def sasaietsurikomiashi = new Technique(name: "Sasae-tsurikomi-ashi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=nrmtaMeVQd4").save(failOnError: true);
        def ukigoshi = new Technique(name: "Uki-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=3Fklhya3iu4").save(failOnError: true);
        def osotogari = new Technique(name: "O-soto-gari", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=gus3kezcBcM").save(failOnError: true);
        def ogoshi = new Technique(name: "O-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=jn0WObPwTqg").save(failOnError: true);
        def ouchigari = new Technique(name: "O-uchi-gari", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=6OxoWzpwezo").save(failOnError: true);
        def ipponseoinage = new Technique(name: "Ippon-seoi-nage", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=dHrSqRMC04Q").save(failOnError: true);

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
        def maeukemi = new Warmup(name: "Mae ukemi", description: "Vorwärts rolle", ytLink: "https://www.youtube.com/watch?v=HDu1zyviDis").save(failOnError: true);

        new WarmupTag(warmup: liegestuetze, tag: armeTag).save(failOnError: true);
        new WarmupTag(warmup: kniebeugen, tag: beineTag).save(failOnError: true);
        new WarmupTag(warmup: hueftekreisen, tag: huefteTag).save(failOnError: true);
        new WarmupTag(warmup: rumpfbeugen, tag: bauchTag).save(failOnError: true);
        new WarmupTag(warmup: verkehrterumpfbeugen, tag: rueckenTag).save(failOnError: true);
        new WarmupTag(warmup: halbeDrehung, tag: drehenTag).save(failOnError: true);
        new WarmupTag(warmup: baerenringen, tag: hebenTag).save(failOnError: true);
        new WarmupTag(warmup: dehnen, tag: dehnenTag).save(failOnError: true);
        new WarmupTag(warmup: maeukemi, tag: fallenTag).save(failOnError: true);

        // gokyo group 2
        def kosotogari = new Technique(name: "Kosoto-gari", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=FtLazfLYL6k").save(failOnError: true);
        def kouchigari = new Technique(name: "Kouchi-gari", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=j9DnkH-2tGg").save(failOnError: true);
        def koshiguruma = new Technique(name: "Koshi-guruma", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=vharlgzgJlA").save(failOnError: true);
        def tsurikomigoshi = new Technique(name: "Tsurikomi-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=73bThxi0q0s").save(failOnError: true);
        def okuriashibarai = new Technique(name: "Okuri-ashi-harai", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=4ug0u9a_xyE").save(failOnError: true);
        def taiotoshi = new Technique(name: "Tai-otoshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=bweEltFImMA").save(failOnError: true);
        def haraigoshi = new Technique(name: "Harai-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=WbK9COV-GpY").save(failOnError: true);
        def uchimata = new Technique(name: "Uchi-mata", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=QQjMkHGU_Ic").save(failOnError: true);

        new TechniqueTag(technique: kosotogari, tag: beineTag).save(failOnError: true);
        new TechniqueTag(technique: kouchigari, tag: beineTag).save(failOnError: true);
        new TechniqueTag(technique: koshiguruma, tag: huefteTag).save(failOnError: true);
        new TechniqueTag(technique: koshiguruma, tag: drehenTag).save(failOnError: true);
        new TechniqueTag(technique: tsurikomigoshi, tag: huefteTag).save(failOnError: true);
        new TechniqueTag(technique: tsurikomigoshi, tag: drehenTag).save(failOnError: true);
        new TechniqueTag(technique: okuriashibarai, tag: beineTag).save(failOnError: true);
        new TechniqueTag(technique: taiotoshi, tag: drehenTag).save(failOnError: true);
        new TechniqueTag(technique: haraigoshi, tag: huefteTag).save(failOnError: true);
        new TechniqueTag(technique: uchimata, tag: drehenTag).save(failOnError: true);
        new TechniqueTag(technique: uchimata, tag: huefteTag).save(failOnError: true);

        // grp 3
        def kosotogake = new Technique(name: "Kosoto-gake", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=QpE9TREP9ys").save(failOnError: true);
        def tsurigoshi = new Technique(name: "Tsuri-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=lV_HUZ9m1fQ").save(failOnError: true);
        def yokootoshi = new Technique(name: "Yoko-otoshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=PELgzOt-Dus").save(failOnError: true);
        def ashiguruma = new Technique(name: "Ashi-guruma", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=0cCsllLrClY").save(failOnError: true);
        def hanegoshi = new Technique(name: "Hane-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=TTLgAT_uEis").save(failOnError: true);
        def haraitsurikomiashi = new Technique(name: "Harai-tsurikomi-ashi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=vjwerq6UZIs").save(failOnError: true);
        def tomoenage = new Technique(name: "Tomoe-nage", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=tOIbQ2cXRHU").save(failOnError: true);
        def kataguruma = new Technique(name: "Kata-guruma", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=yD09HBiPgEU").save(failOnError: true);

        new TechniqueTag(technique: kosotogake, tag: beineTag).save(failOnError: true);
        new TechniqueTag(technique: tsurigoshi, tag: huefteTag).save(failOnError: true);
        new TechniqueTag(technique: yokootoshi, tag: armeTag).save(failOnError: true);
        new TechniqueTag(technique: ashiguruma, tag: beineTag).save(failOnError: true);
        new TechniqueTag(technique: hanegoshi, tag: huefteTag).save(failOnError: true);
        new TechniqueTag(technique: haraitsurikomiashi, tag: beineTag).save(failOnError: true);
        new TechniqueTag(technique: tomoenage, tag: beineTag).save(failOnError: true);
        new TechniqueTag(technique: kataguruma, tag: hebenTag).save(failOnError: true);
        new TechniqueTag(technique: kataguruma, tag: armeTag).save(failOnError: true);
        new TechniqueTag(technique: kataguruma, tag: bauchTag).save(failOnError: true);



        // grp 4
        def sumigaeshi = new Technique(name: "Sumi-gaeshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=-xQm8PV155s").save(failOnError: true);
        def taniotoshi = new Technique(name: "Tani-otoshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=Rfi6zRDQQRI").save(failOnError: true);
        def hanemakikomi = new Technique(name: "Hane-makikomi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=Jtkr4lcGcbA").save(failOnError: true);
        def sukuinage = new Technique(name: "Sukui-nage", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=LfBesVQaHXU").save(failOnError: true);
        def utsurigoshi = new Technique(name: "Utsuri-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=39aWDO7e0vM").save(failOnError: true);
        def oguruma = new Technique(name: "O-guruma", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=jNf08NFlaUg").save(failOnError: true);
        def sotomakikomi = new Technique(name: "Soto-makikomi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=GE8ITtd-b8Q").save(failOnError: true);
        def ukiotoshi = new Technique(name: "Uki-otoshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=X2Y1E0xjE3Y").save(failOnError: true); 3

        new TechniqueTag(technique: sumigaeshi, tag: fallenTag).save(failOnError: true);
        new TechniqueTag(technique: taniotoshi, tag: drehenTag).save(failOnError: true);
        new TechniqueTag(technique: hanemakikomi, tag: huefteTag).save(failOnError: true);
        new TechniqueTag(technique: sukuinage, tag: drehenTag).save(failOnError: true);
        new TechniqueTag(technique: utsurigoshi, tag: hebenTag).save(failOnError: true);
        new TechniqueTag(technique: oguruma, tag: huefteTag).save(failOnError: true);
        new TechniqueTag(technique: sotomakikomi, tag: drehenTag).save(failOnError: true);
        new TechniqueTag(technique: sotomakikomi, tag: bauchTag).save(failOnError: true);
        new TechniqueTag(technique: ukiotoshi, tag: huefteTag).save(failOnError: true);

        // grp 5
        def osotoguruma = new Technique(name: "Osoto-guruma", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=SnG36ufXnk0").save(failOnError: true);
        def ukiwaza = new Technique(name: "Uki-waza", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=Ue04ZUBSXoM").save(failOnError: true);
        def yokowakare = new Technique(name: "Yoko-wakare", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=hqM5LL5YkNA").save(failOnError: true);
        def yokoguruma = new Technique(name: "Yoko-guruma", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=eLcaT8HATRA").save(failOnError: true);
        def ushirogoshi = new Technique(name: "Ushiro-goshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=r31DHx-o7nc").save(failOnError: true);
        def uranage = new Technique(name: "Ura-nage", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=6Ag8Gl76BQs").save(failOnError: true);
        def sumiotoshi = new Technique(name: "Sumi-otoshi", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=uTYru2xGYcM").save(failOnError: true);
        def yokogake = new Technique(name: "Yoko-gake", techniqueType: Technique.TechniqueType.NageWaza, ytLink: "http://www.youtube.com/watch?v=ZjIL-u46po4").save(failOnError: true);

        new TechniqueTag(technique: osotoguruma, tag: beineTag).save(failOnError: true);
        new TechniqueTag(technique: ukiwaza, tag: fallenTag).save(failOnError: true);
        new TechniqueTag(technique: yokowakare, tag: fallenTag).save(failOnError: true);
        new TechniqueTag(technique: yokoguruma, tag: fallenTag).save(failOnError: true);
        new TechniqueTag(technique: ushirogoshi, tag: huefteTag).save(failOnError: true);
        new TechniqueTag(technique: uranage, tag: hebenTag).save(failOnError: true);
        new TechniqueTag(technique: sumiotoshi, tag: fallenTag).save(failOnError: true);
        new TechniqueTag(technique: yokogake, tag: beineTag).save(failOnError: true);

    }
    def destroy = {
    }
}
