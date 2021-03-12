var SpeechRecognition = SpeechRecognition || webkitSpeechRecognition
var SpeechGrammarList = SpeechGrammarList || webkitSpeechGrammarList
var SpeechRecognitionEvent = SpeechRecognitionEvent || webkitSpeechRecognitionEvent

var colors = [ 'aqua' , 'azure' , 'beige', 'bisque', 'black', 'blue', 'brown', 'chocolate', 'coral'];

var grammar = '#JSGF v1.0; grammar colors; public <color>='+colors.join(' | ')+' ;'


var recognition = new SpeechRecognition();
var speechRecognitionList = new SpeechGrammarList();

speechRecognitionList.addFromString(grammar, 1);

recognition.grammars = speechRecognitionList;
recognition.continuous = false;
recognition.lang = 'en-US';
recognition.interimResults = false;
recognition.maxAlternatives = 1;

var diagnostic = document.querySelector('.output');
var bg = document.querySelector('html');



document.body.onclick = function() {
    recognition.start();
    console.log('Ready to receive a color command.');
  }

  recognition.onresult = function(event) {
    var color = event.results[0][0].transcript;
    diagnostic.textContent = 'Result received: ' + color + '.';
    bg.style.backgroundColor = color;
    console.log('Confidence: ' + event.results[0][0].confidence);
  }

  recognition.onnomatch = function(event) {
    diagnostic.textContent = "I didn't recognise that color.";
  }

  recognition.onerror = function(event) {
    diagnostic.textContent = 'Error occurred in recognition: ' + event.error;
  }
