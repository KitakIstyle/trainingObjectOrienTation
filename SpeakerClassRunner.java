class Speaker {
    private String word;

    public void speakWord() {
        System.out.println(word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String setWord) {
        word = setWord;
    }
}

class SpeakerClassRunner {
    public static void main(final String[] args) {
        Speaker refMorning = new Speaker();
        Speaker refDayTime = new Speaker();
        Speaker refEvening = new Speaker();

        refMorning.setWord("ByeBye");
        refDayTime.setWord("ByeBye");
        refEvening.setWord("ByeBye"); 
        
        refMorning.speakWord();
        refDayTime.speakWord();
        refEvening.speakWord();
    }
}
