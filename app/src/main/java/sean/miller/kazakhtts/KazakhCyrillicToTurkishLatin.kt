package sean.miller.kazakhtts

/**
 * Created by sean_ on 2018-08-10.
 */

class KazakhCyrillicParser {
    private val writingSystemConversionMap: Map<String, String> = hashMapOf(
            "a" to "a",
            "ә" to "ä",
            "б" to "b",
            "в" to "v",
            "г" to "g",
            "ғ" to "ğ",
            "д" to "d",
            "е" to "e",
            "ё" to "yo",
            "ж" to "j",
            "з" to "z",
            "и" to "ï",
            "й" to "y",
            "к" to "k",
            "қ" to "q",
            "л" to "l",
            "м" to "m",
            "н" to "n",
            "ң" to "ñ",
            "о" to "o",
            "ө" to "ö",
            "п" to "p",
            "р" to "r",
            "с" to "s",
            "т" to "t",
            "у" to "w",
            "ұ" to "u",
            "ү" to "ü",
            "ф" to "f",
            "х" to "h",
            "һ" to "h",
            "ц" to "ts", // important: must consider "ts" at beginning of word
            "ч" to "ç",
            "ш" to "ş",
            "щ" to "şş",
            "ъ" to "\'",
            "ы" to "ı",
            "і" to "i",
            "ь" to "\'",
            "э" to "é",
            "ю" to "yu",
            "я" to "ya"
    )

    fun parseCyrillicIntoLatin(textCyrillic: String): String {
        if (textCyrillic.isEmpty()) {
            return ""
        }

        var textLatin: String = ""

        for (letter in textCyrillic) {
            if (writingSystemConversionMap.containsKey<String>(letter as String)) {
                textLatin = textLatin.plus(writingSystemConversionMap[letter])
            }
            else {
                textLatin = textLatin.plus((textCyrillic))
            }
        }

        return textLatin
    }
}