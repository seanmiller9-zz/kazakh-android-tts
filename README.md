# Kazakh Text-To-Speech for Android 

An Android Text-To-Speech Engine that will allow users to play speech audio for Kazakh words simply by highlighting the word
and selecting "Play Kazakh Speech" from the dropdown menu. Functions by converting the Kazakh Cyrillic text to a Latin-based equivalent
and then getting the Android TTS service to read out the latin text as if it was Turkish; since Kazakh and Turkish are both Turkic languages
and as such sound similar, this is a decent approximation and should prove useful to those studying the Kazakh language, trying to understand
how basic Kazakh words are pronounced before leaving on a trip to Kazakhstan, etc. 

## Getting Started 

To get the project working on your local machine for development:
1. Within Android Studio, select "Import Project from Version Control"
2. Build and run the project on either your own personal Android device or a virtual device!

## Built With

* [Android Studio](https://developer.android.com/studio/) - The obvious IDE of choice for anything Android
* [Android TextToSpeech](https://developer.android.com/reference/android/speech/tts/TextToSpeech) - Android's TextToSpeech API

## Contributing

Pull requests are welcome! Any feedback from poor audio for certain words is also welcome via 
opening an issue.

In addition, feel free to use this project as a basis for another Turkic language TTS
service for Android (or any language that's not Turkic for that matter, too!).

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* Wikipedia for presenting fantastic data on how the Kazakh Cyrillic alphabet can be converted to a Latin-based equivalent
* Kazakh learners and general linguaphiles who make creating apps like these worthwhile!
