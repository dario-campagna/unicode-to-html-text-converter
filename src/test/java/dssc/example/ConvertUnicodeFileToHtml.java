package dssc.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertUnicodeFileToHtml {

    @Test
    public void emptyFile() throws Exception {
        String filePath = getClass().getClassLoader().getResource("empty.txt").getPath();
        UnicodeToHtmlTextConverter textConverter = new UnicodeToHtmlTextConverter(filePath);

        String html = textConverter.convertToHtml();

        assertEquals("", html);
    }

    @Test
    public void fileWithText() throws Exception {
        String path = getClass().getClassLoader().getResource("unicodeText.txt").getPath();
        UnicodeToHtmlTextConverter textConverter = new UnicodeToHtmlTextConverter(path);

        String html = textConverter.convertToHtml();

        assertEquals("a<br />b &amp; c<br />", html);
    }

}
