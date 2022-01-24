public class Programming {
    private String language;
    private boolean learningComplete = false;

    public Programming(String language) {
        this.language = language;
    }

    public void learningStatus() {
        if (learningComplete) {
            System.out.println("Mastered " + language);
        } else {
            System.out.println("Learning " + language);
        }
    }

    public void completeLearning() {
        learningComplete = true;
    }
}
