class Speaker {
    private String word;

    public void speakWord() {
        System.out.println(word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String setWord) {
        setWord= "ByeBye";
        word = setWord;
    }
}

class SpeakerClassRunner {
    public static void main(final String[] args) {
        Speaker refMorning = new Speaker();
        Speaker refDayTime = new Speaker();
        Speaker refEvening = new Speaker();

        refMorning.setWord("Good morning");
        refDayTime.setWord("Hello");
        refEvening.setWord("Good Evening"); 
        
        refMorning.speakWord();
        refDayTime.speakWord();
        refEvening.speakWord();
    }
}
