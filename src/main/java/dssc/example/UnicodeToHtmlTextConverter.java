package dssc.example;

import java.io.IOException;

public class UnicodeToHtmlTextConverter {

    private TextReader reader;

    public UnicodeToHtmlTextConverter(TextReader reader) {
        this.reader = reader;
    }

    public String convertToHtml() throws IOException {
        String line = reader.readLine();
        String html = "";
        while (line != null) {
            html += StringEscapeUtils.escapeHtml(line);
            html += "<br />";
            line = reader.readLine();
        }
        return html;

    }

}
