package dssc.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UnicodeToHtmlTextConverter {

    private String fullFilenameWithPath;

    public UnicodeToHtmlTextConverter(String fullFilenameWithPath) {
        this.fullFilenameWithPath = fullFilenameWithPath;
    }

    public String convertToHtml() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fullFilenameWithPath));

        String line = reader.readLine();
        String html = "";
        while (line != null) {
            html += StringEscapeUtils.escapeHtml(line);
            html += "<br />";
            line = reader.readLine();
        }
        return html;

    }

    public String getFilename() {
        return this.fullFilenameWithPath;
    }
}
