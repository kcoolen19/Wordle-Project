 /**
  * This class provides a sample list of 5-letter words for use in the Wordle game.
  */
public class WordleList {

    // A predefined array of 5-letter words for testing the functionality of the Wordle game
    private final String[] words = {
        "apple", "brave", "chair", "dream", "eagle", "frost", "glory", "heart", "jelly", "lemon",
        "ample", "blaze", "canny", "douse", "feral", "glint", "hasty", "inert", "jolly", "knack",
        "acrid", "beret", "cleft", "ethos", "foyer", "ghoul", "hoard", "impel", "joust", "lurid",
        "aspen", "birch", "coral", "dunes", "fjord", "grove", "oasis", "petal", "river", "thrum",
        "angst", "banal", "creed", "ethic", "fable", "geist", "honor", "quirk", "realm", "vigor",
        "annex", "brood", "chasm", "decry", "eclat", "fines", "gusto", "heist", "ichor", "kiosk",
        "alibi", "broke", "crypt", "dross", "elfin", "flair", "grasp", "hovel", "lithe", "quota",
        "adapt", "build", "chase", "dodge", "enter", "forge", "hover", "pryer", "smirk", "tread",
        "acute", "bough", "caper", "drift", "epoch", "fuzzy", "glare", "hinge", "inner", "jovial",
        "adorn", "bluff", "crave", "ebbed", "flume", "guile", "ivory", "lapse", "opine", "zesty"
    };
    
    /**
     * This method retrieves the predefined array of 5-letter words for the Wordle game.
     * @return a String array of 5-letter words
     */
    public String[] getWords() {
        return this.words;
    }
}
