package org.foo

class Title implements Serializable {
    final int LENGTH_STRING_TITLE = 70
    final String TITLE_SPEC_SYMBOL = '='

    def generateTitle (String stage) {

        int numberSpecSymbolsPart = (LENGTH_STRING_TITLE - stage.length() - 2) / 2

        return "${TITLE_SPEC_SYMBOL * numberSpecSymbolsPart} $stage ${TITLE_SPEC_SYMBOL * numberSpecSymbolsPart}"
    }

    def titleStage(String stage) {
        //https://en.wikipedia.org/wiki/ANSI_escape_code
        return "\033[34m${generateTitle(stage)}\033[0m"
    }
}
