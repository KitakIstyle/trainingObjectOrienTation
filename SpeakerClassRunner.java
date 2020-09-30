class Speaker {

    String word;

}

class SpeakerClassRunner {
    public static void main(final String[] args) {
        Speaker refMorning = new Speaker();
        Speaker refDayTime = new Speaker();
        Speaker refEvening = new Speaker();

        refMorning.word = "Good morning";
        refDayTime.word = "Hello";
        refEvening.word = "Good Evening";

        System.out.println(refMorning.word + "\n" + refDayTime.word + "\n" + refEvening.word);    
    }

}