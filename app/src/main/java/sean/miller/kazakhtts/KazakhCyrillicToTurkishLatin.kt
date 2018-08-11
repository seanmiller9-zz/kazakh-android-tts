/**
 *
 * Copyright (c) 2018 Sean Miller
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package sean.miller.kazakhtts

import java.nio.charset.CharacterCodingException

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

        var textLatin = ""

        for (letter in textCyrillic) {
            textLatin = when (writingSystemConversionMap.containsKey<String>(Character.toString(letter))) {
                true -> textLatin.plus(writingSystemConversionMap[Character.toString(letter)])
                false -> textLatin.plus((textCyrillic))
            }
        }

        return textLatin
    }
}