package Hw06;

public class Tsk2 {

    public class HiddenWord {
        private String hidden;

        public HiddenWord(String hiddenWord) {
            hidden = hiddenWord;
        }

        public String getHint(String guess) {
            String hint = "";
            int length = hidden.length();

            for (int i = 0; i < length; i++) {
                char guessChar = guess.charAt(i);
                char hiddenChar = hidden.charAt(i);

                if (guessChar == hiddenChar) {
                    hint += guessChar;
                } else {
                    boolean exists = false;
                    for (int j = 0; j < length; j++) {
                        if (j != i && hidden.charAt(j) == guessChar) {
                            exists = true;
                            break;
                        }
                    }
                    hint += exists ? "+" : "*";
                }
            }

            return hint;
        }
    }
}
